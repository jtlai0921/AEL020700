package hw13_3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

class RdoBtn extends JFrame implements ActionListener {
	private JTextField txt1 = new JTextField();
	private JTextField txt2 = new JTextField();
	private JTextArea txtS = new JTextArea("請先輸入金額和美元匯率，\n再選擇兌換的種類。");
	private JRadioButton[] rdb = new JRadioButton[2];
	private Border lineB = BorderFactory.createLineBorder(Color.black);

	RdoBtn() {
		setTitle("台幣與美金兌換");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 270, 225);
		setLayout(null);

		JLabel lbl1 = new JLabel("輸入金額：");
		lbl1.setBounds(10, 10, 80, 20);
		add(lbl1);
		txt1.setBounds(10, 35, 80, 20);
		add(txt1);

		JLabel lbl2 = new JLabel("輸入美元匯率：");
		lbl2.setBounds(140, 10, 95, 20);
		add(lbl2);
		txt2.setBounds(140, 35, 80, 20);
		add(txt2);

		JPanel pan = new JPanel();
		add(pan);
		pan.setBounds(10, 65, 230, 55);
		pan.setBorder(BorderFactory.createTitledBorder(lineB, "請選擇"));
		pan.setLayout(new FlowLayout());
		ButtonGroup group = new ButtonGroup();
		rdb[0] = new JRadioButton("台幣換美金", true);
		rdb[1] = new JRadioButton("美金換台幣");
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
			txtS.setText("台幣 " + nt + " 元，可兌換成美金\n" + usa + " 元");
		} else {
			int usa = Integer.parseInt(txt1.getText());
			double nt = usa * Double.parseDouble(txt2.getText());
			txtS.setText("美金 " + usa + " 元，可兌換成台幣\n" + nt + " 元");
		}
	}
}

public class Hw13_3 {
	public static void main(String[] args) {
		new RdoBtn();
	}
}