package hw12_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame {
	private JPanel contentPane;
	private JButton btn1, btn2, btn3, btn4, btn5;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 180);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
		btn1 = new JButton("錯誤訊息");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "錯誤訊息", "錯誤訊息標題", JOptionPane.ERROR_MESSAGE);
			}
		});
		contentPane.add(btn1);

		btn2 = new JButton("資訊訊息");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "資訊訊息", "資訊訊息標題", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(btn2);

		btn3 = new JButton("警示訊息");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "警示訊息", "警示訊息標題", JOptionPane.WARNING_MESSAGE);
			}
		});
		contentPane.add(btn3);

		btn4 = new JButton("疑問訊息");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "疑問訊息", "疑問訊息標題", JOptionPane.QUESTION_MESSAGE);
			}
		});
		contentPane.add(btn4);

		btn5 = new JButton("沒有圖示");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "沒有圖示", "沒有圖示標題", JOptionPane.PLAIN_MESSAGE);
			}
		});
		contentPane.add(btn5);

		setVisible(true);
	}
}

public class Hw12_3 {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}
