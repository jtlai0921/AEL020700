package hw03;

import java.util.Scanner;

public class Hw03_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String id = "", pw = ""; // �ŧi�r���ܼ�id,pw�A���O�O���b���M�K�X
		boolean ok = false; // �ŧi���L�ܼ�ok�A�ӰO���b���M�K�X�O�_���T�A�w�]�������Tfalse
		for (int i = 1; i <= 3; i++) { // �̦h�i��J�T���A�ҥH��for�j��
			System.out.print("�п�J�b��:");
			id = scn.next();
			System.out.print("�п�J�K�X:");
			pw = scn.next();
			if (id.equals("Java") && pw.equals("1234")) { // �p�G�b���M�K�X���T
				ok = true; // �]���L�ܼ�ok = true
				break; // ���}�j��
			} else {
				System.out.println("��J���~  " + i + " �� �I"); // ��ܿ��~����
			}
		}
		if (ok == true) { // �p�Gok == true�A��b���M�K�X���T
			System.out.println("�w��i�J�t�ΡI");
		} else {
			System.out.println("�L�k�i�J�t�ΡI");
		}
		scn.close(); // ����Scanner����scn
	}

}
