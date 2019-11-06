package club.jadeshu.base.it.java.base.ch03;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����8:00:58 ��˵��
 * �̳�
 */
public class Demo01 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "����";
		m.salary = 10000;
		m.department = "ҵ��";
		System.out.println(m.getSalary());
	}
}

class Employee {
	public String name;// ����
	public int salary;// нˮ

	// ����
	public String getSalary() {
		String str;
		str = "����: " + name + "\nSalary: " + salary;
		return str;
	}
}

class Manager extends Employee {
	public String department;// ����

	// ����
	public String getSalary() {
		// ʹ��super�������ó���ķ���
		return super.getSalary() + "\nDepartment: " + department;
	}
}
