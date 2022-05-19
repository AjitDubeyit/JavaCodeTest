package com.codifyd.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil d1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/WorkSpace/singletonstream/dateUtil.ser")));
		oos.writeObject(d1);
		
		DateUtil d2 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/WorkSpace/singletonstream/dateUtil.ser")));
		d2 = (DateUtil) ois.readObject();
		
		DateUtil d3 = DateUtil.getInstance();
		System.out.println(d1 == d2);
		
		oos.close();
		ois.close();
		

	}

}
