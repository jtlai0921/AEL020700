package hw05;

import java.util.Scanner;
public class Hw05_3 {
	//�ϥ�����۰��k�ӨD�̤j���]��
	int gcd(int m, int n) {
		if (n == 0)
			return m;	//�Yn=0��ܾ㰣�N�Ǧ^m�A�������j
		else
			return gcd(n, m % n);	//�Ǧ^gcd(n, m % n)�A�|���j�I�sgcd��k
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�p��̤j���]�ơA�п�J�Ĥ@�Ӽ� = ");
		int num1 = scn.nextInt();
		System.out.print("�p��̤j���]�ơA�п�J�ĤG�Ӽ� = ");
		int num2 = scn.nextInt();
		Hw05_3 c = new Hw05_3();	//�إ�Hw05_3���O�����骫�� c
		//��c.gcd(num1, num2)�өI�sc����gcd��k
		System.out.println(num1 + "�B" + num2 + " ���̤j���]�� = " + c.gcd(num1, num2));
		scn.close();
	}

}