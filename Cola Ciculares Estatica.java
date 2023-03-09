package cola_circular_estatica;

import java.util.Scanner;

/**
 *
 * @author ITESME
 */
public class Cola_circular_estatica {

 boolean band;
int Frente,Final;
int Max;
String ColaCir[];
public Cola_circular_estatica(){ 
Max=3;

ColaCir=new String[Max];
Frente=-1;
Final=-1;


}
public void elimina_cola(String DatoDes) {
 if (Frente==-1){
     System.out.println("Subdesbordamiento - cola vacia");
 }else {
     DatoDes=ColaCir[Frente]; 
             if(Frente==Final){
                 Frente=-1;Final=-1;
             }else{
                 if(Frente==Max-1){
                     Frente=0;
                 
                    
                 }else{
                  Frente=Frente+1;
                  
                 }
                 
   
                 
             }
             System.out.println("Datos eliminados" + DatoDes);
 }
     
    
    
}
public void inserta_cola(String d) {
    
    if(Final==Max-1 &&(Frente==0)||(Final+1)==Frente){
        System.out.println("Desbodamiento -Cola llena");
        
    }else{
        if(Final==Max){
            Final=1;
        }else{
          Final=Final+1;
          ColaCir[Final]=d;
          if(Frente==-1){
              Frente=0;
          }
        }
    }
    
        
    }
            
public void elimina_todo(String dat) {
    
   
  while(Frente>-1){
      elimina_cola(dat);
      System.out.println("Datos eliminados" +dat);
  }
        
     
}
{
    
}
    public static void main(String[] args) {
      
            
int opcion;
String dato;
Cola_circular_estatica colac=new Cola_circular_estatica();
Scanner teclado=new Scanner(System.in); System.out.println("Pila Circular Estatica");
do
{ System.out.println("1. Encolar"); System.out.println("2. Desencolar"); System.out.println("3. Desencolar Todo");
opcion=teclado.nextInt();
switch(opcion)
{
case 1: System.out.println("Escriba un dato: ");
dato=teclado.next();
colac.inserta_cola(dato);
break;
case 2:
colac.elimina_cola(null);
break;
case 3:
colac.elimina_todo(null);
break;
}
}while(opcion!=4); }
    }

