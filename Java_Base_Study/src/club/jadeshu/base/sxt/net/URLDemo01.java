package club.jadeshu.base.sxt.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName: URLDemo01
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月24日 上午12:50:32
 * @Description: URL 访问一般网站得到网页源码
 */
public class URLDemo01 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.baidu.com");

		InputStreamReader isr = new InputStreamReader(url.openStream(), "UTF-8");
		BufferedReader bReader = new BufferedReader(isr);
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"URLDemo01.txt"));
		BufferedWriter bWriter = new BufferedWriter(osw);
		
		int count = 0;	// 获取了多少行
		String str = null;
		while (null != (str = bReader.readLine())) {
			count++;
			bWriter.write(str);
			bWriter.write('\n');
		}
		System.out.println(count); // 打印行数
		
		bWriter.flush();
		
		bWriter.close();	
		bReader.close();
	}
}
