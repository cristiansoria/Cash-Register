import java.util.*;
public class Register{
   
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      System.out.println("The purchase cost ");
      double total = kb.nextDouble();
      System.out.println("The customer gave you ");
      double cash = kb.nextDouble();
      cashReg test = new cashReg();
      test.change(total,cash);   
   }

}