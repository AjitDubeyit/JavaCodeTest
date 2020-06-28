package com.ds.test.demo.DataStructureTest;

public class Test {


	public void bubbleSort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void selectionSort(int arr[]) {
		int small, pos;
		for(int i=0;i<arr.length;i++) {
			small = arr[i];
			pos = i;
			for(int j=i+1;j<arr.length;j++) {
				if(small>arr[j]) {
					small = arr[j];
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
	
	
	private void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		int arr[] = {50,30,60,20,70,10};
		t.bubbleSort(arr);
		//t.selectionSort(arr);
		t.print(arr);
	}
}
