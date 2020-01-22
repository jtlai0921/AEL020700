package hw13_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

class RdoBtn extends JFrame implements ActionListener {
	private JTextField txt1 = new JTextField();
	private JTextField txt2 = new JTextField();
	private JTextArea txtS = new JTextArea("�Х���J���B�M�����ײv�A\n�A��ܧI���������C");
	private JRadioButton[] rdb = new JRadioButton[2];
	private Border lineB = BorderFactory.createLineBorder(Color.black);

	RdoBtn() {
		setTitle("�x���P�����I��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 270, 225);
		setLayout(null);

		JLabel lbl1 = new JLabel("��J���B�G");
		lbl1.setBounds(10, 10, 80, 20);
		add(lbl1);
		txt1.setBounds(10, 35, 80, 20);
		add(txt1);

		JLabel lbl2 = new JLabel("��J�����ײv�G");
		lbl2.setBounds(140, 10, 95, 20);
		add(lbl2);
		txt2.setBounds(140, 35, 80, 20);
		add(txt2);

		JPanel pan = new JPanel();
		add(pan);
		pan.setBounds(10, 65, 230, 55);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "�п��"));
		pan.setLayout(new FlowLayout());
		ButtonGroup group = new ButtonGroup();
		rdb[0] = new JRadioButton("�x��������", true);
		rdb[1] = new JRadioButton("�������x��");
		for (int i = 0; i < rdb.length; i++) {
			group.add(rdb[i]);
			pan.add(rdb[i]);
			rdb[i].addActionListener(this);
		}

		add(txtS);
		txtS.setBounds(10, 135, 230, 40);
		txtS.setLineWrap(true);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (rdb[0].isSelected()) {
			int nt = Integer.parseInt(txt1.getText());
			double usa = nt / Double.parseDouble(txt2.getText());
			txtS.setText("�x�� " + nt + " ���A�i�I��������\n" + usa + " ��");
		} else {
			int usa = Integer.parseInt(txt1.getText());
			double nt = usa * Double.parseDouble(txt2.getText());
			txtS.setText("���� " + usa + " ���A�i�I�����x��\n" + nt + " ��");
		}
	}
}

public class Hw13_3 {
	public static void main(String[] args) {
		new RdoBtn();
	}
}