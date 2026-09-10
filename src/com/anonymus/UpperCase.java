package com.anonymus;

import java.util.function.Function;

class X implements Function<String, Boolean>{

	@Override
	public Boolean apply(String str) {
		return str.length()>10;
	}
	
}

public class UpperCase {
	
	public static void main(String[] args) {
		Function<String , Boolean> fx=new X();
		System.out.println(fx.apply("java is awesome and torture"));
		
		Function<String ,String> fun=new Function<String, String>() {
			
			@Override
			public String apply(String str) {
				return str.toUpperCase();
			}
		};
		
		System.out.println(	fun.apply("Hanok Babu is hard worker"));
	}

}
