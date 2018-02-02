package reentrantLock1Thread;

// pc1 = monitorenter , pc2 = monitorenter

public class ReentrantLock1Thread {
	

	
	public void m(ReentrantLock1Thread x) throws InterruptedException{
		synchronized(this){
			synchronized (x) {
				System.out.println("do something");
			}
		}
	}

	public static void main(String[]args) throws InterruptedException{

		ReentrantLock1Thread x = new ReentrantLock1Thread();
		ReentrantLock1Thread y = new ReentrantLock1Thread();
		
		synchronized (x) {
			y.m(x);
		}
		
	}
}
