package club.jadeshu.base.sxt.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: Demo02 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午1:50:24 
 * @Description:
 * 处理流(包装)BufferInputStream
 */
public class BufferInputStream01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("read.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println((char)bis.read());
		//System.out.println(bis.markSupported());
		//bis.mark(0);
		System.out.println((char)bis.read());
		//bis.reset();
		System.out.println((char)bis.read());
		int c = -1;
		while ((c=bis.read()) != -1) {
			System.out.println((char)c);
		}
	}
}
