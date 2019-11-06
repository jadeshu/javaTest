package club.jadeshu.base.it.java.base.ch01;

import java.util.Random;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����3:53:26 ��˵�� �����
 */
public class Demo06 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		// Demo01
		Random rand = new Random();
		int i = rand.nextInt(100);
		System.out.println(i);

		// Demo02
		double j = Math.random();
		System.out.println(j);

		// Demo03
		long k = System.currentTimeMillis();
		System.out.println(k);
	}

}
