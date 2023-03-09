
package listas.doblemente.enlazadas.pkg12;

import org.omg.PortableInterceptor.NON_EXISTENT;

public class Lista_Doble {
    protected  Nodo cabeza,fin;
    public Lista_Doble(){
        cabeza=null;
        fin=null;
    }

public Lista_Doble insertarCabezaLista(int entrada){
    Nodo nuevo;
    nuevo=new Nodo(entrada);
    nuevo.adelante=cabeza;
    if(cabeza != null)
    cabeza.atras=nuevo;
else
    fin = nuevo;
    cabeza=nuevo;
       return this;
    }
public Lista_Doble insertarFinLista(int entrada){
    Nodo nuevo;
    nuevo = new Nodo(entrada);
    nuevo.atras=fin;
    if(fin !=null)
        fin.adelante=nuevo;
    else
        cabeza=nuevo;
        fin=nuevo;
    return this;
     }
    public void visualizaeCabezaFin(){
        Nodo n;
        n=cabeza;
        while(n !=null){
            System.out.println(n.dato + " ");
            n = n.adelante;
        }
        }
    public void visualizarFinCabeza(){
        Nodo n;
        n=fin;
        while(n !=null){
            System.out.println(n.dato + "");
            n=n.atras;
        }
    }
    public void eliminarInicio(){
        Nodo actual;
        actual=cabeza;
        if(actual !=null){
            if(cabeza==fin)fin=null;
            cabeza=actual.adelante;
            if(actual.adelante !=null)
                actual.adelante.atras=null;
            System.out.println("Dato eliminado" +actual.dato + "");
            actual=null;
        }else
            System.out.println("Lista Vacia");
        
        }
    public void eliminarFinal(){
        Nodo actual;
        actual=fin;
        if(actual !=null){
            if(cabeza==fin)cabeza=null;
           fin=actual.atras;
           if(actual.atras !=null){
               actual.atras.adelante=null;
               System.out.println("Dato eliminado" + actual.dato + "");
               actual=null;
           }else
               System.out.println("Lista Vacia");
           }
        }
    
         public Lista_Doble insertarDespues(int testigo,int entrada){
             Nodo nuevo,anterior;
             nuevo = new Nodo(entrada);
             anterior=buscarListaDespues(testigo);
             nuevo.adelante=anterior.adelante;
             if(anterior.adelante !=null)
                 anterior.adelante.atras=nuevo;
             anterior.adelante=nuevo;
             nuevo.atras=anterior;
             return this;
         }
  public Nodo buscarListaDespues(int destino){
    Nodo indice;
    for(indice = cabeza; indice!=null; indice= indice.adelante)
     if(destino==indice.dato){;
    return indice;
     }return null;
  }

 public Lista_Doble insertarAntes(int testigo,int entrada){
Nodo nuevo,anterior;
nuevo=new Nodo(entrada);
anterior=buscarListaAntes(testigo);
nuevo.atras=anterior.atras;
if(anterior.atras !=null)
anterior.atras.adelante=nuevo;
anterior.atras=nuevo;
nuevo.adelante=anterior;
 return this;
         }

 public Nodo buscarListaAntes(int destino){
 Nodo indice;
 for(indice=fin; indice!=null;indice=indice.atras)
     if(destino==indice.dato)
         return indice;
         return null;
         
}
 public void eliminar (int entrada){
     Nodo actual;
     boolean encontrado=false;
     actual=cabeza;
     while((actual !=null) && (! encontrado) ){
         encontrado=(actual.dato==entrada);
         if(!encontrado)
             actual=actual.adelante;
     }
     if(actual != null){
if(actual==cabeza ){
    if(cabeza==fin)fin=null;
    cabeza=actual.adelante;
    if(actual.adelante != null)
        actual.adelante.atras=null;
    else if(actual.adelante !=null){
        actual.atras.adelante=actual.adelante;
        actual.adelante.atras=actual.atras;
                
                
    }else
        actual.atras.adelante=null;
        actual=null;    
                
    }
                
}                    
     }
             
 }
         
 
 

             
             
              
         
       
package listas.doblemente.enlazadas.pkg12;

import java.util.Scanner;

public class ListasDoblementeEnlazadas12 {

    public static void main(String[] args) {
Lista_Doble lista_Doble;
Lista_Doble y =new Lista_Doble();
        int opcion;
        String dato1;
        String dato2;
        String dato3;
        String dato4;
        String dato5;
        Scanner teclado=new Scanner(System.in);
      
System.out.println("Lista Doblemente enlazada");
do{
System.out.println("\n1.insertar antes");
System.out.println("\n2.insertar cabeza");
System.out.println("\n3.insertar despues");
System.out.println("\n4.visualizarFinCabeza");
System.out.println("\n5.visualizaeCabezaFin");
System.out.println("\n6.eliminar");
System.out.println("\n7.eliminar final");
System.out.println("\n8.eliminar inicio");
System.out.println("\n9.Insertar Final ");
opcion=teclado.nextInt();
  System.out.println("Ingresa un dato:");
switch(opcion){
case 1:
int opcion2 = Integer.parseInt(teclado.next());
dato2=teclado.next();
int num2 = Integer.parseInt(dato2);
y.insertarAntes(opcion, num2);
break;
case 2:
    dato1=teclado.next();
int num = Integer.parseInt(dato1);
    y.insertarCabezaLista(num);
    break;
case 3:
    int opcion3 = Integer.parseInt(teclado.next());
dato3=teclado.next();
int datos3 = Integer.parseInt(dato3);
    y.insertarDespues(opcion3, datos3);
    break;
case 4:
    y.visualizarFinCabeza();
    break;
case 5:
    y.visualizaeCabezaFin();
    break;
case 6:
    int opcion4 = Integer.parseInt(teclado.next());
dato4=teclado.next();
int datos4 = Integer.parseInt(dato4);
    y.eliminar(datos4);
    break;
case 7:
    y.eliminarFinal();
    break;
case 8:
    y.eliminarInicio();
    break;
case 9:
    y.insertarFinLista(Integer.parseInt(teclado.next())); 
    break;
}}while(opcion!=10);}
}

    


    


package listas.doblemente.enlazadas.pkg12;

public class Nodo {
    int dato;
    Nodo adelante;
    Nodo atras;
    public Nodo(int x){
        dato=x;
        adelante=atras=null;
    }
    public int getDato(){
        return dato;}
    public Nodo GetAdelante(){
        return adelante;}
    public Nodo GetAtras(){
        return atras;}
    public void setAdelante(Nodo adelante){
       this.adelante=adelante;}
    public void setAtras(Nodo atras){
        this.atras=atras;
    }
 
    }
    