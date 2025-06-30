import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;

public class MyTest2{


	
	public static void main(String [] args){
		
			
		Set<Student1> set=new HashSet<>();
		
			Student1 s1=new Student1(1,"kiran","pune");
			Student1 s2=new Student1(2,"Rohit","Latur");
			Student1 s3=new Student1(3,"Rahul","Mumbai");
			Student1 s4=new Student1(4,"Shiva","Nashik");
			Student1 s5=new Student1(5,"kiran","pune");
			Student1 s6=new Student1(1,"kiran","pune");
			
		set.add(s1);
		set.add(s1);
		//set.add(s3);
		//set.add(s4);
		//set.add(s5);
		//set.add(s6);
			
		set.forEach(System.out::println);
			
		String str="Kiran Babasaheb Jadhav";	
			
			
			Stream.of(str.split(" "))
                                 .sorted(Collections.reverseOrder()).forEach(System.out::println);
		

			
	}


}

