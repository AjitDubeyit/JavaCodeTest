package com.ds.test.demo.DataStructureTest.array.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class AllPairOfSumOfGivenNo {
	
	
	public static void main(String[] args) {
		/*int no = 10;
		List list = new ArrayList();
		for(int i = 1; i<no; i++) {
			for(int j = i; j<no; j++) {
				if(no == (i+j)) {
					list.add(i+","+j);
				}
			}
		}
		System.out.println(list);
		*/
		AllPairOfSumOfGivenNo p = new AllPairOfSumOfGivenNo();
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		p.printPairUsingSet(numbers, 11);
	}

	//{ 2, 4, 3, 5, 7, 8, 9 };
	private void printPairUsingSet(int []number, int sum) {//sum=11
		if(number.length<2) {
			return;
		}
		
		Set set = new HashSet(number.length);//9,7,8,6,4,3,2
		
		for(int no:number) {
			int b = sum-no;
			//c = a + b
			
			if(!set.contains(b)) {
				set.add(no);
			} else {
				System.out.printf("(%d, %d) %n", no, b);
			}
		}
	}
}
