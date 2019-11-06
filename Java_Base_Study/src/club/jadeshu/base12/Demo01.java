package club.jadeshu.base12;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import club.jadeshu.base.Test99;

/**
 * @ClassName: Demo01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:24:41 
 * @Description:1.创建并获取文件的基本信息
 */
public class Demo01 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		if (!file.exists()) {
			System.out.println("未在指定目录下找到test.txt文件\r\n正在创建文件...");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("文件创建成功...");
		} else {
			System.out.println("找到文件名为\"Test.txt\"的文本文件");
			if (file.isFile() && file.canRead()) {
				System.out.println("文件可读，正在读取内容...");
				System.out.println("文件绝对路径为:" + file.getAbsolutePath());
				System.out.println("文件名为:" + file.getName());
				System.out.println("文件的大小为:" + file.length());
				System.out.println("文件是否隐藏" + file.isHidden());
				long modiTime = file.lastModified();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = sdf.format(new Date(modiTime));
				System.out.println("文件最后修改时间为:" + time);
				
				file.delete();
				System.out.println("文件已删除...");
			} else {
				System.out.println("文件不可读...");
			}
		}
	}

}
