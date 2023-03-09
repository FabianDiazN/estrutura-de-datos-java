/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Fabian Diaz
 */
public class Cola2 {
boolean band;//Bandera
int Frente,Final;//Apuntadores
int Max;//Tamaño de cola
int Cola[];//Arreglo 

public Cola2(){//Primera Cola
Max=5;
Cola=new int[Max];
Frente=-1;
Final=-1;
}

public void encolar2(int dato) { //función de retorno que recibe un dato string
if(Final<Max-1){
Final=Final+1;
Cola[Final]=dato;
System.out.println("Ingresaste:"+"\n"+dato);
if(Final==0){
Frente=0;}}else{
System.out.println("Desbordamiento = Cola Llena"); 
}}
}



package colas;

/**
 *
 * @author Fabian Diaz
 */
public class Cola3 {
    boolean band;//Bandera
int Frente,Final;//Apuntadores
int Max;//Tamaño de cola
int Cola[];//Arreglo 

public Cola3(){//Primera Cola
Max=5;
Cola=new int[Max];
Frente=-1;
Final=-1;
}

public void encolar3(int dato) { //función de retorno que recibe un dato string
if(Final<Max-1){
Final=Final+1;
Cola[Final]=dato;
System.out.println("Ingresaste:"+"\n"+dato);
if(Final==0){
Frente=0;}}else{
System.out.println("Desbordamiento = Cola Llena"); 
}}

}



package colas;

/**
 *
 * @author Fabian Diaz
 */
public class Cola4 {
    boolean band;//Bandera
int Frente,Final;//Apuntadores
int Max;//Tamaño de cola
int Cola[];//Arreglo 

public Cola4(){//Primera Cola
Max=5;
Cola=new int[Max];
Frente=-1;
Final=-1;
}

public void encolar4(int dato) { //función de retorno que recibe un dato string
if(Final<Max-1){
Final=Final+1;
Cola[Final]=dato;
System.out.println("Ingresaste:"+"\n"+dato);
if(Final==0){
Frente=0;}}else{
System.out.println("Desbordamiento = Cola Llena"); 
}}

}
}

package colas;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Colas {
boolean band;//Bandera
int Frente,Final;//Apuntadores
int Max;//Tamaño de cola
int Cola[];//Arreglo

public Colas(){//Primera Cola
Max=3;
Cola=new int[Max];
Frente=-1;
Final=-1;
}

public void encolar(int dato) { //función de retorno que recibe un dato string cola 1
if(Final<Max-1){
Final=Final+1;
Cola[Final]=dato;
System.out.println("Ingresaste:"+"\n"+dato);
if(Final==0){
Frente=0;}}else{
System.out.println("Desbordamiento = Cola Llena"); 
}}

public void desencolar() { //función de retorno basica
int dato;
if(Frente!=-1){
dato=Cola[Frente];
System.out.println("Eliminaste:"+"\n"+dato);
if(Frente==Final){
Frente=-1;
Final=-1;}else{
Frente=Frente+1;}
}else{
System.out.println("Subdesbordamiento=Cola vacia");
}}

public void desencolar_Todo(){
while(Frente>=0){
desencolar();
 System.out.println("Se eliminaron todos los datos");
}}
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int opcion;
int dato;
Colas cola=new Colas();
Cola2 cola2=new Cola2();
Cola3 cola3=new Cola3();
Cola4 cola4=new Cola4();
Scanner teclado=new Scanner(System.in);
System.out.println("Cola Estatica");
do
{
System.out.println("1. Encolar");
System.out.println("2. Desencolar");
System.out.println("3. Desencolar Todo");
opcion = teclado.nextInt();

switch(opcion)
{
case 1:
System.out.println("Dato Ingresar: ");     
dato=teclado.nextInt();
if(dato==0){
System.out.println("No debe ser Cero");   
}else{
if(dato>0){
if(dato%2==0){
cola.encolar(dato);
System.out.println(dato+"   Guardado en cola 1");
}else{
cola2.encolar2(dato);
System.out.println(dato+"   Guardado en cola 2");   
}}else{
if(dato<0){
if(dato%-2==0){
cola3.encolar3(dato);
System.out.println(dato+"   Guardado en cola 3");
}else{
cola4.encolar4(dato);
System.out.println(dato+"   Guardado en cola 4");   
}}}}

break;
case 2:
cola.desencolar();
break;   
case 3:
cola.desencolar_Todo();
break;
}}
while(opcion!=4);
}}
