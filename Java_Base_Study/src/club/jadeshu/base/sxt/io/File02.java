package club.jadeshu.base.sxt.io;

import java.io.File;

/**
 * @ClassName: Demo02 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:25:30 
 * @Description:
 * 相对路径与绝对路径
 * 相对路径相对于项目工程路径
 */
public class File02 {

	public static void main(String[] args) {
		File file = new File("bin/te.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println(file.length());
	}

}
