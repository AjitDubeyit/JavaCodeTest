package com.ds.test.demo.DataStructureTest.array.InterviewQuestions;
//Find Largest pair sum in unsorted array
public class LargestPairSum {
	
	public int largestPairSum(int arr[]) {
		int first,second;
		
		if(arr[0]>arr[1]) {
			first = arr[0];
			second = arr[1];
		} else {
			first = arr[1];
			second = arr[0];
		}
		
		for(int i = 2; i<arr.length; i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			} else if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		return (first+second);
	}
	
	public static void main(String[] args) {
		LargestPairSum lps = new LargestPairSum();
		int arr[] = {2,5,1,-6,7,2,-3};
		System.out.println(lps.largestPairSum(arr));
	}
}
