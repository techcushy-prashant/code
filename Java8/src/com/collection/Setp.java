package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Setp {
	
	private int id;
	private String name;
	
	

	public Setp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return this.id+" "+this.name;
	}

	

	

	


	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Setp other = (Setp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Setp> ss=new HashSet<>();
		Setp s1=new Setp(25,"prashant");
		Setp s2=new Setp(25,"prashant");
		Setp s3=new Setp(45,"Sushant");
		
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s2);
		ss.add(s1);
		
		System.out.println(ss);
		

	}

}
