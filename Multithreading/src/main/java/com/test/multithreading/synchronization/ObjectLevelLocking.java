package com.test.multithreading.synchronization;

/*Object level locking is a mechanism when you want to synchronized non static method or 
 * non static code block such that only one thread will be able to execute that code block 
 * on given instance of the class. 

 * other non-synchronized method will be sxecute simulitously.
*/
class Table{
	synchronized void printTable(int n){//synchronized method
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

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(100);
	}

}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(10);
	}
}

public class ObjectLevelLocking {
	public static void main(String args[]){
		Table obj = new Table();//only one object
		Table obj1 = new Table();//only one object
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj1);
		t1.start();
		t2.start();
	}
}