package hw04;

import java.util.Scanner;

public class Hw04_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] name = new String[] { "���@", "�L�G", "�i�T", "���|", "����", "��" };
		int[] score = new int[] { 56, 85, 71, 68, 35, 100 };
		int sScore;
		do {
			System.out.print("�п�J�d�ߪ����ơG(��J-1����)");
			sScore = scn.nextInt(); // �����d�ߤ���
			if (sScore == -1) { // �Y�d�ߤ��Ƭ�-1�N�����d��
				System.out.println(" �����d�ߡI ");
				break; // �����j��
			}
			// �`�Ƿj�M�k
			int num = -1; // num����-1��ܨS�������
			for (int j = 0; j < score.length; j++) {
				if (score[j] == sScore) {
					num = j;
					break; // �����j��
				}
			}
			if (num == -1) // �p�Gnum=-1��
				System.out.println(" �S�� " + sScore + " �o�Ӥ��ơI ");
			else
				System.out.println(name[num] + " " + score[num] + " �� ");
		} while (sScore != -1);
		scn.close();
	}

}