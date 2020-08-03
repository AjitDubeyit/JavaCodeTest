package com.ds.test.demo.DataStructureTest.array.InterviewQuestions;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }
	
	}
	
	public static int[] removeDuplicates(int[] numbersWithDuplicates) {
		Arrays.sort(numbersWithDuplicates);//it will work only if data is in sorted form
		int []result = new int[numbersWithDuplicates.length];
		int previous = numbersWithDuplicates[0];
		result[0] = previous;
		
		for(int i=1; i<numbersWithDuplicates.length; i++) {
			int ch = numbersWithDuplicates[i];
			if(previous!=ch) {
				result[i]=ch;
			}
			previous = ch;
		}
		return result;
	}

}
