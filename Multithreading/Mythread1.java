package Multithreading;

public class Mythread1 extends Thread {
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("executing thread :"+getName());
		}
	}

	public static void main(String[] args) {
		
		Mythread1 thread1 = new Mythread1();
		thread1.setName("Thread1");
		thread1.start();
		
		Mythread1 thread2 = new Mythread1();
		thread2.setName("Thread2");
		thread2.start();
		
		System.out.println("Hiii");
		
	

	}

}
