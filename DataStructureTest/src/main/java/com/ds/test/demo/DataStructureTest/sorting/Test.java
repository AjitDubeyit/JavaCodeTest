package com.ds.test.demo.DataStructureTest.sorting;

public class Test {
	int arr[];
	int tempArr[];
	
	public static void main(String[] args) {
		Test ms = new Test();
		int arr[] = {10,50,20};//{80,1,20,10,60,40,80};
		ms.sort(arr);
		System.out.println("Sorted Data");
		for(int data:arr)
			System.out.print(data + " ");
	}
	public void sort(int arr[]) {
		this.arr = arr;
		int size =arr.length;
		this.tempArr = new int[size];
		devideArray(0,size-1);
	}
	
	private void devideArray(int startPos, int endPos) {
		if(startPos<endPos) {
			int middle = (startPos+endPos)/2;
			devideArray(0, middle);
			devideArray(middle+1, endPos);
			merge(startPos, middle, endPos);
		}
	}
	
	private void merge(int startPos, int middle, int endPos) {
		for(int i=startPos;i<=endPos; i++) {
			tempArr[i] = arr[i];
		}
		
		int i = startPos;
		int j = middle+1;
		int k = startPos;
		
		while(i<=middle && j<=endPos) {
			if(tempArr[i]<tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			} else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle) {
			arr[k] = tempArr[i];
			i++;
			k++;
		}
	}
}
