public class Pila_Estatica {
    boolean band;
        int Tope,Max;
        String pila [];
        public Pila_Estatica(){
         Max=2; 
         pila = new String[Max];
         Tope=-1;
        }
        public void Pila_llena(){
            if(Tope==Max-1){ band=true;
            } else  {
 
            band=false;
               
            }
        }
        public void Pila_vacia(){
            if(Tope==-1){band=true;
            } else  {
 
            band=false;
            
            }
              
        }
            public void Pone(String dato){
                Pila_llena(); 
                if(band==true){
                    System.out.println("Desbordamiento :");
                    }else {
                    Tope=Tope+1;
                    pila[Tope]=dato;
                }
            }
 public void Quita(){
     Pila_vacia();
     String dato;
     if(band==true){
        System.out.println("pila vacia");
                    }else { 
         dato=pila[Tope];
         Tope=Tope-1;  
         System.out.println("Dato elimando:" + dato); 
         
      
     }
                      
        }   
 public void Quita_todo(){
    while(Tope>=0)
        Quita();
     
 }
 public void Tope(){
     Pila_vacia();
     String n;
     
       if(band==true){
           System.out.println("Pila vacia");
       }else{
           n=pila[Tope];
           System.out.println("El tope: " + n);
 }
  }
 
    public static void main(String[] args) {
       
  int opcion;

  String dato;
  Pila_Estatica pila=new Pila_Estatica();  
  Scanner teclado=new Scanner(System.in); 
  System.out.println("Pila Estatica:"); 
do
  { 

   System.out.println("1.Ingresar"); 
   System.out.println("2. Quitar"); 
   System.out.println("3. Tope"); 
   System.out.println("4. Quitar todo"); 
 
opcion=teclado.nextInt(); 

switch(opcion) 
   { 
  
case 1: 
    System.out.println("Escribe el dato a ingresar: "); 
dato=teclado.next(); 
pila.Pone(dato);
break; 
case 2: 
pila.Quita();  
break; 
case 3: 
pila.Tope(); 
break; 
    case 4: 
pila.Quita_todo(); 
break; 
    
   } 
  }while(opcion!=5);
        System.out.println("Cerrando!!!");
}

   
    }
