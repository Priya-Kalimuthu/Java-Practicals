package Multithreading;

class PrintTable{
	public void print(int n) {
		synchronized (this) {
			
			for (int i = 1; i <=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println(n*i);
				
			}
			
		}
		
	}
}

class Thread1 extends Thread{
	public static Thread1 t1;
	public static Thread1 t2;
	PrintTable printTable;
	
	public Thread1(PrintTable printTable) {
		this.printTable=printTable;
	}
	
	@Override
	public void run() {
		printTable.print(3);
	}
}

class Thread2 extends Thread{
	PrintTable printTable;

	public Thread2(PrintTable printTable) {
		
		this.printTable = printTable;
	}
	
	@Override
	public void run() {
		printTable.print(7);
	}
		
}

public class SynchronizedBlockEx {

	public static void main(String[] args) {
		PrintTable printTable = new PrintTable();
		Thread1 t1 = new Thread1(printTable);
		Thread1 t2 = new Thread1(printTable);
		t1.start();
		t2.start();
		
		

	}

}
