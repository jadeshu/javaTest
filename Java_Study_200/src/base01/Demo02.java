package base01;

import java.util.Scanner;

public class Demo02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的身份证号：");
		String str = scanner.nextLine();
		
		System.out.println("你的身份证号为：" + str.replace(" ", ""));	
		scanner.close();
	}

}