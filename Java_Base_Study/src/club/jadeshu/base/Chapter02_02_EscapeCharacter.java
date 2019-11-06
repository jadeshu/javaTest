package club.jadeshu.base;

/**
 * @ClassName: Demo02_EscapeCharacter 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:28:56 
 * @Description:特殊字符
 */
public class Chapter02_02_EscapeCharacter {

	public static void main(String[] args) {
		char c1 = '\\';
		char c2 = '\'';
		char c3 = '\"';
		char c4 = '\u2605';
		char c5 = '\101';
		char c6 = '\t';
		char c7 = '\n';

		System.out.println("[" + c1 + "]");
		System.out.println("[" + c2 + "]");
		System.out.println("[" + c3 + "]");
		System.out.println("[" + c4 + "]");
		System.out.println("[" + c5 + "]");
		System.out.println("[" + c6 + "]");
		System.out.println("[" + c7 + "]");
	}
}
