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
		System.out.print("�p��O��ƦC����X���A�п�JX = ");
		int f = scn.nextInt();
		System.out.println("�O��ƦC����" + f + "�� = " + fib(f));
	}

}
