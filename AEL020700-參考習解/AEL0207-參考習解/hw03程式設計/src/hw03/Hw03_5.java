package hw03;

import java.util.Scanner;

public class Hw03_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0; // 輸入的整數預設為0
		do {
			System.out.print("請輸入 2 ~ 99 的整數：");
			num = scn.nextInt();
		} while (num < 2 || num > 99);
		System.out.println("1 ~ 100能被 " + num + " 整除的數值：");
		for (int i = num; i <= 100; i++) {
			if (i % num == 0) { // 如果輸入整數num % 2 的餘數 == 0
				System.out.print(i + ", ");
			}
		}
		scn.close();
	}

}