package hw09_2;

import java.util.*;

public class Hw09_2 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("�q���q1~100����Ƥ��A�üƨ��X10�Ӥ����ƪ����X....\n");
		for (int i = 1; i <= 10; i++) {
			while (true) {
				int num = (int) (Math.random() * 100) + 1;
				if (tset.add(num)) {
					System.out.println("�� " + i + " �Ӹ��X�G" + num);
					break;
				}
			}
		}
		System.out.println();
		System.out.println("���󤺤����ӼƬ��G" + tset.size());
		System.out.println("���󤺤��������e�G" + tset);
		System.out.println("�Ĥ@�Ӥ������e���G" + tset.first());
		System.out.println("�̫�@�Ӥ������e�G" + tset.last());
		System.out.println("���e����30��70�̡G" + tset.subSet(30, 71));
	}
}
