package hw04;

import java.util.Arrays;

public class Hw04_6 {

	public static void main(String[] args) {
		int[] aRdm = new int[100]; // �s�񲣥ͪ��ü�
		for (int i = 0; i < aRdm.length; i++) // �v�@���Ͷü�
			aRdm[i] = (int) (Math.random() * 10) + 1;
		int[] count = new int[10]; // �s��1 ~ 10���Ӽ�
		Arrays.fill(count, 0); // �w�]�ӼƬ�0
		for (int a : aRdm) { // �v�@Ū��aRdm�����üƭ�
			count[a - 1]++; // �Ҧp�üƭȬ�1�N�Ncount[0]�[1
		}
		System.out.println(" �έp���G�G");
		for (int i = 0; i < count.length; i++)
			System.out.println((i + 1) + "�G\t" + count[i]);// �üƭȩM���ЭȮt1
	}

}
