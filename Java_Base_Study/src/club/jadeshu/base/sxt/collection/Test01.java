package club.jadeshu.base.sxt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @ClassName: Test01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2019年1月15日 下午8:24:10 
 * @Description:
 * List
 */
public class Test01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hhhh");
		list.add("wido");
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
