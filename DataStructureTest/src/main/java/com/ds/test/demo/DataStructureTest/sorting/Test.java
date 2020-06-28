package com.ds.test.demo.DataStructureTest.sorting;

public class Test {
	
	public static void main(String[] args) {
		int arr[] = {6,5,1}; 
		new Test().sort(arr);
		for(int data : arr) {
			System.out.print(data + " ");
		}
	}

	public void sort(int []arr) {
		int size = arr.length;
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
