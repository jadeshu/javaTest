package club.jadeshu.base.sxt.io;

import java.io.File;

/**
 * @ClassName: Demo06 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:26:37 
 * @Description:统计文件夹的大小
 */
public class DirSize {
	private static int len = 0;

	public static void count(File src) {

		if (null != src && src.exists()) {
			if (src.isFile()) { // 文件大小
				len += src.length();
			} else { // 子孙级
				for (File subFile : src.listFiles()) {
					count(subFile);
				}
			}
		}
	}

	public static void main(String[] args) {

		File file = new File(
				"C:/Users/Administrator/Desktop/javaBaseLx/Java_Base_Study");
		count(file);
		System.out.println(len);
	}

}
