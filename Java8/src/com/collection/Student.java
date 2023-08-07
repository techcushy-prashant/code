package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student
{
	  public static void main(String [] args)
	  {
		  ArrayList<Integer> ls=new ArrayList<Integer>();
		  ls.add(65);
		  ls.add(36);
		  ls.add(13);
		  ls.add(79);
		  ls.add(25);
		  ls.add(10);
		  System.out.println(ls);
		  Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		  Collections.sort(ls,c);
		  ls.stream().forEach(a->{
			  System.out.print(a+" ");
		  });
		  System.out.println();
		  List ls1=ls.stream().filter(j->j%2==0).collect(Collectors.toList());
		  ls1.stream().forEach(t->{System.out.print(t+" ");});
		  //System.out.println(ls);
		 
		  
	  }
}