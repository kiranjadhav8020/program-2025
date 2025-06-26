        //overriding
		//()
		
		class vehicle{
		 
		 public void start(){
		   System.out.println("vehicle start");
		 }
		}
		
		class car extends vehicle{
		   //override
		 public void start(){
		   System.out.println("car is start with key");
		 }
		}
		
		public class vehicle1{
		
		public static void main(String[] args){
		
		   vehicle v=new vehicle();
		       v.start();
		   car c=new car();
			  c.start();
			vehicle v1=new car();
              v1.start();			
			
		}
		}