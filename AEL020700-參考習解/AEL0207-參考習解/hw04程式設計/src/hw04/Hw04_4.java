package hw04;

import java.util.Scanner;

public class Hw04_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] name = new String[] { "陳一", "林二", "張三", "李四", "王五", "何六" };
		int[] score = new int[] { 56, 85, 71, 68, 35, 100 };
		int sScore;
		do {
			System.out.print("請輸入查詢的分數：(輸入-1結束)");
			sScore = scn.nextInt(); // 紀錄查詢分數
			if (sScore == -1) { // 若查詢分數為-1就結束查詢
				System.out.println(" 結束查詢！ ");
				break; // 跳離迴圈
			}
			// 循序搜尋法
			int num = -1; // num等於-1表示沒有找到資料
			for (int j = 0; j < score.length; j++) {
				if (score[j] == sScore) {
					num = j;
					break; // 跳離迴圈
				}
			}
			if (num == -1) // 如果num=-1表
				System.out.println(" 沒有 " + sScore + " 這個分數！ ");
			else
				System.out.println(name[num] + " " + score[num] + " 分 ");
		} while (sScore != -1);
		scn.close();
	}

}