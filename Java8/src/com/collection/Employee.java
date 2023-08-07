package com.collection;

public class Employee {
	
	 public int empId;
	 public String ename;
	
	public Employee(int empId, String ename) {
		
		this.empId = empId;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
