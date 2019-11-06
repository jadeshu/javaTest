package club.jadeshu.base;

//import java.util.Arrays;

/**
 * @ClassName: Test99 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-20 下午10:23:54 
 * @Description:99乘法口诀
 */
public class Test99 {
	public int age;
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+ "*"+ i +"=" +i*j+"\t");
			}	
			System.out.println();
		}	
//		Runtime rt = Runtime.getRuntime();
//		System.out.println("处理器数量："+rt.availableProcessors());
//		System.out.println("空闲内存："+rt.freeMemory());
//		System.out.println("总内存数："+rt.totalMemory());
//		System.out.println("可用最大内存数："+rt.maxMemory()/1024/1024);
//		//定义一个数组a
//		int[] a = {3,4,5,6};
//		int[] a2 = {3,4,5,6};
//		System.out.println("a数组和a2数组是否相等："+Arrays.equals(a,a2));
//		
//		int[] b = Arrays.copyOf(a,6);
//		System.out.println("b数组的元素为："+Arrays.toString(b));
//		Arrays.fill(b,2,5,1);
//		System.out.println("填充后b数组的元素为："+Arrays.toString(b));
//		//对b数组进行排序
//		Arrays.sort(b);
//		System.out.println("排序后b数组的元素为："+Arrays.toString(b));
	}
}