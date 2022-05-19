package com.codifyd.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;

	private static volatile DateUtil instance;
	
	//(During Eager initialization make sure your class using atleast once)
	//private static DateUtil instance = new DateUtil();
	
//	static {
//		instance = new DateUtil();//Eager initialization
//	}
	
	private DateUtil() {
		
	}
	
	//public static synchronized DateUtil getInstance() {//Preferable
	public static DateUtil getInstance() {//Preferable
		if(instance==null) {//Double check
			synchronized(DateUtil.class) {
				if(instance==null) {//Double check
					instance = new DateUtil();//Lazy initialization
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}

//	public static DateUtil getInstance() {
//		return instance;//Eager initialization
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
	
}
