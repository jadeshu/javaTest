package club.jadeshu.base.it.java.base.ch02;
/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����6:17:17
 * ��˵��
 * ��Thread������-->�߳���
 */
public class ThreadEx extends Thread {
	private int nBaozi = 10;
	@Override
	public void run() {
		while(nBaozi>0){
			Thread t = currentThread();
			System.out.println(t.getName()+":"+nBaozi);
			--nBaozi;
		}
		
		super.run();
	}
}
