package base01;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Demo29 extends JFrame{

	JLabel freeLabel = new JLabel();
	JLabel totaLabel = new JLabel();
	JProgressBar progressBar = new JProgressBar(SwingConstants.VERTICAL,0,100);
	private Container container = getContentPane();
	
	public Demo29() {
		setBounds(300, 200, 250, 100);
		setVisible(true);
		container.setLayout(null);
	}
	
	public static void main(String[] args) {
		
		Demo29 demo029 = new Demo29();
		demo029.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
