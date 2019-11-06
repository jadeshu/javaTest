package club.jadeshu.base;

/**
 * @ClassName: Demo01_BMIexpoment 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:28:25 
 * @Description:根据身高·体重计算BMI指数
 */
public class Chapter02_01_BMIexpoment {

	public static void main(String[] args) {
		double height = 1.72;	// 身高变量
		int weight = 60;	// 体重变量
		double expoment = weight / (height * height);	// BMI计算公式
		System.out.println("您的身高为：" + height);
		System.out.println("您的体重为：" + weight);
		System.out.println("您的BMI指数为：" + expoment);
		System.out.print("您的体重属于：");
		if (expoment < 18.5) {
			System.out.println("体重过轻");
		}
		if (expoment >= 18.5 && expoment < 24.9) {
			System.out.println("正常范围");
		}
		if (expoment >= 24.9 && expoment < 29.9) {
			System.out.println("体重过重");
		}
		if (expoment > 29.9) {
			System.out.println("肥胖");
		}

	}

}
