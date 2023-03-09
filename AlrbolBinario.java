ackage arbol.binario;


public class Arbol_binario {
    protected Nodo raiz;
    public Arbol_binario(){
        raiz=null;
        
    }
    public Arbol_binario(Nodo raiz){
       this.raiz=raiz;
       {
       this.raiz=raiz;
       
    }
    }
   Nodo raizArbol(){
       
        return raiz;
        
    }
boolean esVacio(){
        return raiz == null;
    
}
public static Nodo nuevoArbol(Nodo ramaIzqda,Object dato,Nodo ramaDcha){
        return new Nodo(ramaIzqda,dato,ramaDcha);
    
}
       public static int numNodos(Nodo raiz )
       {
           if(raiz==null)
               return 0;
      else
               return 1+numNodos(raiz.subarbolIzdo())+numNodos(raiz.subarbolDrcho());
           
           
       }
       public static void preorden (Nodo r){
           if(r !=null){
               System.out.println(r.dato+" ");
               preorden( r.subarbolIzdo());
               preorden(r.subarbolDrcho());
           }
       }
     public static void posorden (Nodo r){
         if(r !=null){
               posorden(r.subarbolIzdo());
              posorden(r.subarbolDrcho());
              System.out.println(r.dato + "");
              
         }
     }
     public static  void inorden(Nodo r){
         if(r !=null){
             inorden(r.subarbolIzdo());
             System.out.println(r.dato +"");
             inorden(r.subarbolDrcho());
         }
     }
     public static void postorden(Nodo r){
         if(r !=null){
             posorden(r.subarbolIzdo());
             posorden(r.subarbolDrcho());
             System.out.println(r.dato + "");
              
         }
     }
     
      }
    

* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.binario;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class Nodo {
    protected Object dato;
    protected Object izdo;
    protected Object dhco;
    public Nodo(Object valor){
        dato = valor;
        izdo=dhco = null;
    }
    public Nodo(Nodo ramaIzdo,Object valor,Nodo ramaDchp){
        dato = valor;
        izdo=ramaIzdo;
        dhco=ramaDchp;
        
    }
    public Object valorNodo(){
    
   return dato;
    }
    
    public Nodo  subarbolIzdo(){
        return (Nodo) izdo;
    }
    public Nodo subarbolDrcho(){
        return (Nodo) dhco;
    }
    public void nuevoValor(Object d){
        dato = d;
    }
    public void ramaIzdo(Nodo n)
    {izdo=n;
    
    }
    public void ramaDcho(Nodo n){
        dhco=n;
        
    }

    public static void main(String[] args) {
Arbol_binario arbol;
        Nodo a1,a2,a;
        Pila pila=new Pila();
        a1=Arbol_binario.nuevoArbol(null,"Maria",null);
        a2=Arbol_binario.nuevoArbol(null,"Rodrigo",null);
        a=Arbol_binario.nuevoArbol(a1,"Esperanza",a2);
        pila.insertar(a);
        a1=Arbol_binario.nuevoArbol(null,"Anyora",null);
        a2=Arbol_binario.nuevoArbol(null,"Abel",null);
        a=Arbol_binario.nuevoArbol(a1,"M Jesus",a2);
        pila.insertar(a);
        a2=(Nodo)pila.quitar();
        a1=(Nodo)pila.quitar();
        a=Arbol_binario.nuevoArbol(a1,"Nicolas",a2);
        arbol=new Arbol_binario(a);
        System.out.println("Preorden");
        Arbol_binario.preorden(a);
        System.out.print(" \n");
         System.out.println("Inorden");
        Arbol_binario.inorden(a);
        System.out.print(" \n");
         System.out.println("Postorden");
        Arbol_binario.postorden(a);
        System.out.print(" \n");
        System.out.print(Arbol_binario.numNodos(a));
    }
       
    }




package arbol.binario;
import java.util.Vector;
public class Pila {
    
    private static  final int INICIAL =19;
    private int cima;
    private Vector listaPila;
    
    public Pila(){
    cima=-1;
    listaPila=new Vector(INICIAL);
    }
    public void insertar(Object elemento){
        cima++;
        listaPila.addElement(elemento);
    }
    public Object quitar(){
        Object aux;
        aux=listaPila.elementAt(cima);
        cima--;
        return aux;
    }
    public boolean pilaVacia(){
        return cima == -1;
    
        
    }
    
}