                   //single inheritance

                	class Employee{
					  void work(){
					  System.out.println("Employee is working");
					  }
					}
					
					class Manager extends Employee{
					
					  void manageaTeam(){
					   System.out.println("Manager is managing the team");
					  }
					}
					
					public class SingleDemo{
					   public static void main(String[] args){
					     Manager m1= new Manager();
						 m1.work();
						 m1.manageaTeam();
					   }
					}