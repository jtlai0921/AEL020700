package hw09_5;

import java.util.*;

public class Hw09_5 {
	public static void main(String[] args) {
		System.out.println("��ƫظm��......");
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("�q���q1~100����Ƥ��A�üƨ��X5�Ӥ����ƪ����X....");
		for (int i = 1; i <= 5; i++) {
			while (true) {
				int num = (int) (Math.random() * 100) + 1;
				if (tset.add(num))
					break;
			}
		}
		System.out.println("tset�ثe�������e�G" + tset);

		Iterator<Integer> itera = tset.iterator();
		double total = 0.0;
		while (itera.hasNext()) {
			int num = itera.next();
			total += num;
		}
		double avg = (double) (total / tset.size());
		System.out.println("�Ҧ������������ȡG" + avg);
	}
}
