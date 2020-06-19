package multithreading;

class MyRunnable extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Method");
		System.out.println("Run Method");
	}

}

public class ThreadByRunnableInterface {
	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.start();
		t.setPriority(10);
		System.out.println("Main Method");
		System.out.println("Main Method");
	}

}
