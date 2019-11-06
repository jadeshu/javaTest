/**   
 * @Title: ThreadRun.java 
 * @Package it.java.base.ch02 
 * @Description: TODO
 * @author jadeshu QQ:70381915
 * @date 2016-11-14 ����6:25:05 
 * @version V1.0   
 */
package club.jadeshu.base.it.java.base.ch02;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����6:25:05 ��˵��
 */
public class ThreadRun implements Runnable {
	private  int nBaozi = 50;

	@Override
	public synchronized void  run(){
		while (nBaozi > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ":" + nBaozi);
			--nBaozi;
		}
	}

}
