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
		btn1 = new JButton("���~�T��");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "���~�T��", "���~�T�����D", JOptionPane.ERROR_MESSAGE);
			}
		});
		contentPane.add(btn1);

		btn2 = new JButton("��T�T��");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "��T�T��", "��T�T�����D", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(btn2);

		btn3 = new JButton("ĵ�ܰT��");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ĵ�ܰT��", "ĵ�ܰT�����D", JOptionPane.WARNING_MESSAGE);
			}
		});
		contentPane.add(btn3);

		btn4 = new JButton("�ðݰT��");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�ðݰT��", "�ðݰT�����D", JOptionPane.QUESTION_MESSAGE);
			}
		});
		contentPane.add(btn4);

		btn5 = new JButton("�S���ϥ�");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�S���ϥ�", "�S���ϥܼ��D", JOptionPane.PLAIN_MESSAGE);
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
