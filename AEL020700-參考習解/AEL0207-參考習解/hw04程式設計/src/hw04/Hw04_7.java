package hw04;

import java.util.Scanner;

public class Hw04_7 {

	public static void main(String[] args) {
		String[][][] views = new String[4][][]; // �T���D��٦r��}�C
		views[0] = new String[][] { { "�����s", "�x�_����" }, { "�E��", "�d������������" } };
		views[1] = new String[][] { { "������a", "�೾�B�ݤi���̨δ��I" }, { "����ѵ�", "��V�ɪ��G�D" }, { "����", "����s������Ѧ�" } };
		views[2] = new String[][] { { "�x���|��", "����L����G�D" }, { "�����s", "���������X�_��" }, { "��l�W", "�ؤs�s�S���Ѥ@��" },
				{ "���B", "�n�ꭷ�����W�����״I" } };
		views[3] = new String[][] { { "�Ӿ|��", "�l�����[�������R" }, { "�q�h�r��", "�x�ଡ�ʨ�E����" }, { "����", "�_�����ۼ���Ѱ�" } };
		Scanner scn = new Scanner(System.in);
		int area = 0; // �����ϥΪ̿�ܪ��a��
		int sel = 0; // �����ϥΪ̿�ܪ�������
		do {
			System.out.println("** �п�J�Ʀr��ܦa�� **");
			System.out.print("1�_��  2����  3�n��  4�F��  0����   -> " );
			area = scn.nextInt(); // ��J��-1����Э�
			if (area != 0) { // �p�G�a�Ϥ��O��J0
				do {
					System.out.println("** �п�J�Ʀr��ܭ����� **");
					for (int i = 0; i < views[area - 1].length; i++) { // ��ܫ��w�a�Ϥ��������ϦW��
						System.out.print((i + 1) + views[area - 1][i][0] + "  ");
					}
					System.out.print("0����   -> ");
					sel = scn.nextInt();
					if (sel != 0) { // �p�G�����Ϥ��O��J0
						System.out.printf("** %s������²��  **%n", views[area - 1][sel - 1][0]);// views[area-1][sel-1][0]���ܭ����Ϫ��W��
						System.out.println(views[area - 1][sel - 1][1]); // views[area-1][sel-1][1]���ܭ����Ϫ�²��
					}
				} while (sel != 0); // �����Ͽ�J 0 ���Xdo�j��
			}
		} while (area != 0); // �a�Ͽ�J 0 ���Xdo�j��
		System.out.println("** �{������  **");
		scn.close();
	}
}
