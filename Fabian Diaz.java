    public static void main(String[] args) {
        // TODO code application logic here
            int calificacion=60; 
            if(calificacion >= 100);
            System.out.println("Alumno de excelencia" );
   
            
          //Ejercicio 2//
            
         if (calificacion >= 70){
             System.out.println("Aprobado");
          }
          else {
           System.out.println("Reprobado");
          }
             
            
            //Ejercicio 3//
            
           if (calificacion >= 100){
            System.out.println("Exelente");      
    }
            else{
                if (calificacion>=90){
                        System.out.println("Sobresaliente"); 
                }
                else{
                    if (calificacion>=80){
                        System.out.println("Notable"); 
                    }
                    else{
                        if(calificacion>=70){
                            System.out.println("bien"); 
                        }
                        else{
                        }
              if(calificacion<=69){
                  System.out.println("Reprobado "); 
              }
                        }
                    
                }
                
            }
   
            
            //Ejercicio 4//
            if(calificacion==100){
                System.out.println("excelencia");  
        }else if (calificacion>=90){
        System.out.println("Sobresaliente");
   }else if (calificacion >= 80){
        System.out.println("Notable");
   }else if (calificacion >= 70){
        System.out.println("bien");
   }else if (calificacion <= 69){
        System.out.println("reprobado");
   }
        Scanner reader = new Scanner(System.in); System.out.println("Ingresa Seleccion:"); int expresion = reader.nextInt();  reader.close();  
        switch(expresion){
            case 1:
                if(calificacion==100){
                   System.out.println("excelencia");}
                   
                   break;
                   case 2:
                   if (calificacion >= 70){
             System.out.println("Aprobado");
          }
          else {
           System.out.println("Reprobado");
          }
                   break;
                   case 3:
                   if (calificacion >= 100){
            System.out.println("Exelente");      
    }
            else{
                if (calificacion>=90){
                        System.out.println("Sobresaliente"); 
                }
                else{
                    if (calificacion>=80){
                        System.out.println("Notable"); 
                    }
                    else{
                        if(calificacion>=70){
                            System.out.println("bien"); 
                        }
                        else{
                        }
              if(calificacion<=69){
                  System.out.println("Reprobado "); 
              }
                        }
                    
                }
                
            }
                   break;
                   case 4:
                   if(calificacion==100){
                System.out.println("excelencia");  
        }else if (calificacion>=90){
        System.out.println("Sobresaliente");
   }else if (calificacion >= 80){
        System.out.println("Notable");
   }else if (calificacion >= 70){
        System.out.println("bien");
   }else if (calificacion <= 69){
        System.out.println("reprobado");
   }