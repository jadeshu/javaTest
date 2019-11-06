package club.jadeshu.base.sxt.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @ClassName: PrintTest01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-21 上午12:38:35 
 * @Description:
 * 打印流
 */
public class PrintTest01 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = System.out;
		ps.print("hello world!");
		
		//PrintStream pStream = new PrintStream("ts.txt");
		PrintStream pStream = new PrintStream(new FileOutputStream("ts.txt"), true);
		pStream.println("121212");
		pStream.println("我爱你");
		pStream.flush();
	}

}
