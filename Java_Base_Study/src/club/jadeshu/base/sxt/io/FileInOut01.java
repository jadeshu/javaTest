package club.jadeshu.base.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: Demo10 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:27:34 
 * @Description:
 * 复制文件 
 * 1.使用文件输入输出流 
 * 2.去读取文件然后写入新的文件
 */
public class FileInOut01 {

	public static void main(String[] args) {
		copy("picTestCopy.jpg", "pic.jpg");
		//copyFile("test", "ts1212");
	}

	// 复制文件
	// @srcFileName 源文件名
	// @dstFileName 生成文件名
	public static void copy(String srcFileName, String dstFileName) {
		// 1.数据源
		File src = new File(srcFileName);
		File dst = new File(dstFileName);
		FileInputStream fiStream = null;
		FileOutputStream foStream = null;
		try {
			// 2.选择流
			fiStream = new FileInputStream(src);
			foStream = new FileOutputStream(dst);

			// 3.操作
			int len = -1;
			// 测试小缓冲
			// byte[] flush = new byte[4];
			byte[] flush = new byte[1024];
			while ((len = fiStream.read(flush)) != -1) {
				foStream.write(flush, 0, len);
			}
			foStream.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.释放资源
			if (null != foStream) {
				try {
					foStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != fiStream) {
				try {
					fiStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 复制文件夹
	public static void copyFile(String srcDir, String dstDir) {
		File src = new File(srcDir);
		File dst = new File(dstDir);
		if (!dst.exists()) {
			dst.mkdirs();
		}
		if (null == src || !src.exists()) {
			return;
		} else if (src.isDirectory()){ // 是目录	
			for (File f : src.listFiles()) {
				if (f.isFile()) {
					copy(f.getAbsolutePath(), dst.getAbsolutePath()+ "/" + f.getName());
				}else if (f.isDirectory()) {
					copyFile(f.getAbsolutePath(), dst.getAbsolutePath()+ "/" + f.getName());
				}
			}
		}
	}
}
