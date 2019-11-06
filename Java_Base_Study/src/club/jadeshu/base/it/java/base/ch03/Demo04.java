package club.jadeshu.base.it.java.base.ch03;

import java.util.Vector;

/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����8:58:38
 * ��˵��
 * Vector��ϰ
 */
public class Demo04 {
	public static void main(String[] args) {
		Vector nvector = new Vector();
		//��������
		nvector.add(10);
		nvector.add(2);
		nvector.add(0);
		nvector.add(4);
		nvector.add(60);
		nvector.add(20);
		nvector.add(2, 100);	//��������
		System.out.println("======�鿴����=========");
		int ni = nvector.size();
		System.out.println(ni);
		System.out.println("===============");
		
		//�鿴����
		for(int i=0;i<nvector.size();i++){
			System.out.println(nvector.get(i));
		}
		
		nvector.clear();
		nvector.setSize(10);
		int ni2 = nvector.size();
		System.out.println("=====��պ�鿴����=======");
		System.out.println(ni2);
		System.out.println("===============");
		//�鿴����
				for(int i=0;i<nvector.size();i++){
					System.out.println(nvector.get(i));
				}
		//��������
		nvector.set(ni2-2, 1001);
		System.out.println("=====��պ�鿴����=======");
		//�鿴����
		for(int i=0;i<nvector.size();i++){
			System.out.println(nvector.get(i));
		}
	}
}
