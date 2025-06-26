   public class NestedTryCatch{
   
     public static void main(String[] args){
	 
	 try{
	 
	    try{
		
		  int div=20/0;
		}
		catch(Exception e){
		
		  System.out.println("inner catch :"+e.getMessage());
		}
		
		String s=null;
		
		System.out.println(str.length());
	 }
	 catch(Exception e){
	 
	   System.out.println("outer catch :"+e.getMessage)
	 }
	 
	 }
   }