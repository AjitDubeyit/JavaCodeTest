package com.example.coadingtest.array;

public class SecondLargestInArrayExample {

	
	public static void main(String[] args) {
		SecondLargestInArrayExample secondMain = new SecondLargestInArrayExample();
		int arr[] = {40,10,60,5,30,50,70};
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i]>secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second Largest number in array is: " + secondLargest);
	}
}
