package day5;

import java.util.Random;

class Sumthreads implements Runnable{
	int sum=0;
	@Override
	public void run() {
		Random random = new Random();
		
		int val=random.nextInt(10);
		//System.out.println(val);
		System.out.println("thread is:"+val);
		sum=sum+val;
		
	}
	public void printSum() {
		System.out.println("sum is " +sum);
	}
}
public class Threads5 {
public static void main(String[] args) {
	Sumthreads s= new Sumthreads();
	
	Thread t1= new Thread(s);
	Thread t2= new Thread(s);
	Thread t3= new Thread(s);
	Thread t4= new Thread(s);
	Thread t5= new Thread(s);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	try {
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	s.printSum();
	System.out.println("main end");
}
}
