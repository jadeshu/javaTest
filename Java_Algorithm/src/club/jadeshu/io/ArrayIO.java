package club.jadeshu.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

/***
 * @ClassName: ArrayIO 
 * @version V1.0
 * @author: jadeshu
 * @date: 2019年3月3日 上午1:21:20 
 * @Description:Java IO：Byte＆Char Arrays
 * ByteArrayInputStream 
 * ByteArrayOutputStream 
 * CharArrayReader 
 * CharArrayWriter
 */
public class ArrayIO {

	public static void main(String[] args) throws IOException {
		byte[] buf = new byte[100];
		//将数据写入字节数组... 
		String str = new String("wudi hook!!!");
		buf = str.getBytes();
		ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(buf);
		//System.out.println(byteArrayIn.toString());
		//读取第一个字节
		int data = byteArrayIn.read();
		while (data != -1) {
			// 操作数据
			System.out.print((char)data);
			
			 //读取下一个字节
			data = byteArrayIn.read();
		}
		
		ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
		byteArrayOut.write(buf);
		byte[] outbuf = byteArrayOut.toByteArray();
		String str2 = new String(outbuf);
		System.out.println(byteArrayOut.toString());
		System.out.println(str2.toCharArray());
		byteArrayIn.close();
	}

}
