package hw13_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class FoodF extends JFrame implements ActionListener {
	private JRadioButton[] rdbMain = new JRadioButton[5];
	private JCheckBox[] chkSecond = new JCheckBox[2];
	private JButton btnOK = new JButton("�T�w");
	String[] dessert_items = { "�A���B�N�O", "���Ԧ�Ĭ", "������T" };
	private JComboBox<String> cboDessert = new JComboBox<>(dessert_items);

	FoodF() {
		setTitle("�I�\���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 340, 260);
		setLayout(null);

		// �D�\
		JPanel panMain = new JPanel();
		add(panMain);
		panMain.setBounds(10, 10, 150, 170);
		panMain.setLayout(new GridLayout(5, 1));
		panMain.setBorder(BorderFactory.createTitledBorder("�D�\"));
		rdbMain[0] = new JRadioButton("��������(360��)", true);
		rdbMain[1] = new JRadioButton("���p����(300��)");
		rdbMain[2] = new JRadioButton("�K�N����(280��)");
		rdbMain[3] = new JRadioButton("�i���t��(250��)");
		rdbMain[4] = new JRadioButton("�­J�Ԥ���(200��)");
		ButtonGroup grpRdb = new ButtonGroup();
		for (int i = 0; i < rdbMain.length; i++) {
			grpRdb.add(rdbMain[i]);
			panMain.add(rdbMain[i]);
		}
		// ���\
		JPanel panSecond = new JPanel();
		add(panSecond);
		panSecond.setBounds(170, 10, 140, 75);
		panSecond.setLayout(new GridLayout(2, 1));
		panSecond.setBorder(BorderFactory.createTitledBorder("���\"));
		String[] second_items = { "Ī���F��(60��)", "�ֳJ���G(40��)" };
		for (int i = 0; i < second_items.length; i++) {
			chkSecond[i] = new JCheckBox(second_items[i]);
			panSecond.add(chkSecond[i]);
		}
		// ���I
		JPanel panDessert = new JPanel();
		add(panDessert);
		panDessert.setBounds(170, 90, 140, 60);
		panDessert.setBorder(BorderFactory.createTitledBorder("���I(�K�O)"));
		panDessert.add(cboDessert);
		// �T�w�s
		btnOK.setBounds(100, 190, 60, 20);
		add(btnOK);
		btnOK.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int m_sum = 0, m_main = 0, m_second = 0;
		String msg = "�D�\�G";
		if (rdbMain[0].isSelected()) {
			msg += rdbMain[0].getText();
			m_main = 360;
		}
		if (rdbMain[1].isSelected()) {
			msg += rdbMain[1].getText();
			m_main = 300;
		}
		if (rdbMain[2].isSelected()) {
			msg += rdbMain[2].getText();
			m_main = 280;
		}
		if (rdbMain[3].isSelected()) {
			msg += rdbMain[3].getText();
			m_main = 250;
		}
		if (rdbMain[4].isSelected()) {
			msg += rdbMain[4].getText();
			m_main = 200;
		}
		msg += "\n���\�G";
		if (chkSecond[0].isSelected()) {
			msg += chkSecond[0].getText() + ", ";
			m_second += 60;
		}
		if (chkSecond[1].isSelected()) {
			msg += chkSecond[1].getText();
			m_second += 40;
		}
		if (!chkSecond[0].isSelected() && !chkSecond[1].isSelected())
			msg += "����";

		msg += "\n���I�G" + cboDessert.getSelectedItem() + "(�K�O)";

		m_sum = m_main + m_second;
		msg += "\n�X�p�G " + m_sum + " ��";
		JOptionPane.showMessageDialog(null, msg);
	}
}

public class Hw13_4 {
	public static void main(String[] args) {
		new FoodF();
	}
}
