package com.test.core.CoreJava.practiceTheOutPut;

public class Test1 {
	
	public static void main(String[] args) {
		int x = 0;
		System.out.println((x++) + (++x));//(0+2)
		System.out.println((--x) + (x--));//(1+1)
		//Output:   2  
		//			2
	}

}
