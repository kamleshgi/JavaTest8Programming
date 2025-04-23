package com.nic.java8.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentTest {

	public static void main(String[] args) {
		
//		(int id, String firstName, String gender, int age, String dept, String city, String raink,
//				List<String> contacts)
		//List<Student> studentList=new 
		
           List<Student> list=  Stream.of(new Student(1, "Rohit","Male",30, "Mechanical Engg","Mumbai","122",Arrays.asList("9126393499","99999999")),
				new Student(2, "RAVI","Male", 40, "Computer Science", "Delhi", "67", Arrays.asList("8826393499")),
				new Student(3, "Ankit", "Male", 50, "EEE", "Patna", "88", Arrays.asList("7826393499")),
				new Student(4, "Pulkit", "Male", 60, "Computer Science", "Patna", "98", Arrays.asList("6826393499"))).collect(Collectors.toList());
		
           System.out.println("Maximum Age ");
           Student maxage = list.stream().max((a,b)->Integer.compare(a.getAge(),b.getAge())).get();          
           System.out.println(maxage);
           
           System.out.println("Highest Rank");
           Student maxRank = list.stream().max((a,b)-> a.getRaink().compareTo(b.getRaink())).get();
           
           System.out.println(maxRank);
           
           System.out.println("Find Student whre age is greater Then 40");
           List<Student> studentGet = list.stream().filter(student->student.getAge()>40)
                        .collect(Collectors.toList());
           System.out.println(studentGet);
           
           
           
		list.stream().filter(student -> student.getAge()>40)
				.collect(Collectors.toList()).forEach(Student-> System.out.println(Student.getFirstName()));
		//System.out.println("studentage "+studentage);	
		
		
	
		List<String> studenName=	list.stream().filter(student -> student.getAge()>40).map(Student->Student.getFirstName()).collect(Collectors.toList());
	    System.out.println(studenName);
	    
	    
	    list.stream().filter(Student->Student.getFirstName().equals("Rohit")).collect(Collectors.toList())
	       .forEach(Student->System.out.println(Student.getGender()));
	    
		List<String> firsdtName=  list.stream().filter(Student->Student.getGender().equals("Male"))
		    .map(Student->Student.getFirstName()).collect(Collectors.toList());
		System.out.println("gender "+firsdtName);
		
		System.out.println("Find the Student details where gender is Male");
		
		List<Student> strudentMaleList = list.stream().filter(student->student.getGender().equalsIgnoreCase("Male")).collect(Collectors.toList());
		
	    System.out.println(strudentMaleList);
	
	List<String> sortgender=  list.stream().filter(Student->Student.getCity().equals("Patna"))
			.sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder()))
		    .map(Student->Student.getFirstName()).collect(Collectors.toList());
		 
	 System.out.println("sortgender "+sortgender);
	    
	    
	 Double avgAge=   list.stream().collect(Collectors.averagingDouble(Student->Student.getAge()));
	    
	  System.out.println("avgAge "+avgAge);  
	    
	    //List<String> listNew= (List<String>) ((Stream) Arrays.asList(Arrays.asList("777777777","666666666","222222222222"))).collect(Collectors.toList());
	    
	  List<List<String>> listString=new ArrayList<>();
	  List<String> listIn=new ArrayList<>();
	  listIn.add("Kamlesh");
	  listIn.add("Kumar");
	  listIn.add("Sngh");
	  listIn.add("Amit");
	  listIn.add("Nimit");
      listString.add(listIn);
	  //Desplay the inner List
	    
	  
	List<String> listn=  listString.stream().flatMap(l->l.stream())
			                 .collect(Collectors.toList());
	System.out.println("list in side list: "+listn);
	
	List<String> sortedList= listString.stream().flatMap(l->l.stream().sorted())
			                 .collect(Collectors.toList());
	System.out.println("sortedList : "+sortedList);
	
	  list.stream().collect(Collectors.toList()).forEach(Student->System.out.println(Student.getContacts()));
	  
	List<String> kList= list.stream().flatMap(Student->Student.getContacts().stream().limit(10)).collect(Collectors.toList());
	System.out.println("kList: "+kList);
	}

}
