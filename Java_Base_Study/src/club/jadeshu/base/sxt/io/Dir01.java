package club.jadeshu.base.sxt.io;

import java.io.File;
/**
 * @ClassName: Demo03 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:25:44 
 * @Description:
 * 创建目录
 * mkdir  确保上级目录存在，不存在创建失败
 * mkdirs  不论上级目录是否存在，都统一创建
 */
public class Dir01 {

	public static void main(String[] args) {
		File file = new File("test/dir");
		Boolean flg = file.mkdir();
		System.out.println(flg);
		
		System.out.println("===============");
		flg = file.mkdirs();
		System.out.println(flg);
	}

}
