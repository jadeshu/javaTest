import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Demo02 extends JFrame{

	//private static final long serialVersionUID = 1L;
	private int x = 10;
	private JLabel jLabel = new JLabel();
	private Container container = getContentPane();
	private static Thread thread;
	
	public Demo02(){
		setBounds(300, 200, 250, 100);
		container.setLayout(null);
		URL url = Demo02.class.getResource("12.png");
		
		Icon icon = new ImageIcon(url);
		jLabel.setIcon(icon);
		
		jLabel.setBounds(10, 10, 200, 50);
		
		thread = new Thread(new ThreadTest());
		thread.start();
		container.add(jLabel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	class ThreadTest implements Runnable{
		@Override
		public void run() {
			while (x <= 200) {
				jLabel.setBounds(x, 10, 250, 50);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				x += 4;
				if (x >= 200) {
					x = 10;
				}		
			}		
		}
		
	}

	public static void main(String[] args) {
		new Demo02();
		System.exit(0);
	}
}

