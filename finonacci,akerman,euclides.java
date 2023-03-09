

package recursividad.fibonacci.euclides.akerman;

import java.util.Scanner;

public class Euclides
{
 
    public static void main (String[] Args) {
       int numero1;
       int numero2;
       Scanner tamaño = new Scanner(System.in);
       System.out.println("Ingrese los numeros para sacar el MCD:");
       numero1 = tamaño.nextInt();
       numero2 =tamaño.nextInt();
        System.out.println("EL MCD de: "  + numero1 +" Y "+ numero2);
        System.out.println(obtener_mcd(-numero1,-numero2));
    }
    static int obtener_mcd(int a, int b) {
       if(b==0)
           return a;
       else
           return obtener_mcd(b, a % b);
   }
}

ackage recursividad.fibonacci.euclides.akerman;

public class Fibonacci {
    int fibonacci(int numero)
{
    if (numero>1){
       return fibonacci(numero-1) + fibonacci(numero-2);//
    }
    else if (numero==1) {  
        return 1;
    }
    else if (numero==0){  
        return 0;
    }
    else{ //Mensaje de Error:
        System.out.println("--------------------0"
                + "");
        System.out.println("Ingresa un valor ≥ 1");
        return -1; 
    }
    }
public int tamaño;
public String nombre;
public Fibonacci() { 
}

public Fibonacci(String nombre, int tamaño){
    this.nombre = nombre;
    this.tamaño = tamaño;
}
public void mostrarSerie(){
    System.out.println(this.nombre+" del tamaño: "+this.tamaño+":");
    for (int i = 0; i < tamaño; i++) {
        System.out.println("-"+fibonacci(i)+" ");
    }
    System.out.println();
    
}
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getTamaño() {
    return tamaño;
}

public void setTamaño(int tamaño) {
    this.tamaño = tamaño;
}
}


    
    



package recursividad.fibonacci.euclides.akerman;

import java.util.Scanner;
public class FuncionAkerman {
   
    static Scanner teclado = new Scanner (System.in);
    static int  Akerman(int  m, int  n){
        if(m == 0)    
            return n+1;
        else if ( n == 0)
            return Akerman(m-1,1);
        else
            
            return Akerman(m-1,Akerman(m, n-1));
         
     }
    public static void main (String[] Args) {
       int m;
       int n;
        System.out.println("Funcion de Akerman");
        System.out.println("**********************"); 
        System.out.println("Ingrese el primer valor:");
        m=teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        n=teclado.nextInt();
        System.out.println("**********************"); 
        System.out.println("El valor Akerman es:"+ Akerman(m,n));

    }
} 

