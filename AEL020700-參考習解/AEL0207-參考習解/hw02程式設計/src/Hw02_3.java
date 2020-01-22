import java.util.Scanner;

public class Hw02_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個整數：");
		int num1 = scn.nextInt(); // 讀入一個整數並指定給num1整數變數
		System.out.print("請輸入第二個整數：");
		int num2 = scn.nextInt(); // 讀入一個整數並指定給num2整數變數
		// 因為求兩數相除的商，商的值是整數，所以使用(int)強制轉型為整數
		System.out.printf("%d 除以 %d 的商為  %d%n", num1, num2, (int) (num1 / num2));
		scn.close();
	}
}
