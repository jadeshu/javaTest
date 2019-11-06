package club.jadeshu.base.sxt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: Demo09 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:27:16 
 * @Description:File写文件
 */
public class FileOutputStream01 {

	public static void main(String[] args) {
		// 1.创建源
		File src = new File("read2.txt");
		FileOutputStream fStream = null;
		try {
			// 2.选择流
			fStream = new FileOutputStream(src, true);

			// 3.操作
			String str = "呵呵我呵呵,12121212";
			// 往输出流写数据
			fStream.write(str.getBytes());
			// 刷新数据
			fStream.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.释放资源
			if (null != fStream) {
				try {
					fStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
