package test.list;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListTest extends JFrame {
	
	public JListTest() {
		setLayout(new FlowLayout());
		JLabel lbl = new JLabel("좋아하는 과일선택");
		String[] items = {"사과", "수박", "참외", "키위", "복숭아"};
		JList<String> list = new JList<String>(items);
		add(lbl);
		add(list);
		setTitle("JList 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 150, 300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JListTest();
	}

}
