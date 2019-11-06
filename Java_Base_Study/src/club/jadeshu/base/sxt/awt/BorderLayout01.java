package club.jadeshu.base.sxt.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayout01 {

	public static void main(String[] args) {
		Frame frame = new Frame("BorderLayout01");
		
		frame.setSize(300, 300);
		frame.setLayout(new BorderLayout());
		
		frame.add(new Button("btn1"), BorderLayout.EAST);
		frame.add(new Button("btn2"), BorderLayout.NORTH);
		frame.add(new Button("btn3"), BorderLayout.SOUTH);
		frame.add(new Button("btn4"), BorderLayout.WEST);
		frame.add(new Button("btn5"), BorderLayout.CENTER);
		
		frame.setVisible(true);
		
	}

}
