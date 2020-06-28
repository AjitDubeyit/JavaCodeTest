package com.ds.test.demo.DataStructureTest.array;

public class TwoDimensionalArray {

	int arr[][]=null;
	//Constuctor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfColumns;j++) {
				arr[i][j]=Integer.MIN_VALUE;
			}
		}
	}

	public void traverseArray() {
		try {
			System.out.println("Printing the array rows....");
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]  + "  ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}catch(Exception e) {
			System.out.println("Array doesnot exist!");
		}
	}

	public void insertValueInTheArray(int row, int column, int value) {
		try {
			if(arr[row][column]==Integer.MIN_VALUE) {
				arr[row][column] = value;
				System.out.println("Successfully inserted " + value + "in the Array");
			} else {
				System.out.println("This cell is already occupied by another value!");
			}

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access Array!");
		}
	}

	public void accessingSingleCell(int row, int col) {
		System.out.println("accessing Single Cell");
		try {
			System.out.println("Cell value is: " + arr[row][col]);

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access an array!");
		}
		System.out.println();
	}
	
	public void searchingSingleValue(int value) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==value) {
					System.out.println("Value is found at location Row: " + i + " Column : " + j +"\n\n");
					return;
				}
			}
		}
		System.out.println("Value does not found in the array!");
	}

	public void deleteValueFromArray(int row, int col) {
		try {
			System.out.println("Deleting value from row: "+row+" Column : " + col);
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Value is deleted successfullly from cell!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index we can not delete!");
		}
	}
	
	public void delteThisArray() {
		arr=null;
		System.out.println("Array has been successfully deleted!");
	}
	
	
	public static void main(String[] args) {
		TwoDimensionalArray arr = new TwoDimensionalArray(5, 5);
		arr.traverseArray();
		arr.insertValueInTheArray(0, 2, 5);
		arr.traverseArray();
		arr.insertValueInTheArray(0, 2, 5);
		arr.traverseArray();
		arr.accessingSingleCell(0, 2);
		arr.searchingSingleValue(5);
		arr.deleteValueFromArray(0, 2);
		arr.delteThisArray();
	}
}
