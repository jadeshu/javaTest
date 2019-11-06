package club.jadeshu.base;

/*
 * 打印一年中各月的天数
 */
public class Chapter04_02_GetDay {

	public static void main(String[] args) {
		int[] day = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < day.length; i++) {
			System.out.println((i+1) + "月有" + day[i] + "天");
		}
	}

}
