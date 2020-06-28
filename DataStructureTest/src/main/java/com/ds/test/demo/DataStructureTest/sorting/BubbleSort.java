package com.ds.test.demo.DataStructureTest.sorting;
//Bubble sort has a worst-case and average complexity of О(n2)
//O(n log n) when the list is already sorted
public class BubbleSort {
	
	public void sort(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int arr[] = {5,6,2};//,9,3,4,1
		sort.sort(arr);
		sort.printArray(arr);
	}
}
