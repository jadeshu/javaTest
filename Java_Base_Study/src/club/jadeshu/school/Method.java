package club.jadeshu.school;

class MyClass {
	   int x = 20;
	   
	   // 以下是构造函数
	   MyClass() {
	      x = 10;
	   }
}
public class Method {

	
	
	public static void main(String[] args) {
		 MyClass t1 = new MyClass();
	     MyClass t2 = new MyClass();
	     System.out.println(t1.x + " " + t2.x);
	}
}
