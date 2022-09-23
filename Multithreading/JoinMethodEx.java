package Multithreading;

import java.util.Iterator;

public class JoinMethodEx extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JoinMethodEx t1 = new JoinMethodEx();
		JoinMethodEx t2 = new JoinMethodEx();
		JoinMethodEx t3 = new JoinMethodEx();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		
		for (int i = 1; i <=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
	}
	

	
	

}
