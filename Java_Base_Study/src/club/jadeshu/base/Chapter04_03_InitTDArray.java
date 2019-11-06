package club.jadeshu.base;

/*
 * 初始化二维数组
 */
public class Chapter04_03_InitTDArray {

	public static void main(String[] args) {
		// 第一种方式
		int[][] tdar1 = {{1,3,5},{5,9,10}};
		// 第二种
		int[][] tdar2 = new int[][]{{1,3,5},{5,9,10}};
		// 第三种
		int[][] tdar3 = new int[2][3];
		tdar3[0] = new int[]{1,3,5};
		tdar3[1][0] = 5;
		tdar3[1][1] = 9;
		tdar3[1][2] = 10;
		
		for (int i = 0; i < tdar3.length; i++) {
			for (int j = 0; j < tdar3[i].length; j++) {
				System.out.print(tdar3[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
