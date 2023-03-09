package lista_enlazada;

public class Lista {
boolean band;  //bandera
int Tope,Max;
String pila[];
protected Nodo ultimo, primero;

public Lista(){
Max=3;
pila=new String[Max];
Tope=-1;   
primero = ultimo = null;}

public void Pila_llena(){
if (Tope==Max-1) {
band=true;
}else{
band=false;
}}
         
public void Pila_Vacia(){
if(Tope==-1){
band=true;
}else{
band=false;
}}

public Lista insertarUltimoLista(int entrada){//metodo 2
Nodo nuevo ;
nuevo = new Nodo(entrada);
if(primero==null){primero=nuevo;
}else{ultimo=primero;
while(ultimo.enlace !=null){
ultimo = ultimo.enlace;
}ultimo.enlace = nuevo;
}return this;}
public void visualizar(){//metodo 3
Nodo n;
n = primero;
if(n==null){System.out.println("Esta vacia");}
while (n != null){System.out.print(n.dato + "  ");
n = n.enlace;}}

public void eliminarCabezaLista(){//metodo 4
if(primero != null){
Nodo cabeza=primero;
primero=primero.enlace;
cabeza.enlace=null;
System.out.print(cabeza.dato);      
}else{System.out.println("Esta vacia");} 
}

public void eliminarTodo(){
    while(primero !=null){
        eliminarCabezaLista();
    }
}
public void Nodos(){
    int n=0;
    Nodo reco = primero;
    while(reco !=null){
        n++;
        reco=reco.enlace;
        if(primero == null){
            System.out.println("\n\t Pila vacia");
            break;
        }
    } System.out.println("Cantidad de nodos:"+n);
    if(primero == null){
      System.out.println("\n\t Pila vacia");
     
    }
}

}


package lista_enlazada;

import java.util.Scanner;


/**
 *
 * @author ITESME
 */
public class ListaUsable {//
public static void main(String[] args){
int dato1 = 230;
int dato2 = 2328;
int dato3 = 110;
Lista lista;
lista = new Lista();
System.out.println("Datos:");
lista.insertarUltimoLista(dato1);
lista.insertarUltimoLista(dato2);
lista.insertarUltimoLista(dato3);
System.out.println("\n"+"Dato ingresado:");
lista.visualizar();
System.out.println("\n"+"Se elimino el dato: ");
lista.eliminarCabezaLista();
System.out.println("");
lista.Nodos();
System.out.println("\n"+"Datos: ");
lista.eliminarTodo();
System.out.println("\n"+"Se elimino todo");
System.out.println("\n"+"Estado de la Lista:");
lista.visualizar();
lista.insertarUltimoLista(dato2);
lista.insertarUltimoLista(dato3);

}}


/**
 *
 * @author Fabian Diaz USER
 */
public class Nodo {
int dato;
Nodo enlace;
public Nodo(int x){
dato=x;
enlace = null;}
public int getDato(){
return dato;}
public Nodo getEnlace(){
return enlace;}
public void setEnlace(Nodo enlace){
this.enlace = enlace;}}
