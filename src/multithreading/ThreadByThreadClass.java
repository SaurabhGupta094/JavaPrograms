package multithreading;

class MyThread extends Thread {

//	public void start() {
//		// super.start();
//		System.out.println("Start method");
//	}

	public void run() {

		System.out.println("Run Class");

	}
}

public class ThreadByThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
//		MyThread t1 = new MyThread();
//		t1.start();
		System.out.println("Main Method");

	}

}
