package lista_doble;

/**
 *
 * @author USER Fabian Diaz 
 */
public class EntradaR {
    protected Nodo cabeza, fin;
    public EntradaR(){
        cabeza=null;
        fin=null;
        
    }
    public EntradaR insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.adelante=cabeza;
        if(cabeza !=null)
            cabeza.atras=nuevo;
        else
            fin=nuevo;
            cabeza=nuevo;
        return this;
    }
    public EntradaR insertarFinLista(int entrada){
       Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.atras=fin;
        if(fin !=null)
            fin.adelante=nuevo;
        else cabeza=nuevo;
            fin=nuevo;
        return this;
    }
    public void visualizarCabezaFin(){
        Nodo n;
        n=cabeza;
        while(n !=null){
            System.out.print(n.dato+"\n ");
            n=n.adelante;
        }
    }
public void Nodo(){
    int n=0;
    Nodo reco = cabeza;
    while(reco !=null){
        n++;
        reco=reco.adelante;
        if(cabeza == null){
            System.out.println("\n\t Pila vacia");
            break;
        }
    } System.out.println("Cantidad de nodos"+n);
    if(cabeza == null){
      System.out.println("\n\t Pila vacia");
     
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
            System.out.print("\nDato eliminado"+actual.dato+"\n ");
                actual=null;
        }else
            System.out.print("/nLista vacia");
    }
   public void eliminarFinal(){
       Nodo actual;
       actual=fin;
       if(actual !=null){
           if(cabeza==fin)cabeza=null;
           fin=actual.atras;
           if(actual.atras !=null)
               actual.atras.adelante=null;
               System.out.print("\nDato eliminado"+actual.dato+"\n ");
               actual=null;
           }else
               System.out.print("\nLista vacia");
   }
   public void eliminarTodo(){
       while(cabeza !=null){
           eliminarInicio();
           eliminarFinal();
       }
   }
   public EntradaR insertarDespues(int testigo, int entrada){
       Nodo nuevo, anterior;
       nuevo=new Nodo(entrada);
       anterior=buscarListaDespues(testigo);
       nuevo.adelante=anterior.adelante;
       if(anterior.adelante !=null)
           anterior.adelante.atras=nuevo;
           anterior.adelante=nuevo;
           nuevo.atras=anterior;
           return this;
   }
   public Nodo buscarListaAntes(int destino){
       Nodo indice;
       for(indice=fin; indice!=null; indice=indice.atras)
           if(destino==indice.dato)
               return indice;
           return null;
   }
   public EntradaR insertarAntes(int testigo, int entrada){
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
   public Nodo buscarListaDespues(int destino){
      Nodo indice;
       for(indice=cabeza; indice!=null; indice=indice.adelante)
           if(destino==indice.dato)
               return indice;
           return null; 
   }
  public void eliminar(int entrada){
      Nodo actual;
      boolean encontrado=false;
      actual=cabeza;
      while((actual !=null)&&(!encontrado)){
          encontrado=(actual.dato==entrada);
          if(!encontrado)
              actual=actual.adelante;
          }
      
          if(actual !=null){
              if(actual==cabeza){
                  if(cabeza==fin)fin=null;
                  cabeza=actual.adelante;
              if(actual.adelante !=null)
                  actual.adelante.atras=null;
              }else
                  if(actual.adelante !=null){
                      actual.atras.adelante=actual.adelante;
                      actual.adelante.atras=actual.atras;
                  }else{
                      fin=actual.atras;
                      actual.atras.adelante=null;
                  }actual=null;
                  }}
}

package lista_doble;

import java.util.Scanner;

/**
 *
 * @author ITESME
 */
public class Lista_Doble {

    
    public static void main(String[] args) {
        EntradaR x=new EntradaR();
        SalidaR y=new SalidaR();
        int opcion;
        String dato;
        String dato2;
        String dato3;
        Scanner teclado=new Scanner(System.in);
System.out.println("Bicolas");
do{
System.out.println("--------------------------------------------------------------------------------");
System.out.println("Entrada Restringida:                                                           / ");
System.out.println("1.insertar fin                                                                 / ");
System.out.println("2.eliminar inicio                                                              / ");
System.out.println("3.eliminar final                                                               / ");
System.out.println("4.eliminar Todo                                                                / ");
System.out.println("5.mostrar                                                                      / ");
System.out.println("6.nodos                                                                        / ");                                                                     
System.out.println("---------------------------------------------------------------------------------");
System.out.println("Entrada Restringida:                                                           / ");
System.out.println("7.insertar inicio                                                              / ");
System.out.println("8.insertar fin                                                                 / ");
System.out.println("9.eliminar inicio                                                              / ");
System.out.println("10.eliminar Todo                                                               / ");
System.out.println("11.mostrar                                                                     / ");
System.out.println("12.nodos                                                                       /");
System.out.println("---------------------------------------------------------------------------------");
opcion=teclado.nextInt();
switch(opcion){
case 1:
    dato=teclado.next();
    int num = Integer.parseInt(dato);
    x.insertarFinLista(num);
    break;
case 2:
    x.eliminarInicio();
    break;
case 3:
    x.eliminarFinal();
    break;
case 4:
    x.eliminarTodo();
    break;
case 5:
    x.visualizarCabezaFin();
    break;
case 6:
    x.Nodo();
    break;   

case 7:
    dato2=teclado.next();
    int num2 = Integer.parseInt(dato2);
    y.insertarCabezaLista2(num2);
    break;
case 8:
    dato3=teclado.next();
    int num3 = Integer.parseInt(dato3);
    y.insertarFinLista2(num3);
    break;
case 9:
     y.eliminarInicio2();
    break;
case 10:
    y.eliminarTodo2();
    break;
case 11:
    y.visualizarCabezaFin2();
    break;
case 12:
    y.Nodo2();
    break;
    }}while(opcion!=13);}}

package lista_doble;

/**
 *
 * @author ITESME
 */
public class Nodo {
    int dato;
    Nodo adelante;
    Nodo atras;
    
    public Nodo(int x){
        dato=x;
        adelante = atras = null;
    }
    public int getDato(){
        return dato;
    }
    public Nodo getAdelante(){
        return adelante;
    }
    public Nodo getAtras(){
        return atras;
    }
    public void setAdelante(Nodo adelante){
        this.adelante = adelante;
    }
    public void setAtras(Nodo atras){
        this.atras = atras;
    }
}


package lista_doble;

/**
 *
 * @author ITESME
 */
public class SalidaR {
    protected Nodo cabeza, fin;
    public SalidaR(){
        cabeza=null;
        fin=null;
        
    }
    public SalidaR insertarCabezaLista2(int entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.adelante=cabeza;
        if(cabeza !=null)
            cabeza.atras=nuevo;
        else
            fin=nuevo;
            cabeza=nuevo;
        return this;
    }
    public SalidaR insertarFinLista2(int entrada){
       Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.atras=fin;
        if(fin !=null)
            fin.adelante=nuevo;
        else cabeza=nuevo;
            fin=nuevo;
        return this;
    }
    public void visualizarCabezaFin2(){
        Nodo n;
        n=cabeza;
        while(n !=null){
            System.out.print(n.dato+"\n ");
            n=n.adelante;
        }
    }
public void Nodo2(){
    int n=0;
    Nodo reco = cabeza;
    while(reco !=null){
        n++;
        reco=reco.adelante;
        if(cabeza == null){
            System.out.println("\n\t Pila vacia");
            break;
        }
    } System.out.println("Cantidad de nodos"+n);
    if(cabeza == null){
      System.out.println("\n\t Pila vacia");
     
    }
}
    public void eliminarInicio2(){
        Nodo actual;
        actual=cabeza;
        if(actual !=null){
            if(cabeza==fin)fin=null;
            cabeza=actual.adelante;
            if(actual.adelante !=null)
                actual.adelante.atras=null;
            System.out.print("\nDato eliminado"+actual.dato+"\n ");
                actual=null;
        }else
            System.out.print("/nLista vacia");
    }
   public void eliminarFinal2(){
       Nodo actual;
       actual=fin;
       if(actual !=null){
           if(cabeza==fin)cabeza=null;
           fin=actual.atras;
           if(actual.atras !=null)
               actual.atras.adelante=null;
               System.out.print("\nDato eliminado"+actual.dato+"\n ");
               actual=null;
           }else
               System.out.print("\nLista vacia");
   }
   public void eliminarTodo2(){
       while(cabeza !=null){
           eliminarInicio2();
           eliminarFinal2();
       }
   }
   public SalidaR insertarDespues2(int testigo, int entrada){
       Nodo nuevo, anterior;
       nuevo=new Nodo(entrada);
       anterior=buscarListaDespues2(testigo);
       nuevo.adelante=anterior.adelante;
       if(anterior.adelante !=null)
           anterior.adelante.atras=nuevo;
           anterior.adelante=nuevo;
           nuevo.atras=anterior;
           return this;
   }
   public Nodo buscarListaAntes2(int destino){
       Nodo indice;
       for(indice=fin; indice!=null; indice=indice.atras)
           if(destino==indice.dato)
               return indice;
           return null;
   }
   public SalidaR insertarAntes2(int testigo, int entrada){
       Nodo nuevo,anterior;
       nuevo=new Nodo(entrada);
       anterior=buscarListaAntes2(testigo);
       nuevo.atras=anterior.atras;
       if(anterior.atras !=null)
           anterior.atras.adelante=nuevo;
           anterior.atras=nuevo;
           nuevo.adelante=anterior;
       return this;
   }
   public Nodo buscarListaDespues2(int destino){
      Nodo indice;
       for(indice=cabeza; indice!=null; indice=indice.adelante)
           if(destino==indice.dato)
               return indice;
           return null; 
   }
  public void eliminar2(int entrada){
      Nodo actual;
      boolean encontrado=false;
      actual=cabeza;
      while((actual !=null)&&(!encontrado)){
          encontrado=(actual.dato==entrada);
          if(!encontrado)
              actual=actual.adelante;
          }
      
          if(actual !=null){
              if(actual==cabeza){
                  if(cabeza==fin)fin=null;
                  cabeza=actual.adelante;
              if(actual.adelante !=null)
                  actual.adelante.atras=null;
              }else
                  if(actual.adelante !=null){
                      actual.atras.adelante=actual.adelante;
                      actual.adelante.atras=actual.atras;
                  }else{
                      fin=actual.atras;
                      actual.atras.adelante=null;
                  }actual=null;
                  }}
}

