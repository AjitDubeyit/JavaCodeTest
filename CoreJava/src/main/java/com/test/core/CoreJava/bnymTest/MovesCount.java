package com.test.core.CoreJava.bnymTest;

public class MovesCount {
	
	public static void main(String[] args) {
		int movesCount = 0;
		int []ardrea = {123,543};
		int []marias = {321,279};
		
		for(int i = 0; i<ardrea.length; i++) {
			int l = ardrea[i];
			int j = marias[i];
				while(j>0 && l>0) {
					int k=j%10;
					j = j/10;
					int m = l%10;
					l = l/10;
					movesCount = movesCount+(Math.abs(k-m));
				}
				System.out.println("moves cound " + movesCount);			
			
		}		
	}
}
