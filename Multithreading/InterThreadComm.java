package Multithreading;

class Cutomer{
	private int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw Rs. "+amount);
		if(this.amount<amount) {
			System.out.println("Less Balance.Waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw completes");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit Rs."+amount);
		this.amount+=amount;
		System.out.println("deposit completes Balance : Rs."+this.amount);
		notify();
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cutomer cutomer = new Cutomer();
		new Thread("Priya") {
			public void run() {cutomer.withdraw(10000);};
				
		}.start();
		
		new Thread("Sri") {
			public void run() {cutomer.deposit(20000);};
			
		}.start();

	}

}
