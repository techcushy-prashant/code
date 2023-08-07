package com.function;

import java.util.function.Function;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> fn=i->i*i;
		System.out.println(fn.apply(4));
		Function<String, Integer> fn1=s->s.length();
		System.out.println(fn1.apply("Prashant kumar"));
		Function<String, String> fn2=s->s.toUpperCase();
		System.out.println(fn2.apply("PrashNT KUMar"));

	}

}
