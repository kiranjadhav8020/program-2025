            //Encapsulation 
			
			
			 class Student{
			   
			   private String name;
			   private int age;
			   
			   public void setName(String name){
			     this.name=name;
			   }
			   public String getName(){
			     return name;
			   }
			   
			   public void setAge(int age){
			   if(age > 0){
			    this.age=age;
			   }else{
				   System.out.println("age must be grater than 0");
				   
			   }
			   }
			   
			   public int getAge(){
			     return age;
			   }
		
			}
			public class EncapsulationDemo{
			
			  public static void main(String[] args){
			    Student s1= new Student();
				s1.setAge(23);
				s1.setName("ANITA");
				
				System.out.println("Age of student :"+ s1.getAge());
				System.out.println("Name :"+s1.getName());
			  }
			}