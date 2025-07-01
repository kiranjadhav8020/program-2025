                                 //Data Hiding
								 
								 
			class Employee{
			  private String name;
			  private double salary;
			  
			  public void setName(String name){
			    this.name=name;
			  }
			 public String getName(){
			   return name;
			 }  
			   public void setSalary(double salary){
			     this.salary=salary;
			   
			 }
			 public double getSalary(){
			     return salary;
			 }
			}		
           		

			public class DataHide{
			   public static void main(String[] args){
			   
			    Employee emp = new Employee();
				emp.setName("Anita");
				emp.setSalary(50000);
				
				System.out.println("Name :"+emp.getName());
				System.out.println("salary :"+emp.getSalary());
			   }
			}