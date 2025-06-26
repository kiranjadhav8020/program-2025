  public class MultipleCatchDemo{ ()
   
        public static void main(String[] args){
		
		  try{
		       int[] arr=new int[6];
			   System.out.println(arr[8]);
		  }
		  catch(ArithmaticException e){
		  
		   System.out.println("ArithmaticException");
		  }
		  catch(ArrayIndexOutOfBoundException e){
		  
		   System.out.println("ArrayIndexOutOfBoundException");
		  }
		  catch(Exception e){
		  
		   System.out.println("Generic Exception");
		  }
		}
         
  }