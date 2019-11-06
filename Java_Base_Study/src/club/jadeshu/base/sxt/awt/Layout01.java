package club.jadeshu.base.sxt.awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Panel;

/**
 * @ClassName: Layout01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 下午10:10:51 
 * @Description:
 * 布局一
 */
public class Layout01 {

	public static void main(String[] args) {
		MyFrame1 myFrame1 = new MyFrame1(300,300,400,300,Color.DARK_GRAY);
	}

}

class MyFrame1 extends Frame {

	public MyFrame1(int x, int y, int width, int height, Color c) {
		super("myFrame Layout01");
		this.setLayout(null);
		this.setBounds(x, y, width, height);
		this.setBackground(c);
		Panel panel = new Panel();
		panel.setBounds(width/4, height/4 , width/2, height/2);
		panel.setBackground(Color.BLUE);
		
		this.add(panel);
		this.setVisible(true);
	}
}
