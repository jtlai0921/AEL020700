package hw03;

import java.util.Scanner;

public class Hw03_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 1; // ��J�����
		int sum = 0; // �֭p���`�M
		do { // �]���������檺���ơA�B�ܤְ���@���A�ҥH�ϥ�do�j��
			System.out.print("�п�J����ơA�p��1��Ӽƪ��`�X(��J0����)�G");
			num = scn.nextInt();
			if (num > 0) { // �p�G��J�����num > 0
				sum = 0; // �]�֭p���`�Msum = 0
				for (int i = 1; i <= num; i++) { // ��for�j���1��num
					sum += i; // i�ȥ[��sum��
				}
				System.out.println("1 �� " + num + " ���`�X = " + sum);
			}
		} while (num != 0); // �Ynum == 0 ����do�j��
		System.out.println("�{������  ");
		scn.close();
	}

}
