package club.jadeshu.base.sxt.server;
/**
 * @ClassName: ReflectTest01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月28日 上午12:06:52 
 * @Description:反射
 * 1.获取Class对象
 * 2.可以动态创建对象
 */
public class ReflectTest01 extends Object {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 三种方式
		// 1.对象.getClass()
		De de = new De();
		Class dclass = de.getClass();
		System.out.println(dclass);
		// 2.类.class
		dclass = De.class;
		System.out.println(dclass);
		
		// 3.  Class.forName("包名.类名")
		dclass = Class.forName("club.jadeshu.base.sxt.server.De");
		System.out.println(dclass);
		// 创建对象
		De de2 = (De)dclass.newInstance();
		System.out.println(de2);
	}

}

class De {

	public De() {
	}
	
}
