package ejercicio_tema3.pkg6.grafo;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;
import java.util.Scanner;

/**
 *
 * @author Itesme
 */
public class Grafo {

    private final int MAX_VERTICES;
    private final int MAX_ARISTAS;
    private int nroAristas;
    private int grafo[][];
//Crea un grafo vacio, con un maximo numero de vertices y aristas 
    public Grafo(int nroVertices, int nroAristas) {
        MAX_VERTICES = nroVertices;
        MAX_ARISTAS = nroAristas;
        this.nroAristas = 0;
        grafo = new int[MAX_VERTICES][MAX_VERTICES];
        for (int i = 0; i < getMAX_VERTICES(); i++) {
            for (int j = 0; j < getMAX_VERTICES(); j++) {
                grafo[i][j] = 0;
            }
        }
    }
//Crea un grafo vacio, con un maximo numero de vertices, y 
//vertices al cuadrado como numero maximo de aristas. 
    public Grafo(int nroVertices) {
//Llamada al constructor con dos argumentos 
        this(nroVertices, nroVertices);
    }
//Crea un grafo vacio con un maximo numero de vertices = 5 
//y maximo numero de aristas = 25. 
    public Grafo() {
//Llamada al constructor con dos argumentos 
        this(5, 25);
    }

    public int getMAX_VERTICES() {
        return MAX_VERTICES;
    }

    public int getMAX_ARISTAS() {
        return MAX_ARISTAS;
    }

//Inserta una arista entre dirigida del vertice vi al vertice v2
    public void insertaArista(int v1, int v2) throws ArrayIndexOutOfBoundsException, UnsupportedOperationException {
        if (v1 >= MAX_VERTICES || v2 >= MAX_VERTICES) {
            throw new ArrayIndexOutOfBoundsException("Vertices invalidos, fuera de rango"
                    + "\nRango de vertices: 0 -" + (getMAX_VERTICES() - 1));
        } else if (nroAristas == MAX_ARISTAS) {
            throw new UnsupportedOperationException("No se puede añadir mas aristas");
        } else {
            grafo[v1][v2] = 1;
        }
    }

//Retorna verdadero si existe una arista dirigida entre los vertices vi y v2 
    public boolean existeArista(int v1, int v2) {
        if (v1 >= MAX_VERTICES || v2 >= MAX_VERTICES) {
            throw new ArrayIndexOutOfBoundsException("Vertices invalidos, fuera de rango"
                    + "\n Rango de vertices: -" + (getMAX_VERTICES() - 1));
        } else if (grafo[v1][v2] == 1) {
            return true;
        }
        return false;
    }

//Elimina la arista entre los vertices vi y v2 
    public void eliminaArista(int v1, int v2) {
        if (v1 >= MAX_VERTICES || v2 >= MAX_VERTICES) {
            throw new ArrayIndexOutOfBoundsException("Vertices invalidos, fuera de rango"
                    + "\nRango de vertices: -" + (getMAX_VERTICES() - 1));
        } else if (grafo[v1][v2] == 0) {
            System.err.println("La arista NO existe");
        } else {
            grafo[v1][v2] = 0;
        }
    }

//Elimina todas las aristas. Se llena toda la matriz de ceros 
    public void liberaGrafo() {
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo[i].length; j++) {
                grafo[i][j] = 0;
            }
        }
    }

    public void mostrarGrafo() {
        System.out.print(" ");
        for (int i = 0; i < MAX_VERTICES; i++) {
            System.out.printf(" %3d", i);
        }
        System.out.println();
        for (int i = 0; i < MAX_VERTICES; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < MAX_VERTICES; j++) {
                System.out.printf("%3d", grafo[i][j]);
            }
            System.out.println();
        }
    }

    public boolean ListaAdyVacia(int v) {
        int aux = 0;
        boolean listaVacia = true;
        while (aux < MAX_VERTICES && listaVacia) {
            if (grafo[v][aux] == 1) {
                listaVacia = false;
            } else {
                aux = aux + 1;
            }
        }
        return listaVacia;
    }
//Devuelve el primer vertice adyacente al vertice v 
    public int primeroListaAdy(int v)
            throws RuntimeException {
        int aux = 0;
        boolean listaVacia = true;
        while (aux < MAX_VERTICES && listaVacia) {
            if (grafo[v][aux] == 1) {
                listaVacia = false;
            } else {
                aux = aux + 1;
            }
        }
        if (aux == MAX_VERTICES) {
            throw new RuntimeException("La lista de Adyacencia esta vacia");
        }
        return aux;
    }
//Retorna el siguiente adyacente, retorna -1 si no hay mas adyacentes 
    public int proxAdy(int v, int ady) {
        int prox = ady + 1;
        while (prox < MAX_VERTICES && grafo[v][prox] == 0) {
            prox = prox + 1;
        }
        if (prox == MAX_VERTICES) {
            return -1;
        }
        return prox;
    }
}


package ejercicio_tema3.pkg6.grafo;

import java.util.Scanner;

/**
 *
 * @author Itesme
 */
public class addArista {

    public static void addArista(Grafo g) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese vi y v2");
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        g.insertaArista(v1, v2);
    }

    public static void deleteArista(Grafo g) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese vi y v2");
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        if (g.existeArista(v1, v2)) {
            g.eliminaArista(v1, v2);
        } else {
            System.out.println("Arista buscada no existe");
        }
    }

    public static void deleteGraph(Grafo g) {
        System.out.println("Borrando grafo");
        g.liberaGrafo();
    }

    public static void showGraph(Grafo g) {
        g.mostrarGrafo();
    }

    public static void getAdList(Grafo g) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserte vertice");
        int v = in.nextInt();
        if (g.ListaAdyVacia(v)) {
            System.out.println("La lista esta vacia");
        } else {
            int aux = g.primeroListaAdy(v);
            System.out.println("Lista: ");
            while (aux != -1) {
                System.out.print(" " + aux);
                aux = g.proxAdy(v, aux);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int opcion;
        Grafo g = new Grafo();
        System.out.println("1. Añadir arista");
        System.out.println("2. Eliminar arista");
        System.out.println("3. Eliminar Grafo");
        System.out.println("4. Mostrar Grafo");
        System.out.println("5. Obtener lista Adyacencia vertice");
        System.out.println("6. Salir");
        do {
            System.out.println("Ingrese una opcion");
            Scanner in = new Scanner(System.in);
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    addArista(g);
                    break;
                case 2:
                    deleteArista(g);
                    break;
                case 3:
                    deleteGraph(g);
                    break;
                case 4:
                    showGraph(g);
                    break;
                case 5:
                    getAdList(g);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Seleccion incorrecta");
            }
        } while (opcion != 6);
    }
}
