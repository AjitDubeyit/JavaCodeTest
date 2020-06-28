package com.java8.demo.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {	
		/*List<String[]> data = new ArrayList<String[]>();
		data.add(new String[]{"abc","xyz"});
		System.out.println("Original Data: "+data.toString());*/
		
		String[] strArray = {"A","B","C"};
		
		List<String> list = Arrays.asList(strArray);
		//Optional is a class that present in java.util package
		Optional<String> optionalFind = getTest(list,"A");
		
		String val = null;
		
		if(optionalFind.isPresent()) {
			val = optionalFind.get();
			System.out.println("Value is present [ " + val + " ]");
		} else {
			
			System.out.println("There is no value of name [ " + val + " ]");
		}	
	}
	
	public static Optional<String> getTest(List<String> list, String str){
		for(String s:list) {
			if(s.equalsIgnoreCase(str)) {
				return Optional.of(str);
			}
		}
		return Optional.empty();
	}
}
