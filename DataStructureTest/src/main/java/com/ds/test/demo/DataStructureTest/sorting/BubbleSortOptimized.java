package com.ds.test.demo.DataStructureTest.sorting;

public class BubbleSortOptimized {
	
	boolean isSwapped;
	public void sort(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			isSwapped = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}
		}
	}
	
	public void printElement(int arr[]) {
		for(int i=0;i<arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSortOptimized bso = new BubbleSortOptimized();
		int arr[] = {5,20,10,4,7,40,23};
		bso.sort(arr);
		bso.printElement(arr);
	}
}
