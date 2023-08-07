package com.function;

import java.util.function.Function;

public class Student_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s[]= {
				new Student(25,"prashant",96.63),
				new Student(35,"Nishant",70),
				new Student(15,"Sushant",60.36),
				new Student(85,"Mukesh",78),
				new Student(63,"Suresh",65.4),
				
		};
		
		Function<Student, String> f=g->{
										double marks=g.marks;
										if(marks>=80)
											return "Grade A";
										else if(marks>=70)
											return "Grade B";
										else if(marks>=60)
											return "Geade C";
										else
											return "Fail";
						
		                       };
		                       
		            for(Student s1 :s)
		            {
		            	System.out.println(s1.id);
		            	System.out.println(s1.name);
		            	System.out.println(s1.marks);
		            	System.out.println(f.apply(s1));
		            	System.out.println();
		            	System.out.println();
		            }

	}

}
