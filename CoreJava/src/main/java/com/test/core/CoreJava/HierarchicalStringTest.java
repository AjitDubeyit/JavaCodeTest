package com.test.core.CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HierarchicalStringTest {

	public static void main(String[] args) {
		
		String s = "{\nMoney Heist\n{\nThe most important character Professor\n}\n{\nAnother character is Berlin\n{\nBerlin is in charge of the heist\n}\n}\n{\nAnother character is Moscow\n{\nMoscow is Denver's father\n}\n}\n{\nAnother character is Rio\n{\nRio is a computer programmer\n{\nRio is also a good hacker\n{\nRio is very happy to be a part of the heist\n}\n}\n}\n}\n{\nAnother character is Denver\n}\n}\n";
		String s1 = "";
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
			List<String> list = new ArrayList<String>();
			
			if(s.charAt(i) == '{') {
				count++;
				System.out.println("Inside Level1");
				s1="";
			} else if(count==1) {
				s1=s1.concat(String.valueOf(s.charAt(i)));
				list.add(s1);
				map.put("Level1", list);
			}
		}
		
		System.out.println(map);
		
		
	}
}
