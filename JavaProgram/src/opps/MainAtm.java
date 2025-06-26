class Atm{

   private double balance;
   
   public Atm(double initialBalance){
      balance = initialBalance;
   }
   
   public void withdraw(double amount){
   
       if(amount <= balance){
	     balance -= amount;
		 
		 System.out.println("withdrawal successful. remaining balance:" + balance);
	   }
	   else{
	    System.out.println("insufficient balance");
	   }
   }
   public void checkBalance(){
     System.out.println("current balance:"+balance);
   }
}
 public class MainAtm{
 
  public static void main (String[] args){
  
     Atm a=new Atm(50000.0);
	 
	 a.checkBalance();
	 a.withdraw(15000.0);
	 a.checkBalance();
  }
 }