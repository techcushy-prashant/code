package com.function;

import java.util.function.Function;

public class Function_Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> fn1=i->i*2;
		Function<Integer, Integer> fn2=j->j*j*j;
		
		System.out.println(fn1.andThen(fn2).apply(2));
		System.out.println(fn1.compose(fn2).apply(2));

	}

}
