package threading;

public class ThreadsExample {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
		
		MyRunnable2 myRunnable2 = new MyRunnable2();
		Thread myThread2 = new Thread(myRunnable2);
		myThread2.start();
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		int index;
		for (index = 0; index <= 4000; index++) {
			System.out.println("hello My name is sahil");
		}
	}
}
class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		int index;
		for (index = 0; index <= 4000; index++) {
			System.out.println("My instagram username is brown.mundaa__");
		}
	}
}