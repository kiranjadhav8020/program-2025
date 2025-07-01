                          //Abstraction
						  
				abstract class school{
				
				   abstract void teaching();
				   
				   public void playing(){
				    
					System.out.println("student playing");
				   }
				}		  
				
				class teacher extends school{
				
				  public void teaching(){
				  
				  System.out.println("teacher teaching");
				  }
				}
				
				public class AbstractionDemo{
				
				public static void main(String[] args){
				
				  school s1=new teacher();
				  
				  s1.playing();
				  s1.teaching();
				}
				
				}