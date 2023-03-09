/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo.pkg2.pkg0;

import java.util.Scanner;

/**
 *
 * @author Fabian Diaz 
 */
public class Palindromo20 {
public static boolean Palindromo(String Palabra)
    {
        for(int i = 0; i < Palabra.length(); i++)
        {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String Palabra;
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Teclee la frase a verificar ");
        Palabra = Teclado.next();
        
        if (Palindromo(Palabra) == true)
        {
            System.out.printf("La frase \"%s\" es un palindromo%n", Palabra);
        } else
        {
            System.out.printf("La frase \"%s\" no es un palindromo%n", Palabra);
        }
    }
    
}
