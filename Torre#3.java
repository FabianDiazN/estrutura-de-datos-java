package ejercicio_tema3.pkg3.torres_hanoi;

import java.util.Scanner;
public class Ejercicio_Tema33Torres_Hanoi {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println( "Numero de discos: ");
        n=sc.nextInt();
        hanoi('A', 'B', 'C',n ); 
    }
        static void hanoi(char varinicial, char varcentral, char varfinal, int n){
            
        if (n==1){ 
        System.out.println("Mover disco " + n +"\n"+ "Desde varilla " + varinicial +"\n"+ "a varilla " + varfinal);
        }else{
        
        hanoi(varinicial, varfinal, varcentral, n-1);
        
        System.out.println("Mover disco "+ n +"desde varilla " + varinicial + "a varilla " + varfinal);
        
        hanoi(varcentral, varinicial, varfinal, n-1); 
        }
    }
    
}
