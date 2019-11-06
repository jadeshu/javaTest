class Date {
	int x;
	int y;
}

public class Demo03 {
	public Date date = new Date();
	
	public void fun(Date d) {	
		d = new Date();
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Demo03 demo03 = new Demo03();
		
		Date date = new Date();
		System.out.println(date);
		date.x = 10;
		date.y = 20;
		
		demo03.fun(date);
		System.out.println(date);

	}

}
