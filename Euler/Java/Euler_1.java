import java.util.*;

public class Euler_1{
   public static void main(String[] args){
      int total = 0; 
      for(int i = 1; i < 1000; i++){
         if(i % 3 == 0){
            System.out.print(i + ", ");
            total += i;
         }
         else if(i % 5 == 0){
            System.out.print(i + ", ");
            total += i;
         }
      }
      System.out.println();
      System.out.println(total);
   }
}