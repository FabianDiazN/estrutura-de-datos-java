package listas.circulares.doblemente.enlazada.pkg14;

public class Lista_CD {
    protected Nodo cabeza,fin;
    public Lista_CD (){
        cabeza= null;
        fin = null;

}

 public Lista_CD insetarCabezaLista(int entrada){
        
    Nodo nuevo;
    nuevo = new Nodo(entrada);
   nuevo.adelante=cabeza;
   if(cabeza !=null){
       cabeza.atras = nuevo;
   }else fin =nuevo;
   cabeza=nuevo;
   fin.adelante=cabeza;
   cabeza.atras=fin;
   return this;
   
           
   }
 public Lista_CD insertarFinLista(int entrada){
     Nodo nuevo;
     nuevo = new Nodo(entrada);
     nuevo.atras=fin;
     if(fin !=null)
         fin.adelante=nuevo;
     else cabeza=nuevo;
     fin = nuevo;
     fin.adelante=cabeza;
     cabeza.atras=fin;
     return this;
     
             
 }
  
    
public void visualizarCabezaFin(){
        Nodo n;
        n = cabeza;
        if (fin !=null){
            do{
                System.out.println(n.dato + " ");
                n= n.adelante;
            }while(n != cabeza);
        }
}
public void visualizarFinCabeza(){
    Nodo n;
    n = fin;
    if(fin !=null){
        do{
            System.out.println(n.dato + " ");
            n = n.atras;
        }while ( n != fin);
    }
}
public void eliminarInicio(){
    Nodo actual;
    actual=cabeza;
    if(actual !=null){
        if(actual.adelante !=null){
            cabeza = actual.adelante;
            actual.adelante.atras = fin;
            fin.adelante=cabeza;
        }
        else{
            cabeza=null;
            fin=null;
        }
        System.out.println("Dato eliminado" + actual.dato + " ");
       actual = null;
    }else
        System.out.println("Lista Vacia");
}
        public void eliminarFinal(){
            Nodo actual;
            actual=fin;
            if(actual !=null){
                if(actual.atras !=fin){
                    fin=actual.atras;
                    actual.atras.adelante=cabeza;
                    cabeza.atras=fin;
                }else{
                    cabeza=null;
                    fin=null;
                }
System.out.println("Dato eliminado" +actual.dato+" ");
actual=null;
           
                }else 
                System.out.println("Lista Vacia");
            }
public Lista_CD insertarDespues(int testigo,int entrada){
               Nodo nuevo,anterior;
               nuevo = new Nodo(entrada);
               anterior=buscarListaDespues(testigo);
               nuevo.adelante=anterior.adelante;
               anterior.adelante.atras=nuevo;
               anterior.adelante=nuevo;
               nuevo.atras=anterior;
               if(anterior==fin)
                   fin=nuevo;
               return this;
               
             }      

public Nodo buscarListaDespues(int destino){
    Nodo indice;
    indice=cabeza;
    do{
        indice=indice.adelante;
        if(destino==indice.dato)
            return indice;
        
    }while(indice !=cabeza);
    return null;
}
public Lista_CD insertarAntes(int testigo,int entrada){
    Nodo nuevo,anterior;
    nuevo = new Nodo(entrada);
    anterior=buscarListaAntes(testigo);
    nuevo.atras=anterior.atras;
    anterior.atras.adelante=nuevo;
    anterior.atras=nuevo;
    nuevo.adelante=anterior;
    if(anterior==cabeza)
        cabeza=nuevo;
    return this ;
                
}
public Nodo buscarListaAntes( int destino){
    Nodo indice ;
    indice=fin;
    do{
        indice=indice.atras;
        if(destino==indice.dato)
                return indice;
    

    } while (indice!=fin);
    return null;
    
}
public void eliminar(int entrada){
    Nodo actual;
    boolean encontrado=false;
    actual=cabeza;
    //bucle de busqueda//
    while((actual !=fin)&&(!encontrado)){
        encontrado=(actual.dato==entrada);
        if(!encontrado)
            actual=actual.adelante;
    }
    if(actual !=null){
        if(actual==cabeza){
            if(actual.adelante !=cabeza){
                cabeza=actual.adelante;
                actual.adelante.atras=fin;
                fin.adelante=cabeza;        
            }else {
                cabeza=null;
                fin=null;
            }
        }
        else if    (actual.adelante !=cabeza){
           actual.atras.adelante=actual.adelante;
           actual.adelante.atras=actual.atras;
           
        }
        else{
            actual.atras.adelante=cabeza;
            cabeza.atras=fin;
 
        }
        actual=null;
    }}
}
    


package listas.circulares.doblemente.enlazada.pkg14;

import java.util.Scanner;

public class ListasCircularesDoblementeEnlazada14 {

    public static void main(String[] args) {


        Lista_CD x=new Lista_CD();
        int opcion;
        String dato;
        String dato4;
        String dato5;
        
        Scanner teclado=new Scanner(System.in);
      
System.out.println("Lista Cicular Doblemnete enlazada");

do{
System.out.println("////////////////////////\\");
System.out.println("1.insertar cabeza      /\\");
System.out.println("2.insertar fin         /\\");
System.out.println("3.ver cabezaFin        /\\");
System.out.println("4.ver finCabeza        /\\");
System.out.println("5.eliminar inicio      /\\");
System.out.println("6.eliminar final       /\\");
System.out.println("7.insertar despues     /\\");
System.out.println("8.insertar antes       /\\");
System.out.println("9.eliminar dato        /\\");
System.out.println("////////////////////////\\");
opcion=teclado.nextInt();
switch(opcion){
    case 1:
    dato=teclado.next();
int num = Integer.parseInt(dato);
    x.insetarCabezaLista(num);
    break;
case 2:
    dato5=teclado.next();
int num5 = Integer.parseInt(dato5);
    x.insertarFinLista(num5);
    break;   
case 3:
 x.visualizarCabezaFin();
break; 
case 4:///////////////////////////////////
    x.visualizarFinCabeza();
    break;
case 5://////////////////////////////////////
     x.eliminarInicio();
    break;
case 6:///////////////////////////////////
     x.eliminarFinal();
    break;
case 7://///////////////////////////////
     int opcion3 = Integer.parseInt(teclado.next());
int num3 = Integer.parseInt(teclado.next());
    x.insertarDespues(opcion3, num3);
    break;
case 8://///////////////////////////////
    int opcion2 = Integer.parseInt(teclado.next());
int num2 = Integer.parseInt(teclado.next());
x.insertarAntes(opcion2, num2);
    break;
case 9:////////////////////////////
    dato4=teclado.next();
int num4 = Integer.parseInt(dato4);
    x.eliminar(num4);
    break;
}}while(opcion!=10);}
}



package listas.circulares.doblemente.enlazada.pkg14;

public class Nodo {
    int dato;
    Nodo adelante;
    Nodo atras;
    public Nodo(int x){
        dato = x;
        adelante=atras=null;
        
    }
    public int getDato(){
        return dato; }
    public Nodo getAdelante(){
        return adelante;}
    public Nodo getAtras(){
        return atras;
    }
    public void setAdelante(Nodo adelante){
        this.adelante=adelante;}
    public void setAtras(Nodo atras){
        this.atras=atras;
    }
    }
        