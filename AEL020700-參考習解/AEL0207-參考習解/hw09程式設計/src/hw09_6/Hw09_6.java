package hw09_6;

import java.util.*;

public class Hw09_6 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "January");
		tmap.put(2, "February");
		tmap.put(3, "March");
		tmap.put(4, "April");
		tmap.put(5, "May");
		tmap.put(6, "June");
		tmap.put(7, "July");
		tmap.put(8, "August");
		tmap.put(9, "September");
		tmap.put(10, "October");
		tmap.put(11, "November");
		tmap.put(12, "December");

		java.util.Scanner keyin = new java.util.Scanner(System.in);
		int key = 0;
		while (true) {
			System.out.print("請輸入1~12？ ");
			try {
				key = Integer.parseInt(keyin.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("請輸入數值！");
				continue;
			}
			if (key >= 1 && key <= 12)
				break;
			else
				System.out.println("範圍錯誤！");
		}
		System.out.println("\n第" + key + "月的英文單字為 " + tmap.get(key));
	}
}
