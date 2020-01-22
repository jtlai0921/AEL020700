package hw13_2;

import java.awt.*;
import javax.swing.*;

class ScrollPaneF extends JFrame {
	ScrollPaneF() {
		setTitle("¤ô¥­±²°Ê¶b");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 425, 200);
		setLayout(null);

		ImageIcon photo = new ImageIcon("sea.jpg");
		JScrollPane span = new JScrollPane(new JLabel(photo), ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		span.setBounds(6, 6, 400, 150);
		add(span);

		setVisible(true);
	}
}

public class Hw13_2 {
	public static void main(String[] args) {
		new ScrollPaneF();
	}
}
