package club.jadeshu.base.sxt.io;

import java.io.File;

/**
 * @ClassName: Demo04 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:26:00 
 * @Description:
 * 列出文件的下一级
 *	1.list() :列出下级名称 
 *  2.listFiles() :列出下级File对象
 */
public class FileList01 {

	public static void main(String[] args) {

//		File file = new File("./");
//
//		String[] subNames = file.list();
//		for (String name : subNames) {
//			System.out.println(name);
//		}

		// 系统根
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
	}

}
