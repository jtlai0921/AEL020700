package hw05;

import java.util.Scanner;
public class Hw05_3 {
	//使用輾轉相除法來求最大公因數
	int gcd(int m, int n) {
		if (n == 0)
			return m;	//若n=0表示整除就傳回m，結束遞迴
		else
			return gcd(n, m % n);	//傳回gcd(n, m % n)，會遞迴呼叫gcd方法
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("計算最大公因數，請輸入第一個數 = ");
		int num1 = scn.nextInt();
		System.out.print("計算最大公因數，請輸入第二個數 = ");
		int num2 = scn.nextInt();
		Hw05_3 c = new Hw05_3();	//建立Hw05_3類別的實體物件 c
		//用c.gcd(num1, num2)來呼叫c物件的gcd方法
		System.out.println(num1 + "、" + num2 + " 的最大公因數 = " + c.gcd(num1, num2));
		scn.close();
	}

}