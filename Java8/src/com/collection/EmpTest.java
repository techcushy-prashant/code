package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> ls=new ArrayList<>();
		ls.add(new Employee(25,"Ram"));
		ls.add(new Employee(45,"Shyam"));
		ls.add(new Employee(15,"Mohan"));
		ls.add(new Employee(5,"Shyam"));
		ls.add(new Employee(55,"Sohan"));
		
		Comparator<Employee> c=(i1,i2)->(i1.empId<i2.empId)?-1:(i1.empId>i2.empId)?1:0;
	//	System.out.println(ls);
	//	Collections.sort(ls, (i1,i2)->(i1.empId<i2.empId)?-1:(i1.empId>i2.empId)?1:0); //Sorting based on empId
		ls.stream().forEach(e->{System.out.println(e);});
		System.out.println("--------------");
		Collections.sort(ls, c);
		ls.stream().forEach(em->{System.out.println(em);});
		Collections.sort(ls, (em1,em2)->em1.ename.compareTo(em2.ename));  //Sorting based on ename
		System.out.println("--------------");
		ls.stream().forEach(en->{System.out.println(en);});
		
		

	}

}
