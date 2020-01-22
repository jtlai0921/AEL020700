package hw03;

import java.util.Scanner;

public class Hw03_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String id = "", pw = ""; // 宣告字串變數id,pw，分別記錄帳號和密碼
		boolean ok = false; // 宣告布林變數ok，來記錄帳號和密碼是否正確，預設為不正確false
		for (int i = 1; i <= 3; i++) { // 最多可輸入三次，所以用for迴圈
			System.out.print("請輸入帳號:");
			id = scn.next();
			System.out.print("請輸入密碼:");
			pw = scn.next();
			if (id.equals("Java") && pw.equals("1234")) { // 如果帳號和密碼正確
				ok = true; // 設布林變數ok = true
				break; // 離開迴圈
			} else {
				System.out.println("輸入錯誤  " + i + " 次 ！"); // 顯示錯誤次數
			}
		}
		if (ok == true) { // 如果ok == true，表帳號和密碼正確
			System.out.println("歡迎進入系統！");
		} else {
			System.out.println("無法進入系統！");
		}
		scn.close(); // 關閉Scanner物件scn
	}

}
