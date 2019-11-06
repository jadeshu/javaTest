package club.jadeshu.base.sxt.awt;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionTextField01 {

	public static void main(String[] args) {
		Frame frame = new Frame("ActionTextField01");
		frame.setSize(300,300);
		frame.setLocation(300, 300);
		
		TextField tf = new TextField();
		tf.addActionListener(new TextFiledAction());
		//tf.setVisible(true);
		
		frame.add(tf);
		frame.pack();
		frame.setVisible(true);
	}
}

class TextFiledAction implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
	
}