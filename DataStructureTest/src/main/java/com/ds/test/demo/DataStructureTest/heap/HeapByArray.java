package com.ds.test.demo.DataStructureTest.heap;
/*
 * Author: Ajit Dubey
 */
public class HeapByArray {

	int []arr;
	int sizeOfTree;
	
	public HeapByArray(int size) {
		arr = new int[size];
		sizeOfTree = 0;
		System.out.println("Empty heap is created!");
	}
	
	public int sizeOfArray() {
		return arr.length;
	}
	
	public int sizeOfHeap() {
		return this.sizeOfTree;
	}
	
	public boolean isHeapEmpty() {
		if(sizeOfTree<=0) return true;
		return false;
	}
	
	public void deleteHeap() {
		this.arr = null;
		System.out.println("Heap deleted successfully!");
	}
	
	public void insertInHeap(int value) {
		System.out.println("Inserting "+value+" in heap!");
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree);
		System.out.println("Inserted "+value+" successfully in heap!");
		
	}
	
	public void heapifyBottomToTop(int index) {
		int parent = index/2;
		if(index<=1) return;
		
		if(arr[index]<arr[parent]) {
			int temp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = temp;
		}
		heapifyBottomToTop(parent);
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}
}
