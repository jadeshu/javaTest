package club.jadeshu.base.sxt.awt;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * @ClassName: Layout02 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 下午10:20:00 
 * @Description:
 * FlowLayout
 */
public class FlowLayout01 {

	public static void main(String[] args) {
		Frame frame = new Frame("FlowLayout Test");
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Button btn1 = new Button("ok");
		Button btn2 = new Button("cancel");
		Button btn3 = new Button("perfect");
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		
		//myButtons mbtn = new myButtons();
		//mbtn.init();
		//frame.add(mbtn);
		
		frame.setSize(100, 100);
		frame.setVisible(true);
	}
}

//class myButtons extends Applet {
//    Button button1, button2, button3;
//    public void init() {
//        button1 = new Button("Ok");
//        button2 = new Button("Open");
//        button3 = new Button("Close");
//        add(button1);
//        add(button2);
//        add(button3);
//    }
//}

