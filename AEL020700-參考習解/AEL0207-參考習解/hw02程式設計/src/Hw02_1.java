import java.util.Scanner;

public class Hw02_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個整數：");
		int num1 = scn.nextInt(); // 讀入一個整數並指定給num1整數變數
		System.out.print("請輸入第二個整數：");
		int num2 = scn.nextInt(); // 讀入一個整數並指定給num2整數變數
		// 第一個%d為num1，第二個%d為num2，因為num1 > num2是布林值所以使用%b
		System.out.printf("%d > %d = %b%n", num1, num2, num1 > num2);
		scn.close();
	}
}
