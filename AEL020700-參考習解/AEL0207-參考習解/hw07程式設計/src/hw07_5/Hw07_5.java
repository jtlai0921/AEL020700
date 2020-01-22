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
		System.out.printf("  美元%d元, 可兌換台幣%d元%n", coin, NT);
	}
}

class JPtoNT implements Exchange {
	public void convert(int coin) {
		int NT = (int) (coin * JPRATE);
		System.out.printf("  美元%d元, 可兌換台幣%d元%n", coin, NT);
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
			System.out.print("選擇外幣？ (1.美元   2.日幣   0.離開)：");
			int item = scn.nextInt();
			if (item == 1) {
				System.out.print("  輸入要兌換的美元：");
				coin = scn.nextInt();
				change = cashUS;
			} else if (item == 2) {
				System.out.print("  輸入要兌換的日幣：");
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
