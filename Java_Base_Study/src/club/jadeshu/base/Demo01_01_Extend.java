package club.jadeshu.base;

import java.util.Scanner;
/**
 * @ClassName: Demo01_01_Extend 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:27:51 
 * @Description:输入摄氏度，转成华氏度并显示
 */
public class Demo01_01_Extend {

	
	public static void main(String[] args) {
		
		double argge = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您需要转换的摄氏度：");
		int du = scanner.nextInt();
		argge = 32 +  du * 1.8;
		
		System.out.println("华氏度为：" + argge);
		scanner.close();
	}

}
