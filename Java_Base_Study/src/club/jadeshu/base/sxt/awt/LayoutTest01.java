package club.jadeshu.base.sxt.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class LayoutTest01 {

	public static void main(String[] args) {
		Frame frame= new Frame("LayoutTest01");
		frame.setLayout(new GridLayout(2, 3));
		
		Button[] btn= new Button[10];
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button("btn" + (i+1));
		}
		
		frame.add(btn[0]);	//11

		//12
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2,1));
		p1.add(btn[1]);
		p1.add(btn[2]);
		frame.add(p1);
		
		frame.add(btn[3]);	//13
		
		frame.add(btn[4]);	//21	
		// 22
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(2, 2));
		p2.add(btn[5]);
		p2.add(btn[6]);
		p2.add(btn[7]);
		p2.add(btn[8]);
		
		frame.add(p2);
		frame.add(btn[9]);	//23
		
		frame.pack();
		frame.setVisible(true);
	}

}
