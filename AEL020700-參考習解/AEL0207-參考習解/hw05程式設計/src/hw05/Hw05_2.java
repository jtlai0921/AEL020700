package hw05;

import java.util.Scanner;

public class Hw05_2 {
	static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("計算費氏數列的第X項，請輸入X = ");
		int f = scn.nextInt();
		System.out.println("費氏數列的第" + f + "項 = " + fib(f));
	}

}
