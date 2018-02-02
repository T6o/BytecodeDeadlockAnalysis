package nestedThread;

public class nestedThread {


	public static void main(String[] args) {
		
		Thread t1 = new Thread(){

			@Override
			public void run() {
				Object o = new Object();
				synchronized(o){
					Thread t2 = new Thread(){
						@Override
						public void run(){
							synchronized(o){
								System.out.println("print by t2");
							}
						}
					};
					
					Thread t3 = new Thread(){
						@Override
						public void run(){
							synchronized(o){
								System.out.println("print by t3");
							}
						}
					};
					
					t2.start();
					t3.start();
				}
			}
		};
		
		t1.start();
		

	}

}
