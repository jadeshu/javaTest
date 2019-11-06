package club.jadeshu.base.sxt.thread;

/**
 * @ClassName: StartThread01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-21 上午4:40:45 
 * @Description:
 * 创建线程  
 * 1.继承Thread + 重写run()方法
 * 2.调用start方法
 */
public class StartThread01 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println("一边唱歌");
		}
	}
	
	public static void main(String[] args) {
		StartThread01 th = new StartThread01();
		th.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.println("一边写代码");
		}
	}

}
