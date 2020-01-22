package hw09_5;

import java.util.*;

public class Hw09_5 {
	public static void main(String[] args) {
		System.out.println("資料建置中......");
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("電腦從1~100的整數中，亂數取出5個不重複的號碼....");
		for (int i = 1; i <= 5; i++) {
			while (true) {
				int num = (int) (Math.random() * 100) + 1;
				if (tset.add(num))
					break;
			}
		}
		System.out.println("tset目前元素內容：" + tset);

		Iterator<Integer> itera = tset.iterator();
		double total = 0.0;
		while (itera.hasNext()) {
			int num = itera.next();
			total += num;
		}
		double avg = (double) (total / tset.size());
		System.out.println("所有元素的平均值：" + avg);
	}
}
