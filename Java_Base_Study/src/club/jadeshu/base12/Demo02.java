package club.jadeshu.base12;

import java.io.File;

/**
 * 
 * @ClassName: Demo02 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:24:59 
 * @Description: 
 * 文件夹操作
 * 创建文件夹并在此文件夹下创建10个子文件
 */
public class Demo02 {

	
	public static void main(String[] args) {
		// 1.获取当前工程路径方法一
//		File src = new File("");
//		String path = src.getAbsolutePath();
//		System.out.println(path);
		
		// 1.获取当前路径方法二
		String path = System.getProperty("user.dir");
		//System.out.println(path);
//		for (int i = 0; i < 10; i++) {
//			File srcFile = new File(path + "/test/" + i);
//			if (!srcFile.exists()) {
//				srcFile.mkdirs();
//			}
//		}
		
		// 获取C盘下的所有文件和文件夹
		File src = new File("c:/");
		if (src.exists()) {
			for (File f : src.listFiles()) {
				if (f.isFile()) {
					System.out.println(f.getName() + " 文件 ");
				} else if (f.isDirectory()){
					System.out.println(f.getName() + " 文件夹 ");
				}
				
			}
		}

	}

}
