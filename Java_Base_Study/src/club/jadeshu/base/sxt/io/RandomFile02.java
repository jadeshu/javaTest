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
 * @Description: RandomAccessFile 随机访问文件读  文件分割
 */
public class RandomFile02 {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"./src/club/jadeshu/base/sxt/io/FileOutputStream01.java");
		// 文件总长度
		long len = f.length();
		System.out.println(len);
		// 每块大小
		int blockSize = 512;
		// 起始位置
		int beginPos = 0;
		// 总共分多少块
		int block = (int) Math.ceil((len * 1.0) / blockSize);
		// 实际读取长度
		int actualSize = (int) ((blockSize > len) ? len : blockSize);

		for (int i = 0; i < block; i++) {
			beginPos = i * blockSize;
			if (i == (block - 1)) { // 最后一块
				actualSize = (int) len; // 实际大小为最后一块实际长度
			} else {
				actualSize = blockSize;
				len -= blockSize; // 剩余长度
			}
			System.out.println(i + "---->" + beginPos + "---->" + actualSize);
			split(i, beginPos, actualSize);

		}
	}

	/**
	 * 
	* @Title: split 
	* @Description: 文件分割
	* @param i 第几块
	* @param beginPos 文件读取开始位置
	* @param actualSize 读取实际文件大小
	* @author jadeshu
	* @date 2018-12-21上午2:18:16
	 */
	public static void split(int i, int beginPos, int actualSize)
			throws IOException {
		RandomAccessFile raf = new RandomAccessFile(
				"./src/club/jadeshu/base/sxt/io/FileOutputStream01.java", "r");
		raf.seek(beginPos); // 移动位置
		byte[] buf = new byte[64]; // buf
		int len = -1; // 接收数据长度
		while (-1 != (len = raf.read(buf))) {
			if (actualSize > len) { // 获取本次全部内容
				System.out.print(new String(buf, 0, len));
				actualSize -= len;
			} else {
				System.out.print(new String(buf, 0, len));
				break;
			}
		}
	}
}
