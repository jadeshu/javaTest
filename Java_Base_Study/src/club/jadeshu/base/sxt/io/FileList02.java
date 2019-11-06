package club.jadeshu.base.sxt.io;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @ClassName: Demo05 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:26:20 
 * @Description:
 * 递归 
 * 1.递归头：何时结束递归 
 * 2.递归体：重复调用
 * 利用递归 打印文件夹下的所有子文件
 */
public class FileList02 {

	public static void main(String[] args) {

		File file = new File(
				"C:/Users/Administrator/Desktop/javaBaseLx/Java_Base_Study");
		printFileName(file, 0);
		// printNumber(1, 20);
	}

	// 打印beginNum-endNum以内数字
	public static void printNumber(int beginNum, int endNum) {
		if (beginNum > endNum) { // 结束递归
			return;
		}

		System.out.println(beginNum);
		printNumber(beginNum + 1, endNum); // 方法调用自己
	}

	// 打印文件夹内的所有子文件
	public static void printFileName(File src, int deep) {
		for (int i = 0; i < deep; i++) {
			System.out.print("-");
		}
		System.out.println(src.getName());
		if ( null == src || !src.exists()) {
			return;
		} else if (src.isDirectory()) { // 目录
			for (File subFile : src.listFiles()) {
				printFileName(subFile, deep + 1);
			}
		}
	}

}
