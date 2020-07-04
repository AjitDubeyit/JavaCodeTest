package com.test.core.CoreJava.exception;

public class ClassNotFoundException_ {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

/* output:-
java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:602)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:333)
	at com.test.core.CoreJava.exception.ClassNotFoundException_.main(ClassNotFoundException_.java:7)
*/