public class ThrowsDemo{

      public ststic void print(String str) throws NullpointerException{
	  
	   System.out.println("length :"+str.length());
	  }
	  
	  public static void main(String[] args){
	  
	   String name=null;
	   
	   try{
	     print(name);
	   }
	   catch(NullpointerException e){
	   
	    System.out.println("NullpointerException :"+e.getMessage());
	   }
	  }
}