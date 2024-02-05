package ejemplo;


public class Montículo {
    public static int[] Montículo(int A[], int o){
        int aux = 0;
        int k;
        boolean band;
        for (int i = 2; i < A.length; i++) {
            k=1;
            band=true;
            while((k>1)&&(band=true)){
                band=false;
            if(A[k]>A[k/2])
                aux=A[k/2];
            A[k/2]=A[k];
            A[k]=aux;
            k=k/2;
            band=true;
            
        }
       
    }
        return A;
}
    public static void main(String[] args){
        int o = 0;
        int A[]={1,3,4,5,2};
        System.out.println("Heap Sort");
        System.out.println("\n-----------\n");
        System.out.println("\nUnsorted array\n\n");
        for (int i = 0; i < A.length; i++) 
            System.out.println(""+A[i]);
        for (int i = A.length; i > 1; i--) {
            Montículo(A, o-1);
            
        }
            
        }
}

package ejemplo;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Método_Burbuja {

   public static void main(String[] args){
    Scanner entrada=new Scanner(System.in);
    int arreglo[],nElementos, aux;
    
    // nElemetos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos: "));
   
    System.out.println("Ingrese el número de elementos; ");
            nElementos = entrada.nextInt();
    
            arreglo = new int [nElementos];
    
    for(int i = 0; i<nElementos; i++){
       System.out.print("Digite un número: ");
       arreglo[i] = entrada.nextInt();
   }
              
               //MÉTODO BURBUJA\\
    for (int i = 0; i < (nElementos-1); i++) {
                for (int j = 0; j < (nElementos-1); j++) {
                    if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    }}}
    System.out.println("\n Arreglo ordenado de forma creciente: ");
           for (int i = 0; i < nElementos; i++) {
           System.out.print(arreglo[i]+" -> ");
           
       }
    System.out.println("\n Arreglo ordenado de forma decreciente: ");
           for(int i=(nElementos-1); i>=0; i--){
           System.out.print(arreglo[i]+" -> ");
         }
     }
}

   


    
