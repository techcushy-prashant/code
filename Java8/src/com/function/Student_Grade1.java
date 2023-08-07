package com.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class Student_Grade1 {
	
	int id;
	String name;
	double marks;
	
	

	public Student_Grade1(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s[]= { 
				new Student(56,"Ram",69.63),
				new Student(73,"Shyam",53.4),
				new Student(36,"Mohan",47),
				new Student(12,"Mohit",79.3),
				new Student(70,"Mukesh",11.63),
		};
		
		Predicate<Student> p=m->m.marks>50;
		
		Function<Student, String> fn=m->{
			double marks=m.marks;
			if(marks>=60)
				return "Grade A";
			else if(marks>=52)
				return "Grade B";
			else if(marks>=45)
				return "Grade C";
			return "Fail";
			
		};
		
		for(Student s1:s)
		{
			if(p.test(s1))
			{
				System.out.println(s1.id);
				System.out.println(s1.name);
				System.out.println(s1.marks);
				System.out.println(fn.apply(s1));
				System.out.println();
				System.out.println();
			}
		}

	}

}
