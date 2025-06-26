  public class DefaultException{
  
    public static void main (String [] args){
		
		DefaultException d1=new DefaultException();
		
		d1.test1(0);
		
	  try {
		  
            d1.test2(16); 
			
        } catch (ArithmeticException e) {
			
            System.out.println("Exception caught: " + e.getMessage());
        }
	
	}
	
	public void test1(int a){
		
			try{
				
				int result=a/2;
				
			}catch(ArithmeticException e){
				
				System.out.println("Exception accured due to divided by 0 ");
				
			}
		
	}
	
	 // This method declares it might throw an exception
    public static void test2(int a) throws ArithmeticException {
        
			int result = a/2;
			
    }
  
  }