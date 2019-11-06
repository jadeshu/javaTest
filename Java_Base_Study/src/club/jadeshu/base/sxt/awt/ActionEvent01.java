package club.jadeshu.base.sxt.awt;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent01 {

	public static void main(String[] args) {
		Frame frame = new Frame("ActionEvent01");
		frame.setLayout(null);
		frame.setSize(300,300);
		frame.setLocation(300, 300);
		
		Button btn = new Button("Button");
		btn.addActionListener(new MouseClick());
		btn.setLocation(100, 100);
		btn.setSize(100,100);
		frame.add(btn);
		
		frame.setVisible(true);
	}

}

class MouseClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("click button....");
	}
	
}
