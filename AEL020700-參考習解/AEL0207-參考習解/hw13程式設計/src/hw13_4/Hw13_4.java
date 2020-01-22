package hw13_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class FoodF extends JFrame implements ActionListener {
	private JRadioButton[] rdbMain = new JRadioButton[5];
	private JCheckBox[] chkSecond = new JCheckBox[2];
	private JButton btnOK = new JButton("確定");
	String[] dessert_items = { "鮮奶冰淇淋", "提拉米蘇", "草莓奶酪" };
	private JComboBox<String> cboDessert = new JComboBox<>(dessert_items);

	FoodF() {
		setTitle("點餐表單");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 340, 260);
		setLayout(null);

		// 主餐
		JPanel panMain = new JPanel();
		add(panMain);
		panMain.setBounds(10, 10, 150, 170);
		panMain.setLayout(new GridLayout(5, 1));
		panMain.setBorder(BorderFactory.createTitledBorder("主餐"));
		rdbMain[0] = new JRadioButton("海陸雙拼(360元)", true);
		rdbMain[1] = new JRadioButton("香酥魚排(300元)");
		rdbMain[2] = new JRadioButton("焗烤明蝦(280元)");
		rdbMain[3] = new JRadioButton("磨茹燻雞(250元)");
		rdbMain[4] = new JRadioButton("黑胡椒牛排(200元)");
		ButtonGroup grpRdb = new ButtonGroup();
		for (int i = 0; i < rdbMain.length; i++) {
			grpRdb.add(rdbMain[i]);
			panMain.add(rdbMain[i]);
		}
		// 副餐
		JPanel panSecond = new JPanel();
		add(panSecond);
		panSecond.setBounds(170, 10, 140, 75);
		panSecond.setLayout(new GridLayout(2, 1));
		panSecond.setBorder(BorderFactory.createTitledBorder("副餐"));
		String[] second_items = { "蘆筍沙拉(60元)", "皮蛋豆腐(40元)" };
		for (int i = 0; i < second_items.length; i++) {
			chkSecond[i] = new JCheckBox(second_items[i]);
			panSecond.add(chkSecond[i]);
		}
		// 甜點
		JPanel panDessert = new JPanel();
		add(panDessert);
		panDessert.setBounds(170, 90, 140, 60);
		panDessert.setBorder(BorderFactory.createTitledBorder("甜點(免費)"));
		panDessert.add(cboDessert);
		// 確定鈕
		btnOK.setBounds(100, 190, 60, 20);
		add(btnOK);
		btnOK.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int m_sum = 0, m_main = 0, m_second = 0;
		String msg = "主餐：";
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
		msg += "\n副餐：";
		if (chkSecond[0].isSelected()) {
			msg += chkSecond[0].getText() + ", ";
			m_second += 60;
		}
		if (chkSecond[1].isSelected()) {
			msg += chkSecond[1].getText();
			m_second += 40;
		}
		if (!chkSecond[0].isSelected() && !chkSecond[1].isSelected())
			msg += "未選";

		msg += "\n甜點：" + cboDessert.getSelectedItem() + "(免費)";

		m_sum = m_main + m_second;
		msg += "\n合計： " + m_sum + " 元";
		JOptionPane.showMessageDialog(null, msg);
	}
}

public class Hw13_4 {
	public static void main(String[] args) {
		new FoodF();
	}
}
