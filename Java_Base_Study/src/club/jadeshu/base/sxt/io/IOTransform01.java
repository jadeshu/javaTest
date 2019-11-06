package club.jadeshu.base.sxt.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @ClassName: Demo03
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午2:23:33
 * @Description: 
 * 转换流： 
 * 1.字节流读取转成字符流 InputStreamReader
 * 2.字节流转成字符流输出 OutputStreamWriter
 */
public class IOTransform01 {
	public static void main(String[] args) throws IOException {
		// 输出到文件
		// 字符输出流中输出到字节输出流
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"testDemo03.txt"));
		osw.write("我爱你的是多少的撒的安顺的阿斯顿 \r\n 撒旦教大手大脚");

		osw.flush();
		osw.close();
		// 读取到文件
		// 字节输入流中读取到字符输入流
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"testDemo03.txt"));
		
		int c = -1;
		while((c = isr.read()) != -1) {
			System.out.print((char)c);
		}
		
		isr.close();
	}

}
