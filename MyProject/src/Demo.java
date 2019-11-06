// 线程1
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread threadA = new ThreadA();
		threadA.start();
		
		Thread threadB = new ThreadB();
		threadB.start();
	}

}

class ThreadA extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread{

	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}