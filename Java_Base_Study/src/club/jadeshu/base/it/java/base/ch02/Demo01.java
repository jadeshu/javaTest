package club.jadeshu.base.it.java.base.ch02;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����6:15:25 ��˵�� �߳�ʵ��
 */
public class Demo01 {
	public static void main(String[] args) {
		/*ThreadEx te1 = new ThreadEx();
		ThreadEx te2 = new ThreadEx();
		te1.start();
		te2.start();*/
		ThreadRun tr1 = new ThreadRun();
		Thread t11 = new Thread(tr1);
		Thread t22 = new Thread(tr1);
		Thread t33 = new Thread(tr1);
		
		t11.start();
		t22.start();
		t33.start();
	}
	
	
}
