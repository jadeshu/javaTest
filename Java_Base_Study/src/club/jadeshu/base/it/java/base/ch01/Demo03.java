package club.jadeshu.base.it.java.base.ch01;
/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����12:00:09
 * ��˵��
 * String::indexOf()
 */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "a.ba.c.a";
			int index = str.indexOf("a",1);
			int lastIndex = str.lastIndexOf("a",6);
			System.out.println(index);
			System.out.println(lastIndex);
	}

}
