package club.jadeshu.base.sxt.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

// GridLayout 几行几列
public class GridLayout01 {

	public static void main(String[] args) {
		Frame frame = new Frame("GridLayout01");
		
		frame.setSize(300,300);
		frame.setLocation(300, 300);
		frame.setLayout(new GridLayout(3, 4));
		
		for (int i = 0; i < 10; i++) {
			frame.add(new Button("btn" + (i+1)));
		}
		
		//frame.pack();
		frame.setVisible(true);
	}

}
