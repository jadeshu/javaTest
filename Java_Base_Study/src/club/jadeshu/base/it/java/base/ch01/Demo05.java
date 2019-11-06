package club.jadeshu.base.it.java.base.ch01;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����1:42:26 
 * ��˵�� ��Demo04�зָ��ַ� ������ 
 * ʹ��String::split����
 */
public class Demo05 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "��ͤ�� �ŵ��� ���ݱ����� ���� �������� Ϧ��ɽ��ɽ 1212 2323 444";
		System.out.println("ԭ���Ϊ��" + str);
		String[] strArr = new String[30];
		strArr = str.split(" ");
		System.out.println("-------�ָ��-------");
		/*
		 * for(int i=0;i<strArr.length;i++){ System.out.println(strArr[i]); }
		 */
		for (String item : strArr) {
			System.out.println(item);
		}
	}

}
