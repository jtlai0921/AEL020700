package hw03;

import java.util.Scanner;

public class Hw03_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0; // ��J����ƹw�]��0
		do {
			System.out.print("�п�J 2 ~ 99 ����ơG");
			num = scn.nextInt();
		} while (num < 2 || num > 99);
		System.out.println("1 ~ 100��Q " + num + " �㰣���ƭȡG");
		for (int i = num; i <= 100; i++) {
			if (i % num == 0) { // �p�G��J���num % 2 ���l�� == 0
				System.out.print(i + ", ");
			}
		}
		scn.close();
	}

}