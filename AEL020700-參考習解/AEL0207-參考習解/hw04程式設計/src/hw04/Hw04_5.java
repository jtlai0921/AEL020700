package hw04;

import java.util.Arrays;

public class Hw04_5 {
	public static void main(String[] args) {
		int[] aRdm = new int[10];
		for (int i = 0; i < aRdm.length; i++)
			aRdm[i] = (int) (Math.random() * (1000 - 500 + 1)) + 500; // ����500~1000���ü�
		System.out.println("�Ƨǫe�G");
		for (int a : aRdm)
			System.out.print(a + "\t");
		Arrays.sort(aRdm); // �ϥ�sort()��k�Ƨ�
		System.out.println();
		System.out.println("�Ƨǫ�G");
		for (int a : aRdm)
			System.out.print(a + "\t");
		System.out.println();
		System.out.printf("�̤p�ȡG%d%n", aRdm[0]); // �Ƨǫ�̤p�Ȧb����0
		System.out.printf("�̤j�ȡG%d%n", aRdm[aRdm.length - 1]); // �̤j�Ȧb�̫�@�ӵ���
	}
}
