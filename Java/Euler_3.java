import java.util.*;

public class Euler_3{
   public static void main(String[] args){
      long factor = 0, factor2 = 0, num = 600851475143L;
      for(int i = 1; i < 200000000; i++){
         if(num % i == 0){
            for(int e = 1; e < 20000000; e++){
               if((num/i) % e == 0){
               }   
               else{
                  factor = num/i;
               }
            }
         }
      }
      System.out.print(factor + ", ");
   }
}