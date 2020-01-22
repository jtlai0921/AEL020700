package hw08_1;

import java.util.Scanner;

public class Hw08_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double n3;
		String data1, data2;

		while (true) {
			System.out.print("��J�Q���ơG ");
			data1 = scn.nextLine();
			try {
				n1 = Integer.parseInt(data1);
			} catch (NumberFormatException e) {
				System.out.println("��J���~");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("��J���ơG ");
			data2 = scn.nextLine();
			try {
				n2 = Integer.parseInt(data2);
				if (n2 == 0)
					throw new ArithmeticException("���Ƭ��s"); // ?�X�ҥ~
				n3 = (double) n1 / n2;
			} catch (NumberFormatException e) {
				System.out.println("��J���~");
				continue;
			} catch (ArithmeticException e) {
				System.out.println("�ҥ~���e:" + e.getMessage());
				continue;
			}

			System.out.println("�۰����G : " + n3);
			break;
		}
	}
}
