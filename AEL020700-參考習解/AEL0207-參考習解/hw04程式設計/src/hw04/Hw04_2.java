package hw04;

import java.util.Scanner;

public class Hw04_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] name = new String[] { "陳一", "林二", "張三", "李四", "王五" };
		int[] age = new int[] { 56, 45, 51, 48, 35 };
		int sel = 0;
		do {
			System.out.print("選擇按年齡排序方式，請輸入1或2(1.遞增 2.遞減)：");
			sel = scn.nextInt();
		} while (sel < 1 || sel > 2);
		scn.close();
		// 氣泡排序法
		int n = age.length;
		int t;
		String tmp;
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (sel == 1) { // 遞增排序
					if (age[j] > age[j + 1]) {
						t = age[j];
						age[j] = age[j + 1];
						age[j + 1] = t;
						tmp = name[j];
						name[j] = name[j + 1];
						name[j + 1] = tmp;
					}
				} else { // 遞減排序
					if (age[j] < age[j + 1]) {
						t = age[j];
						age[j] = age[j + 1];
						age[j + 1] = t;
						tmp = name[j];
						name[j] = name[j + 1];
						name[j + 1] = tmp;
					}
				}
			}
		}
		System.out.println(" 排   序   後  ：");
		for (int a = 0; a < age.length; a++)
			System.out.print(name[a] + " " + age[a] + " 歲,  ");

	}

}