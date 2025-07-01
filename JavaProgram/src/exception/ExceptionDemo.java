public class ExceptionDemo{
   
   public static void main(String [] args){
      
	  int a=10;
      int b=0;
	  
	  try{
	  
	   int result=a/b;
	   System.out.println("Result:"+result);
	  }
	  catch(ArithmeticException e){
	  
	    System.out.println("Error:can not divided by zero");
		
		System.out.println("Error:can not divided by zero");
		
	    
	  }
      
   }
  
}