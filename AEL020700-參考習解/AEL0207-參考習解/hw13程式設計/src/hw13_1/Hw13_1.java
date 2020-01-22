package hw13_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CTextArea extends JFrame implements ActionListener {
	private JTextField txt1 = new JTextField();
	private JTextField txt2 = new JTextField();
	private JTextArea txtS = new JTextArea();
	private JButton btnOK = new JButton("確定");
	private JButton btnCls = new JButton("清除");

	CTextArea() {
		setTitle("字串合併");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 270, 220);
		setLayout(null);

		JLabel lbl1 = new JLabel("字串一：");
		lbl1.setBounds(10, 20, 60, 20);
		add(lbl1);
		txt1.setBounds(70, 20, 170, 20);
		add(txt1);

		JLabel lbl2 = new JLabel("字串二：");
		lbl2.setBounds(10, 50, 60, 20);
		add(lbl2);
		txt2.setBounds(70, 50, 170, 20);
		add(txt2);

		btnOK.setBounds(80, 80, 60, 20);
		btnOK.addActionListener(this);
		add(btnOK);

		btnCls.setBounds(160, 80, 60, 20);
		btnCls.addActionListener(this);
		add(btnCls);

		JLabel lblS = new JLabel("字串合併：");
		lblS.setBounds(10, 110, 80, 20);
		add(lblS);
		txtS.setBorder(BorderFactory.createLineBorder(Color.black));
		txtS.setLineWrap(true);
		JScrollPane span = new JScrollPane(txtS, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		span.setBounds(80, 110, 160, 60);
		add(span);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOK) {
			txtS.append(txt1.getText());
			txtS.append(txt2.getText());
		}
		if (e.getSource() == btnCls) {
			txt1.setText("");
			txt2.setText("");
			txtS.setText("");
		}
	}
}

public class Hw13_1 {
	public static void main(String[] args) {
		CTextArea frame = new CTextArea();
	}
}
