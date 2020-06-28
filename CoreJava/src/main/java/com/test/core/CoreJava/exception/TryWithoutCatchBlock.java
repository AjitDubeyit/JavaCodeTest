package com.test.core.CoreJava.exception;

import java.io.BufferedReader;
import java.util.zip.InflaterInputStream;

public class TryWithoutCatchBlock {

	public static void main(String[] args) {
		try{
			System.out.println("Inside try block!");
			throw new NullPointerException();
			
		}finally {
			System.out.println("Inside finally block!");
		}
	}
}
