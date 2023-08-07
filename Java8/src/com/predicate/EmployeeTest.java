package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> al=new ArrayList<>();
		al.add(new Employee(25,"Prashant",296.35));
		al.add(new Employee(35,"Nishant",936.45));
		al.add(new Employee(45,"Sushant",196.65));
		al.add(new Employee(75,"Mukesh",1396.35));
		
		Predicate<Employee> p=e->e.salary>500;
		
		for(Employee em:al)
		{
			if(p.test(em))
			{
				System.out.println(em);
			}
		}
		
		
		
		

	}

}
