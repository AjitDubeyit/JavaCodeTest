package com.test.core.CoreJava.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationSingleton {
	
	public static void main(String[] args) throws Exception {
		Singleton instanceOne = Singleton.getInstance();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.text"));
		Singleton instanceTwo = (Singleton)in.readObject();
		in.close();
		
		System.out.println("Instance 1 hashcode : " + instanceOne.hashCode());
		System.out.println("Instance 2 hashcode : " + instanceTwo.hashCode());
	}
}
