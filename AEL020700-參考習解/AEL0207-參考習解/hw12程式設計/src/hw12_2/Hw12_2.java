package hw12_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //載入swing套件

class MyJFrame extends JFrame {
	private JPanel contentPane;
	private JTextField txt;
	private JLabel lbl1, lbl2;
	private JButton btn;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 180);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("請輸入年所得：");
		lbl1.setBounds(30, 30, 200, 15);
		contentPane.add(lbl1);

		txt = new JTextField();
		txt.setColumns(10);
		txt.setBounds(30, 60, 100, 25);
		contentPane.add(txt);

		btn = new JButton("確定");
		btn.setBounds(150, 60, 70, 25);
		contentPane.add(btn);

		lbl2 = new JLabel("");
		lbl2.setBounds(30, 100, 400, 15);
		contentPane.add(lbl2);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double money, tax = 0.0;
				money = Double.parseDouble(txt.getText());
				if (money < 300000) {
					tax = 0;
				} else if (money >= 300000 && money <= 600000) {
					tax = money * 0.03;
				} else if (money > 600001 && money <= 900000) {
					tax = money * 0.06;
				} else if (money > 900001 && money <= 1500000) {
					tax = money * 0.12;
				} else if (money > 1500001 && money <= 3000000) {
					tax = money * 0.2;
				} else if (money > 3000000) {
					tax = money * 0.3;
				}
				lbl2.setText("年所得" + money + "元，應繳所得稅" + tax + "元");
			}
		});

		setVisible(true);
	}
}

public class Hw12_2 {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}
