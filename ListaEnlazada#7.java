package ListaEnlazada;

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
                System.out.println("Lista Vacía-");
            } else {
                while (n != null) {                
                System.out.print(n.dato + "");
                n = n.enlace;
                }
            }
        }
        
        public void eliminarCabezaLista(){
            if (primero != null) {
                Nodo cabeza = primero;
                primero = primero.enlace;
                cabeza.enlace = null;
                System.out.print(cabeza.dato);
            } else {
                System.out.println("Lista Vacía-");
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
        
        public Lista insertaDespuesLista(int testigo, int entrada){
            Nodo nuevo, anterior;
            anterior = buscarLista(testigo);
            if (anterior != null) {
                nuevo = new Nodo(entrada);
                nuevo.enlace = anterior.enlace;
                anterior.enlace = nuevo;
            }
            return this;
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

package ListaEnlazada;

import java.util.*;

public class ListaUsable {

    public static void main(String[] args) {
        
        int opcion;
        String dato;
        Lista lista;
        lista = new Lista();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lista Enlazada");
        
        do {            
            
            System.out.println("1.Insertar Principio");
            System.out.println("2. Insertar Elemento");
            System.out.println("3. Insertar Final");
            System.out.println("4. Mostrar");
            System.out.println("5. Buscar Elemento");
            System.out.println("6. Eliminar Principio");
            System.out.println("7. Eliminar Elemento");
            System.out.println("8. Eliminar Final");
            opcion = teclado.nextInt();
            
                switch(opcion){
                    
                    case 1:
                        System.out.println("Escriba un dato: ");
                        dato = teclado.next();
                        int num = Integer.parseInt(dato);
                        lista.insertarCabezaLista(num);
                        break;
                    
                    case 2:
                        dato = teclado.next();
                        lista.insertaDespuesLista(opcion,opcion);
                        System.out.println("Dato Ingresado"+dato);
                        break;    
                    
                    case 3:
                        System.out.println("Escriba un dato: ");
                        dato = teclado.next();
                        lista.insertarUltimoLista(opcion);
                        System.out.println("Dato Ingresado"+dato);
                        break;
                        
                    case 4:
                        lista.Visualizar();
                        break;
                    
                    case 5:
                        lista.buscarLista(opcion);
                        System.out.println("Dato Ingresado");
                        break;    
                        
                    case 6:
                        System.out.println("Datos Eliminados: ");
                        lista.eliminarCabezaLista();
                        break;
                        
                    case 7:
                        System.out.println("Escriba un dato: ");
                        dato = teclado.next();
                        lista.eliminarNLista(opcion);
                        break;
                        
                    case 8:
                        System.out.println("Datos Eliminados: ");
                        lista.eliminarUltimoLista();
                        break;
                }
        } while (opcion != 5);
    }
}


package ListaEnlazada;

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