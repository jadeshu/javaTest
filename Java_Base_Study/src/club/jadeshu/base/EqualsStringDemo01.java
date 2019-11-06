package club.jadeshu.base;

/**
 * @ClassName: EqualsStringDemo01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-23 上午3:19:58 
 * @Description:比较两字符串是否相等
 */
public class EqualsStringDemo01 {

	public static void main(String[] args) {
		String str1 = new String("hello world!");
		String str2 = new String("hello world!");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
