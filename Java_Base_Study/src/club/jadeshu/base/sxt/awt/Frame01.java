package club.jadeshu.base.sxt.awt;

import java.awt.Color;
import java.awt.Frame;

/**
 * @ClassName: Frame01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午7:33:14 
 * @Description:
 * Frame
 */
public class Frame01 {

	public static void main(String[] args) {
		Frame f = new Frame("my first window");
		
		f.setSize(500, 300);
		f.setLocation(300, 300);
		f.setBackground(Color.DARK_GRAY);
		
		f.setVisible(true);
	}

}
