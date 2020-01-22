package layoutDemo;

import javax.swing.*; //載入swing套件

class MyJFrame extends JFrame {
	private JPanel contentPane;

	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 160);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn[] = new JButton[8];
		for (int x = 0; x < btn.length; x++) {
			btn[x] = new JButton("按鈕元件" + (x + 1));
			btn[x].setBounds(10 + x % 3 * 104, 10 + x / 3 * 32, 96, 23);
			contentPane.add(btn[x]);
		}
		JButton btn9 = new JButton("按鈕元件9");
		btn9.setBounds(218, 74, 96, 23);
		contentPane.add(btn9);

		setVisible(true);
	}
}

public class LayoutDemo {

	public static void main(String[] args) {
		MyJFrame f = new MyJFrame();
	}

}
