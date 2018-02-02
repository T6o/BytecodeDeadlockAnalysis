package joinThis;

public class JoinThis {


	public static void main(String[] args) {
		
		Thread t1 = new Thread(){

			@Override
			public void run() {
				System.out.println("doing something and trying to wait for myself");
				try {
					Thread.currentThread().join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("never reach this line");
			}
		};
		
		t1.start();
		System.out.println("main program reaches this line");
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main program cannot reach this line though");


	}

}
