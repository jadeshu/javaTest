package club.jadeshu.base.it.java.base.ch04;
/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2017-12-11 ����5:46:09
 * ��˵��
 */
class Person{
	static{
		age = 30;
	}
	static int age;
	protected String name;
}

public class Demo02 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(Person.age);

		//Person.age = 20;
		System.out.println(Person.age);

		Person p2 = new Person();
		System.out.println(p2.name);
	}
}
