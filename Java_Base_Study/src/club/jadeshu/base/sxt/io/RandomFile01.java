package club.jadeshu.base.sxt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * @ClassName: PrintTest02
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-21 上午1:27:13
 * @Description: RandomAccessFile 随机访问文件读 文件分割
 */
public class RandomFile01 {

	public static void main(String[] args) throws IOException {

		// 读取指定初始位置到结尾处并打印
		RandomAccessFile raf = new RandomAccessFile(
				"./src/club/jadeshu/base/sxt/io/FileOutputStream01.java", "r");
		raf.seek(210);
		byte[] buf = new byte[64];
		int len = -1;
		while (-1 != (len = raf.read(buf))) {
			System.out.print(new String(buf, 0, len));
		}
	}
}
