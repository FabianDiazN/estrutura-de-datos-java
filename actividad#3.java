 int numeros;
         int n1;
          int n2 ;
           int n3;
            int n4;
             int n5;
              int n6;
               int n7;
               int n8;
             int n9;
           int n10;
          int n11;
         int n12;
        int n13;
       int n14;
      int n15;
Scanner reader = new Scanner(System.in) ; 
System.out.println("Ingresa los 15 numeros:"); 
 n1= reader.nextInt(); 
  n2= reader.nextInt(); 
   n3= reader.nextInt(); 
    n4= reader.nextInt();
     n5= reader.nextInt();
      n6= reader.nextInt(); 
       n7= reader.nextInt();
        n8= reader.nextInt(); 
         n9= reader.nextInt();
          n10= reader.nextInt(); 
           n11= reader.nextInt();
            n12= reader.nextInt(); 
             n13= reader.nextInt();
              n14= reader.nextInt(); 
               n15= reader.nextInt();
               ///////////////////////////////////Multiplicacion///////////////////////
              
numeros=n1*n2*n3*n4*n5*n6*n7*n8*n9*n10*n11*n12*n13*n14*n15;
System.out.println("El resultado de multipliacar los 15 numeros es:");
System.out.println(numeros); 
System.out.println("Los numeros ingresados son:");   
 System.out.println(n1);  
   System.out.println(n2);  
      System.out.println(n3);  
       System.out.println(n4);  
        System.out.println(n5);  
         System.out.println(n6);  
          System.out.println(n7);  
           System.out.println(n8);  
            System.out.println(n9); 
             System.out.println(n10);  
              System.out.println(n11);  
               System.out.println(n12);  
                System.out.println(n13);  
                 System.out.println(n14);  
        
       // 2. Tipos de datos estructurados//
final int cantidad = 15; 
int nums[]= new int[cantidad]; 
int total = 1; 
int entrada; 
try (Scanner reader = new Scanner(System.in)) {
 System.out.println("Ingresa " + cantidad + " Numeros");
 for (int i = 0; i < cantidad; i++){  nums[i] =(entrada = reader.nextInt());
    }       
}  
System.out.print("\nLista de números: ");
for (int i = 0; i < cantidad; i++) {  
    System.out.print(" " + nums[i]);        
    total *= nums[i];       
} 
 System.out.println("\n*********************************************");
System.out.println("\nEl Resultado es: " + total);
 System.out.println("\n*********************************************");
 
      
    }}