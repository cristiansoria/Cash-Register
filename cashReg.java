public class cashReg{

   private double quarter = .25;
   private double dime = .10;
   private double nickel = .05;
   private double penny = .01;
   private double total;
   private double given;
   
   public cashReg(){
      this.total = 0;
      this.given = 0;
   }

   public void change(double total, double given){
      this.total = total;
      this.given = given;
      double owed = this.given - this.total;
      System.out.println("You owe the customer " + Math.round(owed * 100.0) / 100.0);
      changeOwed(owed);
      if(owed < 0){
         throw new IllegalArgumentException("Customer did not give you enough!");
      }
   }

   public void changeOwed(double owed){
      int dollars = (int)owed;
      owed -= dollars;
      if(dollars > 0){
         System.out.println(findDollars(dollars));
      }
      if(owed > 0){ 
         System.out.println(findChange(owed));
      }
      owed = Math.round(owed * 100.0) / 100.0;
   
   }
   
   public String findDollars(int dollars){
      String change = "You will need ";
      if((dollars/100) > 0){
         change += dollars/100 + " hundreds ";
         dollars -= dollars/100 * 100;
      }
      if((dollars/20) > 0){
         change += (int)dollars/20 + " twenties ";
         dollars -= dollars/20 * 20;
      }
      if((dollars/5) > 0){
         change += (int)dollars/5 + " fives ";
         dollars -= dollars/5 * 5;
      }
      if(dollars > 0){
         change += (int)dollars + " dollars ";
         dollars -= dollars;
      }
      return change;
   }
   
   public String findChange(double coins){
      coins = Math.round(coins * 100.0) / 100.0;
      int owedInt = (int)(coins * 100);
      String change = "You will need ";
      if((owedInt/25) > 0){
         change += owedInt/25 + " quarters ";
         owedInt -= owedInt/25 * 25;
      }
      if((owedInt/10) > 0){
         change += (int)owedInt/20 + " dimes ";
         owedInt -= owedInt/20 * 20;
      }
      if((owedInt/5) > 0){
         change += (int)owedInt/5 + " nickels ";
         owedInt -= owedInt/5 * 5;
      }
      if(owedInt > 0){
         change += (int)owedInt + " pennies ";
         owedInt -= owedInt;
      }
      
      return change;
   }

}