package cola_estatica;

import java.util.Scanner;

/**
 *
 * @authorFabian Diaz
 */
public class Cola_estatica {
    boolean band;
    int Frente,Final;
    int Max;
    String Cola[];
    
    public Cola_estatica(){
        Max=3;
        Cola=new String[Max];
        Frente=-1;
        Final=-1;
        
    }
public void encolar(String d){
    if(Final<Max-1){
        Final=Final+1;
        Cola[Final]=d;
    }else if(Final==0){
        
        Frente=0;
    }else{
    System.out.println("Desbordamiento-Cola llena");
    }
}
public void desencolar(){
    String Dato;
    if(Frente!=-1){
        Dato=Cola[Frente];
     
     if(Frente==Final){
        Frente=-1;
        Final=-1;}
    else{
        Frente=Frente+1;
        
     }
   }else{
        System.out.println("Subdesbordamiento-Cola vacía"+Dato);
        
        
    }
}

 public void desencolar_todo(){
     if(Frente>0){
         desencolar();
         
     }
         }
 


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        String dato;
        Cola_estatica cola =new Cola_estatica();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Cola estatica");
        
        do{
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Desencolar todo");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                System.out.println("Escriba un dato: ");
                    dato=teclado.next();
                    cola.encolar(dato);
                    break;
                case 2:
                    cola.desencolar();
                    break;
                case 3:
                    cola.desencolar_todo();
                    break;
                    
            }
        }while(opcion!=4);
                
        }
}

