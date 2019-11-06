package club.jadeshu.base.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName: Demo08 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:27:01 
 * @Description:
 * 读取File文件步骤 
 * 1.创建源 
 * 2.选择流 
 * 3.操作 
 * 4.释放资源
 */
public class FileInputStream01 {

	public static void main(String[] args) {
		File src = new File("read.txt");

		FileInputStream fStream = null;
		try {
			fStream = new FileInputStream(src);
			int charContent = -1;
			while ((charContent = fStream.read()) != -1) {
				System.out.print((char) charContent);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fStream) {
					fStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
