package club.jadeshu.base;

/**
 * @author jadeshu QQ:70381915
 * @version V1.0
 * @data:2016-11-14 time:10:28:38 
 * 输出各个基本类型占用字节大小
 */
public class TestTypeSize {

	static void sizeOf() {
		System.out.println("Byte: " + Byte.SIZE / 8); // 1	
		System.out.println("Short: " + Short.SIZE / 8); // 2
		System.out.println("Integer: " + Integer.SIZE / 8); // 4
		System.out.println("Long: " + Long.SIZE / 8); // 8

		System.out.println("Character: " + Character.SIZE / 8); // 2
		System.out.println("Float: " + Float.SIZE / 8); // 4
		System.out.println("Double: " + Double.SIZE / 8); // 8
		System.out.println("Boolean: " + Boolean.getBoolean("true"));
	}
	
	public static void main(String[] args) {
		TestTypeSize.sizeOf();
	}
}
