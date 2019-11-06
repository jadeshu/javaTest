package club.jadeshu.base.sxt.io;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @ClassName: Demo07 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:26:48 
 * @Description:字符集
 */
public class FileCharset01 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String msg = "声明哈哈哈是a";
		byte[] datas = msg.getBytes(Charset.defaultCharset());
		System.out.println(datas.length); // 19 中文默认1个字符3字节

		datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length); // 14 1个字节是2字节

		char[] s = { 'a', 'b', 'c' };
		String string2 = new String(s);
		String string3 = String.valueOf(s);
		System.out.println(string3);
	}

}
