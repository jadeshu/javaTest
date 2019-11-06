package club.jadeshu.base.it.java.base.ch03;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����8:20:55 
 * ��˵�� �ӿ���ϰ
 */
public class Demo03 implements Tel {

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 10000;
	}

	public static void main(String[] args) {
		Demo03 demo = new Demo03();
		System.out.println(Tel.MAKER + Tel.ADDRESS + Tel.YEAR + "\n�ʲ�:"
				+ demo.getPrice());
	}
}

/**
 * �ӿڿɶ��峣��
 * �ӿڿ���������
 */
interface Tel {
	final static String MAKER = "��������쳧";
	final static String ADDRESS = "�Ϻ�";
	final static int YEAR = 1990;

	public int getPrice();
}