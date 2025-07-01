            //Multilevel Inheritance
			
			class user{
			
			void login(){
			  System.out.println("user logged in");
			}
			}
			
			class Customer extends user{
			
			  void makePurchase(){
			    System.out.println("customer made a purchase");
			  }
			}
			
			class FristCustomer extends customer{
			
			   void getFree(){
			    System.out.println("first customer gets free delivery");
			   }
			}
			
			public class MultilevelDemo{
			
			  public static void main(String[] args){
			     FristCustomer f1= new FristCustomer();
				 
				 f1.login();
				 f1.makePurchase();
				 f1.getFree();
			  }
			}