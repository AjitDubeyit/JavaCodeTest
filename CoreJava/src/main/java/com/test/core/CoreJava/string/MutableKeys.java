package com.test.core.CoreJava.string;

import java.util.Set;
import java.util.TreeSet;

public class MutableKeys {

	
		public static void main(String[] args) {
			
			Set<StringBuffer> sb=new TreeSet<StringBuffer>(new Comparatorbuff());
			StringBuffer one = new StringBuffer("one");
	        StringBuffer  two = new StringBuffer("two");
	        StringBuffer three = new StringBuffer("three");
	        sb.add(one);
	        sb.add(two);
	        sb.add(three);
	        
	        System.out.println("set before change: "+ sb);
	        one.append("onemore");
	        System.out.println("set After change: "+ sb);
			
//	        StringBuffer one = new StringBuffer("one");
//	        StringBuffer  two = new StringBuffer("two");
//	        StringBuffer three = new StringBuffer("three");
//	        Set<StringBuffer> sb=new TreeSet<StringBuffer>();
//	        sb.add(one);
//	        sb.add(two);
//	        sb.add(three);
//	        System.out.println("set before change: "+ sb);
//	        one.append("onemore");
//	        System.out.println("set After change: "+ sb);
	    }


}
