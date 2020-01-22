package hw08_1;

import java.util.Scanner;

public class Hw08_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double n3;
		String data1, data2;

		while (true) {
			System.out.print("輸入被除數： ");
			data1 = scn.nextLine();
			try {
				n1 = Integer.parseInt(data1);
			} catch (NumberFormatException e) {
				System.out.println("輸入錯誤");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("輸入除數： ");
			data2 = scn.nextLine();
			try {
				n2 = Integer.parseInt(data2);
				if (n2 == 0)
					throw new ArithmeticException("除數為零"); // ?出例外
				n3 = (double) n1 / n2;
			} catch (NumberFormatException e) {
				System.out.println("輸入錯誤");
				continue;
			} catch (ArithmeticException e) {
				System.out.println("例外內容:" + e.getMessage());
				continue;
			}

			System.out.println("相除結果 : " + n3);
			break;
		}
	}
}
