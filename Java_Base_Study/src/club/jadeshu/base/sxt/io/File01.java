package club.jadeshu.base.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName: Demo01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:25:17 
 * @Description:创建File文件
 */
public class File01 {

	public static void main(String[] args) {
		
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		
		File file = new File("read.txt");
		System.out.println(file.length());
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			byte[] strByte = new byte[100];
			fileInputStream.read(strByte);
			String str = new String(strByte);
	 		System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
