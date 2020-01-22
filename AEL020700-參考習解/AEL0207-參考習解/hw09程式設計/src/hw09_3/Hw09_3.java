package hw09_3;

import java.util.*;

public class Hw09_3 {
	public static void main(String[] args) {
		System.out.println("資料建置中......");
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("電腦從15~55的整數中，亂數取出5個不重複的號碼....");
		for (int i = 1; i <= 5; i++) {
			while (true) {
				int num = (int) (Math.random() * 41) + 15;
				if (tset.add(num))
					break;
			}
		}
		ArrayList<Integer> alist = new ArrayList<>(tset);
		System.out.println("alist目前元素內容：" + alist);

		System.out.println("\n插入15,30,55三個元素...");
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
		System.out.println("alist目前元素內容：" + alist);

		System.out.println("\n將索引值為4的元素內容改為9999。");
		alist.set(4, 9999);
		System.out.println("alist目前元素內容：" + alist);
	}
}
