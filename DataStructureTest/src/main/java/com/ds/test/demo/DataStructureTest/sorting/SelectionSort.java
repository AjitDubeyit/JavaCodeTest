package com.ds.test.demo.DataStructureTest.sorting;


//Select smallest element from array and swap out at right position
public class SelectionSort {

	public void selectionSort(int []arr) {
		int n = arr.length;
		int small,pos;
		for(int i=0; i<n; i++) {
			small = arr[i];
			pos = i;
			for(int j=i+1; j<n; j++) {
				if(small>arr[j]) {
					small=arr[j];
					pos=j;
				}
			}
			if(pos!=i) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
			}

		}
	}

	public void  display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int arr[] = {70,30,40,10,80,20};
		sort.selectionSort(arr);
		sort.display(arr);
	}
}
