package com.ds.test.demo.DataStructureTest.array.InterviewQuestions;

public class CommonElementFromThreeArrays {
	
	private void findCommon(int []arr1, int []arr2, int arr3[]) {
		
		int i = 0; int j = 0; int k = 0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
				
			} else if(arr1[i]<arr2[j]) {
				i++;
			} else if(arr2[j]<arr3[k]) {
				j++;
			} else {
				k++;
			}
		}
	}
	public static void main(String[] args) {
		CommonElementFromThreeArrays ob = new CommonElementFromThreeArrays(); 
		// it only work if elements in both arrays are in sorted form
        int ar1[] = {1, 5, 10, 20, 40, 80}; 
        int ar2[] = {6, 7, 20, 80, 100}; 
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
  
        System.out.print("Common elements are "); 
        ob.findCommon(ar1, ar2, ar3); 
	}

}