package hw03;

import java.util.Scanner;

public class Hw03_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String sel; // 使用者的選項
		do {
			System.out.println("************ 選單  ************");
			System.out.println("A.普遍級    B. 保護級    C. 輔導級");
			System.out.println("D.限制級    E. 離開系統");
			System.out.println("******************************");
			System.out.print("請選擇功能: ");
			sel = scn.nextLine(); // 讀取輸入的字串
			switch (sel) {
			case "A":
			case "a":
				System.out.println("普遍級：一般觀眾皆可觀賞");
				break;
			case "B":
			case "b":
				System.out.println("保護級：6~12歲兒童需父母陪伴觀賞");
				break;
			case "C":
			case "c":
				System.out.println("輔導級：未滿十二歲的兒童不可觀賞");
				break;
			case "D":
			case "d":
				System.out.println("限制級：未滿十八歲不得觀賞");
				break;
			case "E":
			case "e":
				System.out.println("離開系統！");
				break;
			default:
				System.out.println("請輸入A、B、C、D或E！");
			}
		} while ("Ee".indexOf(sel) == -1); // 只要輸入的不是大小寫的E，就繼續執行程式
		scn.close();
	}
}