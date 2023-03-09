package practica8;

    public class Lista {
    
        protected Nodo primero, ultimo;
        
        public Lista(){
            primero = ultimo = null;
        }
        public Lista insertarCabezaLista(int entrada){
            Nodo nuevo;
            nuevo = new Nodo(entrada);
            nuevo.enlace = primero;
            primero = nuevo;
            return this;
        }
        
        public Lista insertarUltimoLista(int entrada){
            Nodo nuevo;
            nuevo = new Nodo(entrada);
            if (primero == null) {
                primero = nuevo;
            } else {
                ultimo = primero;
                while (ultimo.enlace != null) {                    
                    ultimo = ultimo.enlace;
                }
                ultimo.enlace = nuevo;
            }
            return this;
        }
        public void Visualizar() {
            Nodo n;
            n = primero;
            if (n == null) {
                System.out.println("\n La Pila esta Vacía-");
            } else {
                while (n != null) {                
                System.out.print(n.dato + "   ");
                n = n.enlace;
                }
            }
        }
public void imprimir() {
        Nodo reco=primero;
        System.out.println("Elementos en la pila.");
        while (reco!=null) {
            System.out.print(reco.dato+"-");
            reco=reco.enlace;
        }
        System.out.println();
    }
public void  cantidadNodos() {
    
        int cant=0;
        Nodo reco=primero;
        while (reco!=null) {
            cant++;
            reco=reco.enlace;
        }
        
        System.out.println("Catidad de nodos:"+cant); 
   }
        public void eliminartodo(){
             if (primero != null){
                 while(primero != null) {
                if (primero != null) {
                Nodo cabeza = primero;
                primero = primero.enlace;
                cabeza.enlace = null;
                System.out.print("\nDato eliminado:"+cabeza.dato);
            } else {
                System.out.println("\n-Pila Vacía-");
        }
    
             }
        }
        }
        
        public void eliminarCabezaLista(){
            if (primero != null) {
                Nodo cabeza = primero;
                primero = primero.enlace;
                cabeza.enlace = null;
                System.out.print("\nDato eliminado:"+cabeza.dato);
            } else {
                System.out.println("\n-Pila Vacía-");
        }
    }
        
        public void eliminarUltimoLista(){
            if (primero != null) {
                if (primero.enlace == null) {
                    System.out.print(primero.dato);
                    primero = null;
                } else {
                    ultimo = primero;
                    while (ultimo.enlace.enlace != null) {                        
                        ultimo = ultimo.enlace;
                    }
                    System.out.print(ultimo.enlace.dato);
                    ultimo.enlace = null;
                }
            }
        }

        public Nodo buscarLista(int destino) {
            Nodo indice;
            for (indice = primero; indice != null; indice = indice.enlace)
            if (destino == indice.dato)
                return indice;
            return null;
    }
        
      public void eliminarNLista (int entrada){
            Nodo actual, anterior;
            boolean encontrado;
            actual = primero;
            anterior = null;
            encontrado = false;
            while ((actual != null) && (!encontrado)) {                
                encontrado = (actual.dato == entrada);
                if (!encontrado) {
                    anterior = actual;
                    actual = actual.enlace;
                }
            }
            if (actual != null) {
                if (actual == primero) {
                    primero = actual.enlace;
                } else {
                    anterior.enlace = actual.enlace;
                }
                actual = null;
            }
        }
}
package practica8;



public class ListaUsable {

    public static void main(String[] args) {
        int opcion;
        String dato;
        Lista lista;
        lista = new Lista();
        System.out.println("//Pila Dinamica//");
        //Imprimir Datos en Cosola de manera automatica//
         lista.insertarCabezaLista(550);
         lista.insertarCabezaLista(170);
         lista.insertarCabezaLista(10);
         lista.insertarCabezaLista(11);
         lista.cantidadNodos();
         lista.Visualizar();
         lista.eliminarCabezaLista();
         lista.eliminartodo();
        

package practica8;
    public class Nodo {
 
        int dato;
        Nodo enlace;

        public Nodo(int x){
            dato = x;
            enlace = null;
        }
        
        public int getDato(){
            return dato;
        }
        
        public Nodo getEnlace(){
            return enlace;
        }
        
        public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}