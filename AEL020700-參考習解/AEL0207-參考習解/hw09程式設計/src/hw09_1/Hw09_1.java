package hw09_1;

import java.util.*;

public class Hw09_1 {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();
		int order = 1, num;
		Scanner keyin = new Scanner(System.in);
		System.out.println("�бq1~49����Ƥ��A��J6�Ӥ����ƪ����X....\n");

		while (order <= 6) {
			System.out.print("�� " + order + " �Ӹ��X ? ");
			try {
				num = Integer.parseInt(keyin.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("�п�J�ƭȡI");
				continue;
			}
			if (num >= 1 && num <= 49) {
				if (hset.add(num))
					order++;
				else
					System.out.println("���X���ƿ�J�I");
			} else
				System.out.println("���X�d����~�I");
		}
		System.out.println("\n6�Ӹ��X���O���G");
		System.out.println(hset);
		keyin.close();
	}
}
