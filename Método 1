import java.util.Scanner;


public class MyClass {
    
  public static void main(String args[]) {
      
      Scanner entrada=new Scanner(System.in);
      
      //nav 
      int opcion;
      
      //method 1
      double pow,result,sumatotal;
      int n;
      sumatotal=0;
      
      System.out.println("---------serie aritmetica ciclo while--------------");
      System.out.println("escriba para cuentos numeros n quiere la serie");
      
      
      opcion=entrada.nextInt();
      
      if(opcion>0){
          
          System.out.println("procesando...");
          
          pow=Math.pow(2,opcion);
          
          result=pow;
          
          while(result>1)
          {
              sumatotal=sumatotal+pow;
              pow=pow/2;
              
              result=pow;
          };

           
           System.out.println(" el resultado es "+sumatotal);
           
      }else{
          System.out.println("el numero ingresado tiene que ser mayor a 0");
          
  
      };
      
      
      
    } 
    
}
