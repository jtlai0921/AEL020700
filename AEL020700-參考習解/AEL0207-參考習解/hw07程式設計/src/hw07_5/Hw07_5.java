package hw07_5;

import java.util.Scanner;

interface Exchange {
	public double USRATE = 29.1002;
	public double JPRATE = 0.2749;

	void convert(int coin);
}

class UStoNT implements Exchange {
	public void convert(int coin) {
		int NT = (int) (coin * USRATE);
		System.out.printf("  ����%d��, �i�I���x��%d��%n", coin, NT);
	}
}

class JPtoNT implements Exchange {
	public void convert(int coin) {
		int NT = (int) (coin * JPRATE);
		System.out.printf("  ����%d��, �i�I���x��%d��%n", coin, NT);
	}
}

public class Hw07_5 {
	public static void main(String[] args) {
		Exchange change;
		UStoNT cashUS = new UStoNT();
		JPtoNT cashJP = new JPtoNT();
		int coin;

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("��ܥ~���H (1.����   2.���   0.���})�G");
			int item = scn.nextInt();
			if (item == 1) {
				System.out.print("  ��J�n�I���������G");
				coin = scn.nextInt();
				change = cashUS;
			} else if (item == 2) {
				System.out.print("  ��J�n�I��������G");
				coin = scn.nextInt();
				change = cashJP;
			} else {
				scn.close();
				break;
			}
			change.convert(coin);
		}
	}
}
