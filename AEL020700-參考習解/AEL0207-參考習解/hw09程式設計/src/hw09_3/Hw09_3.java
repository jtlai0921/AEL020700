package hw09_3;

import java.util.*;

public class Hw09_3 {
	public static void main(String[] args) {
		System.out.println("��ƫظm��......");
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("�q���q15~55����Ƥ��A�üƨ��X5�Ӥ����ƪ����X....");
		for (int i = 1; i <= 5; i++) {
			while (true) {
				int num = (int) (Math.random() * 41) + 15;
				if (tset.add(num))
					break;
			}
		}
		ArrayList<Integer> alist = new ArrayList<>(tset);
		System.out.println("alist�ثe�������e�G" + alist);

		System.out.println("\n���J15,30,55�T�Ӥ���...");
		alist.add(0, 15);
		int index = 0;
		for (int i = 0; i < alist.size(); i++) {
			if (alist.get(i) > 30) {
				index = i;
				break;
			}
		}
		alist.add(index, 30);
		alist.add(55);
		System.out.println("alist�ثe�������e�G" + alist);

		System.out.println("\n�N���ޭȬ�4���������e�אּ9999�C");
		alist.set(4, 9999);
		System.out.println("alist�ثe�������e�G" + alist);
	}
}
