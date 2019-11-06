package club.jadeshu.base.it.java.base.ch03;

import java.util.Hashtable;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����9:47:20 ��˵�� hashtable��ϰ
 */
public class Demo05 {
	public static void main(String[] args) {
		Hashtable hScore = new Hashtable();
		hScore.put("��һ", "86");
		hScore.put("���", "98");
		hScore.put("����", "99");
		System.out.println("ת�����ַ���֮��������" + hScore.toString());
		hScore.put("���", "77");
		hScore.remove("��һ");
		System.out.println("��ʾ�����Ӧ�ļ�ֵ");
		System.out.println(hScore.get("���").toString());
		System.out.println("�޸Ĳ�ɾ��֮��");
		System.out.println("ת�����ַ���֮��������" + hScore.toString());
	}

}
