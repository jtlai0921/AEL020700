package hw03;

import java.util.Scanner;

public class Hw03_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;		// ��J����ƹw�]��0
		System.out.print("�п�J��ơA�P�_�O�_�Ʃΰ��ơG");
		num = scn.nextInt();
		if (num % 2 == 0) {	// �p�G��J���num % 2 ���l�� == 0
			System.out.println(num + " ������");
		} else {
			System.out.println(num + " ���_��");
		}
		scn.close();
	}

}