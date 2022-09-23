package Multithreading;

public class MyThread2 implements Runnable{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	MyThread2 myThread2 = new MyThread2();
	Thread thread1 = new Thread("my thread2");
	thread1.setName("Thread 1");
	thread1.start();
	
	Thread thread2 = new Thread(myThread2);
	thread2.setName("Thread 2");
	thread2.start();
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				Thread.sleep(1400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("executing thread :"+Thread.currentThread().getName());


		}
		
	}

}
