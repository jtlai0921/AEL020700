package hw03;

import java.util.Scanner;

public class Hw03_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String sel; // �ϥΪ̪��ﶵ
		do {
			System.out.println("************ ���  ************");
			System.out.println("A.���M��    B. �O�@��    C. ���ɯ�");
			System.out.println("D.�����    E. ���}�t��");
			System.out.println("******************************");
			System.out.print("�п�ܥ\��: ");
			sel = scn.nextLine(); // Ū����J���r��
			switch (sel) {
			case "A":
			case "a":
				System.out.println("���M�šG�@���[���ҥi�[��");
				break;
			case "B":
			case "b":
				System.out.println("�O�@�šG6~12���ൣ�ݤ��������[��");
				break;
			case "C":
			case "c":
				System.out.println("���ɯšG�����Q�G�����ൣ���i�[��");
				break;
			case "D":
			case "d":
				System.out.println("����šG�����Q�K�����o�[��");
				break;
			case "E":
			case "e":
				System.out.println("���}�t�ΡI");
				break;
			default:
				System.out.println("�п�JA�BB�BC�BD��E�I");
			}
		} while ("Ee".indexOf(sel) == -1); // �u�n��J�����O�j�p�g��E�A�N�~�����{��
		scn.close();
	}
}