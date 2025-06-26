  public class ThrowDemo{
  
     public static void checkNumber (int number){
	 
	   if(number<0){
	   
	    throw new ArithmeticException("number must be positive");
	   }
	   else{
	   
	   System.out.println("number:"+number);
	   }
	 }
	 
	 public static void main(String[] args){
	 
	    try{
		 checkNumber(-2);
		}
		catch(ArithmeticException e){
		System.out.println("Exception :" +e.getMessage());
		}
	 }
  }