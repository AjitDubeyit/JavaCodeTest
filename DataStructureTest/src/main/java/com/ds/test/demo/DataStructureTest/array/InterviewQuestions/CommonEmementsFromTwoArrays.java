package com.ds.test.demo.DataStructureTest.array.InterviewQuestions;

public class CommonEmementsFromTwoArrays {
	
	private void findCommon(int []arr1, int []arr2) {
		
		int i = 0; int j = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				
			} else if(arr1[i]<arr2[j]) {
				i++;
			} else {
				j++;
			}
		}
	}
	public static void main(String[] args) {
		CommonEmementsFromTwoArrays ob = new CommonEmementsFromTwoArrays(); 
		// it only work if elements in both arrays are in sorted form
        int ar1[] = {1, 5, 10, 20, 40, 80}; //i
        int ar2[] = {6, 7, 20, 80, 100}; //j
       
        System.out.print("Common elements are "); 
        ob.findCommon(ar1, ar2); 
	}

}
