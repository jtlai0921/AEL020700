package hw04;

import java.util.Scanner;

public class Hw04_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] name = new String[] { "���@", "�L�G", "�i�T", "���|", "����" };
		int[] age = new int[] { 56, 45, 51, 48, 35 };
		int sel = 0;
		do {
			System.out.print("��ܫ��~�ֱƧǤ覡�A�п�J1��2(1.���W 2.����)�G");
			sel = scn.nextInt();
		} while (sel < 1 || sel > 2);
		scn.close();
		// ��w�ƧǪk
		int n = age.length;
		int t;
		String tmp;
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (sel == 1) { // ���W�Ƨ�
					if (age[j] > age[j + 1]) {
						t = age[j];
						age[j] = age[j + 1];
						age[j + 1] = t;
						tmp = name[j];
						name[j] = name[j + 1];
						name[j + 1] = tmp;
					}
				} else { // ����Ƨ�
					if (age[j] < age[j + 1]) {
						t = age[j];
						age[j] = age[j + 1];
						age[j + 1] = t;
						tmp = name[j];
						name[j] = name[j + 1];
						name[j + 1] = tmp;
					}
				}
			}
		}
		System.out.println(" ��   ��   ��  �G");
		for (int a = 0; a < age.length; a++)
			System.out.print(name[a] + " " + age[a] + " ��,  ");

	}

}