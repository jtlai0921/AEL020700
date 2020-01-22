import java.util.Scanner;

public class Hw02_4 {
	public static void main(String[] args) {
		final int PASS = 60;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入兩個成績(中間用空白相隔)：");
		int score = scn.nextInt(); // 讀入一個整數並指定給score整數變數
		System.out.printf("第一個成績為%4d,及格分數為%4d,是否及格：%b%n", score, PASS, score >= PASS);
		score = scn.nextInt(); // 讀入一個整數並指定給score整數變數
		System.out.printf("第一個成績為%4d,及格分數為%4d,是否及格：%b%n", score, PASS, score >= PASS);
		scn.close();
	}
}