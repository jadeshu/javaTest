package swing05;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Demo140 {
	private JFrame jFrame;
	public Demo140(int w, int h) {
		jFrame = new JFrame("Test");
		jFrame.setBounds(new Rectangle(w, h)); //设置窗口的属性 窗口位置以及窗口的大小
		jFrame.setVisible(true);//设置窗口可见
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
		
		JButton jButton = new JButton("test");
		jButton.setBounds(50, 50, 50, 20);
		//jButton.setVisible(true);
		jFrame.add(jButton);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "12121");
			}
		});
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		int width = (int) (screenSize.getWidth() * 0.8);
		int height = (int) (screenSize.getHeight() * 0.8);

		new Demo140(width, height);
	}

}
