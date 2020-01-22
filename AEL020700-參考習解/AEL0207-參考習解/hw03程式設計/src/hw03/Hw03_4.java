package hw03;

import java.util.Scanner;

public class Hw03_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;		// 块俱计箇砞0
		System.out.print("叫块俱计耞琌计┪案计");
		num = scn.nextInt();
		if (num % 2 == 0) {	// 狦块俱计num % 2 緇计 == 0
			System.out.println(num + " 案计");
		} else {
			System.out.println(num + " 计");
		}
		scn.close();
	}

}