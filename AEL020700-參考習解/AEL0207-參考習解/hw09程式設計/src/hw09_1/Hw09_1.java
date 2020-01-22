package hw09_1;

import java.util.*;

public class Hw09_1 {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();
		int order = 1, num;
		Scanner keyin = new Scanner(System.in);
		System.out.println("請從1~49的整數中，輸入6個不重複的號碼....\n");

		while (order <= 6) {
			System.out.print("第 " + order + " 個號碼 ? ");
			try {
				num = Integer.parseInt(keyin.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("請輸入數值！");
				continue;
			}
			if (num >= 1 && num <= 49) {
				if (hset.add(num))
					order++;
				else
					System.out.println("號碼重複輸入！");
			} else
				System.out.println("號碼範圍錯誤！");
		}
		System.out.println("\n6個號碼分別為：");
		System.out.println(hset);
		keyin.close();
	}
}
