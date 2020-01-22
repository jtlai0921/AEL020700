package border;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class InterFrame extends JFrame {
	InterFrame() { // 預設建構式
		setTitle("Border示範");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 260, 200);
		setLayout(null);

		JPanel panSex = new JPanel();
		add(panSex);
		panSex.setBounds(20, 20, 80, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		panSex.setBorder(BorderFactory.createTitledBorder(lineB, "性別"));
		panSex.setLayout(new FlowLayout(FlowLayout.LEFT));
		ButtonGroup group = new ButtonGroup();
		JRadioButton[] rdb = new JRadioButton[2];
		rdb[0] = new JRadioButton("男", true);
		rdb[1] = new JRadioButton("女");
		for (int i = 0; i < rdb.length; i++) {
			group.add(rdb[i]);
			panSex.add(rdb[i]);
		}

		JPanel panInter = new JPanel();
		add(panInter);
		panInter.setBounds(135, 20, 80, 120);
		Border lineA = BorderFactory.createLineBorder(Color.black);
		panInter.setBorder(BorderFactory.createTitledBorder(lineA, "興趣"));
		panInter.setLayout(new FlowLayout(FlowLayout.LEFT));
		JCheckBox[] chk = new JCheckBox[3];
		chk[0] = new JCheckBox("音樂", true);
		chk[1] = new JCheckBox("美術");
		chk[2] = new JCheckBox("表演", true);
		for (int j = 0; j < chk.length; j++)
			panInter.add(chk[j]);

		setVisible(true);
	}
}

public class border {
	public static void main(String[] args) {
		new InterFrame(); // 執行此行會自動執行第7-29行 InterFrame()預設建構式
	}
}
