import java.util.Scanner;

public class Hw02_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入計概成績：");
		int score1 = scn.nextInt(); // 讀入一個整數並指定給score1整數變數
		System.out.print("請輸入Java成績：");
		int score2 = scn.nextInt(); // 讀入一個整數並指定給score2整數變數
		System.out.print("請輸入電子學成績：");
		int score3 = scn.nextInt(); // 讀入一個整數並指定給score3整數變數
		// %f表顯示浮點數，6表預留6個空位，因為最多為100.00，.2表顯示到小數第二位
		// 因為score1~score3都是整數，所以使用(float)強制轉型為浮點數
		System.out.printf("平均分數  =%6.2f%n", (float) (score1 + score2 + score3) / 3);
		scn.close();
	}
}
