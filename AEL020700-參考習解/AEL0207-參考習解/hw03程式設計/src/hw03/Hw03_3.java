package hw03;

import java.util.Scanner;

public class Hw03_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 1; // 輸入的整數
		int sum = 0; // 累計的總和
		do { // 因為不知執行的次數，且至少執行一次，所以使用do迴圈
			System.out.print("請輸入正整數，計算1到該數的總合(輸入0結束)：");
			num = scn.nextInt();
			if (num > 0) { // 如果輸入的整數num > 0
				sum = 0; // 設累計的總和sum = 0
				for (int i = 1; i <= num; i++) { // 用for迴圈由1到num
					sum += i; // i值加到sum中
				}
				System.out.println("1 到 " + num + " 的總合 = " + sum);
			}
		} while (num != 0); // 若num == 0 結束do迴圈
		System.out.println("程式結束  ");
		scn.close();
	}

}
