package border;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class InterFrame extends JFrame {
	InterFrame() { // �w�]�غc��
		setTitle("Border�ܽd");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 260, 200);
		setLayout(null);

		JPanel panSex = new JPanel();
		add(panSex);
		panSex.setBounds(20, 20, 80, 120);
		Border lineB = BorderFactory.createLineBorder(Color.black);
		panSex.setBorder(BorderFactory.createTitledBorder(lineB, "�ʧO"));
		panSex.setLayout(new FlowLayout(FlowLayout.LEFT));
		ButtonGroup group = new ButtonGroup();
		JRadioButton[] rdb = new JRadioButton[2];
		rdb[0] = new JRadioButton("�k", true);
		rdb[1] = new JRadioButton("�k");
		for (int i = 0; i < rdb.length; i++) {
			group.add(rdb[i]);
			panSex.add(rdb[i]);
		}

		JPanel panInter = new JPanel();
		add(panInter);
		panInter.setBounds(135, 20, 80, 120);
		Border lineA = BorderFactory.createLineBorder(Color.black);
		panInter.setBorder(BorderFactory.createTitledBorder(lineA, "����"));
		panInter.setLayout(new FlowLayout(FlowLayout.LEFT));
		JCheckBox[] chk = new JCheckBox[3];
		chk[0] = new JCheckBox("����", true);
		chk[1] = new JCheckBox("���N");
		chk[2] = new JCheckBox("��t", true);
		for (int j = 0; j < chk.length; j++)
			panInter.add(chk[j]);

		setVisible(true);
	}
}

public class border {
	public static void main(String[] args) {
		new InterFrame(); // ���榹��|�۰ʰ����7-29�� InterFrame()�w�]�غc��
	}
}
