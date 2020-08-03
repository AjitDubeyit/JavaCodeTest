package com.ds.test.demo.DataStructureTest.array.InterviewQuestions;

public class FindNonRepeatedElement {

	public static void main(String[] args) {
		int ar[] = {2, 3, 5, 4, 5, 3, 4}; 
        System.out.println("Element occurring once is " + 
                            findSingle(ar) + " "); 
	}
	
	public static int findSingle(int []a) {
		int res = a[0];
		// Do XOR of all elements and return
		for(int i=1; i<a.length; i++) {
			res = res^a[i];
		}
		return res;
	}
	
}
