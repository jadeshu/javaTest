import javax.swing.*;


public class Demo01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("在线考试系统");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("在线考试系统", JLabel.CENTER);
		label.setBounds(0, 0, 400, 40);
		JLabel labelUser = new JLabel("账号：", JLabel.CENTER);
		JLabel labelPwd = new JLabel("密码：", JLabel.CENTER);
		
		JTextField textUser = new JTextField(30);
		JTextField textPwd = new JTextField(30);
		
		panel.add(label);
		panel.add(labelUser);
		panel.add(textUser);
		panel.add(labelPwd);
		panel.add(textPwd);
		
		frame.add(panel);
	}

}
