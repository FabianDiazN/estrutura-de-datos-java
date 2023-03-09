for(int i=1 ; i>=15;i++){
    System.out.println(i);
    }
   
Scanner reader = new Scanner(System.in);
System.out.println("Ingresa Seleccion:"); 
int expresion = reader.nextInt();
reader.close();
System.out.println("Inicia de:");
while(expresion<101){
System.out.println(expresion++);}  
}
        
int variable;
Scanner reader = new Scanner(System.in) ; 


do {System.out.println("Ingresa un numero:"); 
variable= reader.nextInt();  
}
while(variable % 2!=0);
System.out.println("Este numero es par:");   



}} 
