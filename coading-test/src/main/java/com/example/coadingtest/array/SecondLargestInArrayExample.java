package com.example.coadingtest.array;

public class SecondLargestInArrayExample {

	
	public static void main(String[] args) {
		SecondLargestInArrayExample secondMain = new SecondLargestInArrayExample();
		int arr[] = {40,10,60,5,30,50,70};
		System.out.println("Second Largest number in array is: "+secondMain.getSecondLargest(arr));
	}
	
	public static int getSecondLargest(int []a) {
		int temp;
		for(int i=0; i<a.length;i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length-2];
	}
}
