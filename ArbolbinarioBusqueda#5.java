package ejercicio_tema3.pkg5.arbol_binario_de_busqueda;

import java.util.Scanner;

/**
 *
 * @author USER: Fabian Diaz
 */
public class Arbol_Binario_de_Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        arboles_bb Arbol = new arboles_bb();
        Arbol.insertar(40, "1°");
        Arbol.insertar(60, "2°");
        Arbol.insertar(20, "30°");
        Arbol.insertar(10, "40°");
        Arbol.insertar(30, "5°");
        Arbol.insertar(50, "6°");
        Arbol.insertar(70, "7°");
        Arbol.insertar(45, "8°");
        Arbol.insertar(55, "9°");
        Arbol.insertar(54, "10°");
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Arbol Binario Balanceado");
        do {
            System.out.println("\n1. Insertar");
            System.out.println("2. Recorrido en Preorden");
            System.out.println("3. Recorrido en Orden");
            System.out.println("4. Recorrido en Postorden");
            System.out.println("5. Buscar nodo");
            System.out.println("6. Eliminar nodo");
            System.out.println("7. Cantidad de nodos");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el numero y el nombre del nodo: ");

                    Arbol.insertar(Integer.parseInt(teclado.next()), teclado.next());
                    break;
                case 2:
                    Arbol.preorden(Arbol.raiz);
                    break;
                case 3:
                    Arbol.inorden(Arbol.raiz);
                    break;
                case 4:
                    Arbol.postorden(Arbol.raiz);
                    break;
                case 5:
                    System.out.println("Escribe el numero del nodo a buscar");
                    System.out.println(Arbol.buscar(Integer.parseInt(teclado.next())));
                    break;
                case 6:
                    System.out.println("Escribe el numero del nodo a eliminar ");
                    Arbol.eliminar(Integer.parseInt(teclado.next()));
                    break;
                case 7:
                    System.out.print(Arbol.numNodos(Arbol.raiz));
                    break;
            }
        } while (opcion != 10);
        teclado.close();
    }
}

package ejercicio_tema3.pkg5.arbol_binario_de_busqueda;

/**
 *
 * @author  USER: Fabian Diaz 
 */
public class Nodo {
protected int dato;
protected String nombre;
protected Nodo izdo; 
protected Nodo dcho;
public Nodo(int valor, String nom){
dato = valor;
nombre= nom;
izdo = dcho = null;}
 public Nodo(Nodo ramaIzdo, int valor,Nodo ramaDcho){
        dato=valor;
        izdo=ramaIzdo;
        dcho=ramaDcho;
    }
// operaciones de acceso 
public int valorNodo() { return dato; }
public Nodo subarbolIzdo(){ return izdo; } 
public Nodo subarbolDcho(){ return dcho; } 
public void nuevoValor(int d){ dato = d; } 
public void ramaIzdo(Nodo n) { izdo = n; } 
public void ramaDcho(Nodo n){ dcho = n; }
public String toString() {return "nombre del nodo: " + nombre + " valor del nodo: " + dato;}
    
}
package ejercicio_tema3.pkg5.arbol_binario_de_busqueda;

/**
 *
 * @author  USER: Fabian Diaz 
 */
public class arboles_bb { 
    protected Nodo raiz;
    public arboles_bb(){
        raiz=null;
    }
    public arboles_bb(Nodo raiz){
        this.raiz=raiz;
    }
    public Nodo raizArbol(){
        return raiz;
    }
    
    boolean esVacio(){
        return raiz==null;
    }
    public static Nodo nuevoArbol(Nodo ramaIzqda,int dato,Nodo ramaDrcha){
        return new Nodo(ramaIzqda,dato,ramaDrcha);
    }
    public static int numNodos(Nodo raiz){
        if(raiz==null)
            return 0;
        else
            return 1+numNodos(raiz.subarbolIzdo())+
                     numNodos(raiz.subarbolDcho());
    }
    public static void preorden(Nodo r){
        if(r!=null){
            System.out.print(r.dato+" ");
            preorden(r.subarbolIzdo());
            preorden(r.subarbolDcho());
        }
    }
  public static void inorden(Nodo r){
        if(r!=null){
            inorden(r.subarbolIzdo());
            System.out.print(r.dato+" ");
            inorden(r.subarbolDcho());
        }
    }
  public static void postorden(Nodo r){
        if(r!=null){            
            postorden(r.subarbolIzdo());
            postorden(r.subarbolDcho());
            System.out.print(r.dato+" ");
        }
    }
// Metodo interfaz de operacion
public void insertar (int valor, String nom)throws Exception{
raiz=insertar(raiz, valor, nom);}
// Metodo recursivo interno
protected Nodo insertar (Nodo raizSub, int dato, String nom) throws Exception{
if (raizSub == null)
raizSub = new Nodo(dato, nom);
else if (dato<raizSub.valorNodo()){
Nodo iz;
iz = insertar (raizSub.subarbolIzdo(), dato, nom);
raizSub.ramaIzdo(iz);
} else if (dato>raizSub.valorNodo()) {
Nodo dr; 
dr = insertar(raizSub. subarbolDcho(), dato, nom);
raizSub.ramaDcho(dr);}
else
throw new Exception("Nodo duplicado");
return raizSub;}

// Metodo interfaz de operacion 
public Nodo buscar(int buscado){
if (raiz == null)
return null; 
else 
return localizar(raiz, buscado);}
// Metodo recursivo interno 
protected Nodo localizar(Nodo raizSub, int buscado){
if ( buscado==raizSub.dato)
return raizSub;
else if (buscado<raizSub.dato)
return localizar(raizSub.subarbolIzdo(), buscado);
else 
return localizar (raizSub.subarbolDcho(), buscado);}

//Metodo interfaz de operacion 
public void eliminar (int valor) throws Exception{
raiz = eliminar(raiz, valor);}
//método interno para realizar la operación 
protected Nodo eliminar (Nodo raizSub, int dato) throws Exception{
if (raizSub == null)
throw new Exception ("No encontrado el nodo con la clave");
else if (dato<raizSub.dato){
Nodo iz;
iz = eliminar(raizSub.subarbolIzdo(), dato);
raizSub.ramaIzdo(iz);}
else if (dato>raizSub.dato)
{
Nodo dr;
dr = eliminar(raizSub.subarbolDcho(), dato); 
raizSub.ramaDcho(dr);
}
else //Nodo encontrado
{
Nodo q; 
q = raizSub;
// nodo a quitar del árbol 
if (q.subarbolIzdo() == null)
raizSub = q.subarbolDcho();
else if (q.subarbolDcho() == null)
raizSub = q.subarbolIzdo(); 
else{
// tiene rama izquierda y derecha 
q = reemplazar(q);
}
q = null;
}
return raizSub;
}

// método interno para susutituir por el mayor de los menores 
private Nodo reemplazar (Nodo act){
Nodo a, p;
p = act;
a = act.subarbolIzdo(); // rama de nodos menores 
while (a.subarbolDcho() != null){
p = a;
a = a.subarbolDcho();}
act.nuevoValor(a.valorNodo());
if (p == act)
p.ramaIzdo(a.subarbolIzdo());
else
p.ramaDcho(a.subarbolIzdo());
return a;}


}
