package club.jadeshu.base.sxt.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName: URLDemo01
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月24日 上午12:50:32
 * @Description: URL 2 当访问有些网站时候，被拒绝了，这时候我们可以模仿浏览器进行访问
 */
public class URLDemo02 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.dianping.com");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty(
						"User-Agent",
						"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
		InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "UTF-8");
		BufferedReader bReader = new BufferedReader(isr);

		String str = null;
		while (null != (str = bReader.readLine())) {
			System.out.println(str);
		}
		bReader.close();
	}
}
