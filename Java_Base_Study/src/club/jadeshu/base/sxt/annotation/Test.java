package club.jadeshu.base.sxt.annotation;

public class Test {

	@TestAnnotation
	public static void main(String[] args) {
		int[][] array2 = new int[2][3];

		array2[0] = new int[10];
		array2[1] = new int[3];

		for (int[] is : array2) {
			for (int i : is) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}
