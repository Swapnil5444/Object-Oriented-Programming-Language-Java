
public class MyRunnable implements Runnable {
	
    @Override
	public void run() {
		System.out.println("In Run " + Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		t.start();
		
		Thread t1 = new Thread(() -> System.out.println("In Run "));
		t1.start();
	}

}
