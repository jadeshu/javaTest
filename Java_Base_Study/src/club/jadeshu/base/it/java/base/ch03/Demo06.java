package club.jadeshu.base.it.java.base.ch03;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����9:58:48 
 * ��˵�� Enumeration�ӿڲ���
 */
public class Demo06 {

	public static void main(String[] args) {
		Vector vScore = new Vector();
		vScore.add("86");
		vScore.add("98");
		vScore.add(1, "99");
		System.out.println("=========����Ԫ�ر��ַ�������ӡ========");
		System.out.println("Vector��" + vScore.toString());
		
		for(Enumeration e = vScore.elements(); e.hasMoreElements();){
			//Object obj = e.nextElement();
			System.out.println(e.nextElement());
		}
		
		Hashtable hScore = new Hashtable();
		hScore.put("��һ","86");
		hScore.put("���","98");
		hScore.put("����","99");
		System.out.println("=========����Ԫ�ر��ַ�������ӡ========");
		System.out.println("Hashtable��" + hScore.toString());
		
		for (Enumeration e = hScore.elements() ; e.hasMoreElements() ;)
		{
			//String str = (String)e.nextElement();
			//System.out.print(str + "��");
			//System.out.println(hScore.get(str));
			System.out.println(e.nextElement());
		}


	}
}
