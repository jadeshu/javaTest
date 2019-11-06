package club.jadeshu.base.sxt.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout02 {

	public static void main(String[] args) {
		Frame f = new Frame("FlowLayout02");
		// 设置布局
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 50));
		// 设置窗体大小
		f.setSize(300, 400);
		// 设置窗体显示在屏幕初始位置
		f.setLocation(300, 300);
		// 添加按钮组件
		for (int i = 0; i < 9; i++) {
			f.add(new Button("btn" + (i + 1)));
		}

		// 显示
		f.setVisible(true);
	}
}
