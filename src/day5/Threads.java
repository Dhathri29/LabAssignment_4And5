package day5;

public class Threads implements Runnable{
	
	@Override
	public void run() {
		System.out.println("thread name:"+Thread.currentThread().getName());
		
	}
public static void main(String[] args) {
	Threads threads = new Threads();
	for(int i=0;i<100;i++) {
		Thread thread1= new Thread(threads);
		thread1.start();
	}
	
}


}
