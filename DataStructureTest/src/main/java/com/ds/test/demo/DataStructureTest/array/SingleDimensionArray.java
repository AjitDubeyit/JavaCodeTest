package com.ds.test.demo.DataStructureTest.array;

public class SingleDimensionArray {

	int arr[] = null;
	
	//construcgtor
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void traverseArray() {
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}catch(Exception e) {
			System.out.println("Array no longer exist!");
		}
	}
	
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[valueToBeInserted]==Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Sucessfully inserted " + valueToBeInserted + " at location : " + location);
			} else {
				System.out.println("This cell is already occupied with another value!");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
	}
	
	public void accessCell(int cellNumber) {
		try {
			System.out.println(arr[cellNumber]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
	}
	
	public void searchingInAnArray(int valueToSearch) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("Index of " + valueToSearch + " is " + i);
				return;
			}
		}
		System.out.println("Value to search is not found in array! " );
	}
	
	public void deleteValueFromArray(int valueToDelete) {
		try {
			arr[valueToDelete] = Integer.MIN_VALUE;
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	}
	
}
