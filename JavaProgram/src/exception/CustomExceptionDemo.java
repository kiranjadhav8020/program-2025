class AgeException extends Exception{

   public AgeException(String message){
   
     super(message);
   }
}
public class CustomExceptionDemo{

  public static void main(String[] args){
  
   try{
     checkAge(17);
   }catch(AgeException e){
     System.out.println("Exception :"+e.getMessage());
   }
  }
  
   public static void checkAge(int age)throws AgeException{
   
     if(age<18){
	   throw new AgeException("Age must be 18");
	 }
   }
}