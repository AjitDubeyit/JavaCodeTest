package com.test.multithreading.synchronization;

//example of java synchronized method
class Printer{
	synchronized static void printTable(int n){//synchronized method
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(400);
			}catch(Exception e){System.out.println(e);}
		}

	}
	void print (){//synchronized method
		for(int i=1;i<=5;i++){
			System.out.println("non syncronus method" +Thread.currentThread().getName());
			try{
				Thread.sleep(400);
			}catch(Exception e){System.out.println(e);}
		}

	}
}

class MyThread3 extends Thread{
	Printer t;
	MyThread3(Printer t){
		this.t=t;
	}
	public void run(){
		t.printTable(10);
	}

}

class MyThread4 extends Thread{
	Printer t;
	MyThread4(Printer t){
		this.t=t;
	}
	public void run(){
		t.printTable(100);
	}
}

public class ClassLevelLocking {
	//only one thread will access the synchronized static method because its a class level locking
	public static void main(String args[]){
		Printer obj = new Printer();//only one object
		Printer obj1 = new Printer();
		MyThread3 t1=new MyThread3(obj);
		MyThread4 t2=new MyThread4(obj1);
		t1.start();
		t2.start();
	}
}