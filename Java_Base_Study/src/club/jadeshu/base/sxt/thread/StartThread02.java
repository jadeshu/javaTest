package club.jadeshu.base.sxt.thread;

/**
 * @ClassName: StartThread02
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-21 上午4:40:45
 * @Description: 多线程网络下载图片
 */
public class StartThread02 extends Thread {
	private String url;
	private String fileName;

	public StartThread02(String url, String fileName) {
		super();
		this.url = url;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		WebDown02 wdown = new WebDown02();
		wdown.downLoader(this.url, this.fileName);
	}

	public static void main(String[] args) {
		StartThread02 sth1 = new StartThread02(
				"http://a.hiphotos.baidu.com/image/pic/item/960a304e251f95caf1852c0bc4177f3e6709521e.jpg",
				"1.jpg");
		StartThread02 sth2 = new StartThread02(
				"http://d.hiphotos.baidu.com/image/pic/item/9825bc315c6034a84d0cf125c6134954082376a3.jpg",
				"2.jpg");
		StartThread02 sth3 = new StartThread02(
				"http://f.hiphotos.baidu.com/image/pic/item/77094b36acaf2edd76f9eb55861001e939019306.jpg",
				"3.jpg");

		// 启动线程
		sth1.start();
		sth2.start();
		sth3.start();
	}

}
