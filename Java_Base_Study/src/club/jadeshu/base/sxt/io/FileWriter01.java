package club.jadeshu.base.sxt.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: Demo01
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午1:35:03
 * @Description: 复制所有文字字符，写入成文件
 */
public class FileWriter01 {

	public static void main(String[] args) {
		FileWriter fWriter = null;
		try {
			fWriter = new FileWriter("character.dat");
			for (int i = 0; i < 50000; i++) {
				fWriter.write(i);
			}
			fWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
