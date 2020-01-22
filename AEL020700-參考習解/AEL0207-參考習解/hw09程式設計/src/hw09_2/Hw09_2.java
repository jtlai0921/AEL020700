package hw09_2;

import java.util.*;

public class Hw09_2 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼....\n");
		for (int i = 1; i <= 10; i++) {
			while (true) {
				int num = (int) (Math.random() * 100) + 1;
				if (tset.add(num)) {
					System.out.println("第 " + i + " 個號碼：" + num);
					break;
				}
			}
		}
		System.out.println();
		System.out.println("物件內元素個數為：" + tset.size());
		System.out.println("物件內元素的內容：" + tset);
		System.out.println("第一個元素內容為：" + tset.first());
		System.out.println("最後一個元素內容：" + tset.last());
		System.out.println("內容介於30～70者：" + tset.subSet(30, 71));
	}
}
