package hw12_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //更swing甅ン

class MyJFrame extends JFrame {
	private JPanel contentPane;
	private JTextField txt;
	private JLabel lbl1, lbl2;
	private JButton btn;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 170);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("叫块俱计");
		lbl1.setBounds(30, 20, 200, 15);
		contentPane.add(lbl1);

		txt = new JTextField();
		txt.setColumns(10);
		txt.setBounds(30, 50, 100, 25);
		contentPane.add(txt);

		btn = new JButton("絋﹚");
		btn.setBounds(150, 50, 70, 25);
		contentPane.add(btn);

		lbl2 = new JLabel("");
		lbl2.setBounds(30, 90, 200, 15);
		contentPane.add(lbl2);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String s = txt.getText();
				int n = Integer.parseInt(s);
				if (n % 2 == 0) {
					lbl2.setText(n + " 琌案计");
				} else {
					lbl2.setText(n + " 琌计");
				}
			}
		});

		setVisible(true);
	}
}

public class Hw12_1 {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}
}
