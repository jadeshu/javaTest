package club.jadeshu.base.it.java.base.ch03;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 ����8:00:58 ��˵��
 * ������˽��private
 */
public class Demo02 {
	public static void main(String[] args) {
		Manager1 m = new Manager1("����",10000,"ҵ��");
		System.out.println(m.getSalary());
	}
}

class Employee1 {
	private String name;// ����
	private int salary;// нˮ
	
	public Employee1(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	// ����
	public String getSalary() {
		String str;
		str = "����: " + name + "\nSalary: " + salary;
		return str;
	}
}

class Manager1 extends Employee1 {
	private String department;// ����
	
	public Manager1(String name,int salary,String department){
		super(name,salary);
		this.department = department;
	}
	// ����
	public String getSalary() {
		// ʹ��super�������ó���ķ���
		return super.getSalary() + "\nDepartment: " + department;
	}
}
