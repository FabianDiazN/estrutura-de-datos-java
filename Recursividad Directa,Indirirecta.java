package recursividad.directa.o.indirecta;

public class Alfabeto {
static void metodoA(char c){
if(c> 'A')
 metodoB(c);
System.out.println(c);
}
static void metodoB(char c){
 metodoA(--c);
 }
 public static void main(String[] a){
System.out.println(); 
 metodoA('Z');
 System.out.println();
}}



package recursividad.directa.o.indirecta;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.print.DocFlavor;


public class RecursividadDirectaOIndirecta {
static long factorial(int n){
    if(n <=1)
        return 1;
    else {
        long resultado = n *factorial(n-1);
        return resultado;
    }
}
   
    public static void main(String[] ar)throws Exception{
        int n;
        BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
        do{
            System.out.println("Introduzca numero n:");
            n = Integer.parseInt(entrada.readLine());
        }while (n<0);
        System.out.println("\n \t"+ n + "Factorial=  "+factorial(n));
        }  
    }
