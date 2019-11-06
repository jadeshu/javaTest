package swing05;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Demo142 {

	public Demo142(int w, int h) {
		JFrame jf = new JFrame("Test");
		jf.setBounds(new Rectangle(w, h)); //设置窗口的属性 窗口位置以及窗口的大小
		jf.setVisible(true);//设置窗口可见
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int width = (int) (screenSize.getWidth() * 0.8);
		int height = (int) (screenSize.getHeight() * 0.8);

		new Demo142(width, height);
	}

}

