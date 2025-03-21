import java.util.*;

public class Euler_2{
   public static void main(String[] args){
      double total = 0, seq = 0, first = 0, second = 1;
      for(int i = 0; i < 400; i++){
         seq = second + first;
         first = second;
         second = seq;
         //System.out.print(i + ", " + seq + ", ");
         if(seq % 2 == 0 && seq < 4000000){
            total += seq;
         }
      }
      System.out.print(total + ", ");

   }
}
