package hw04;

import java.util.Arrays;
import java.util.Scanner;

public class Hw04_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10]; // �ŧi���׬�10����ư}�Carr
		// ��for�j�鱵���ϥΪ̿�J�����
		for (int i = 0; i < arr.length; i++) { // i�ȥ�0��9
			System.out.printf("�п�J�� %d �Ӿ��:", i + 1);
			arr[i] = scn.nextInt(); // �N��J����Ʀs�J������������
		}
		scn.close();
		System.out.print("�Ƨǫe: ");
		for (int a : arr) // ��for-each�j��Ū���}�C������
			System.out.print(a + ", ");
		System.out.println();
		Arrays.sort(arr); // ��Arrays���O��sort��k�Narr�}�C�Ƨ�
		System.out.print("�Ƨǫ�: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}

}