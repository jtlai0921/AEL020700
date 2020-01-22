package hw04;

import java.util.Arrays;

public class Hw04_6 {

	public static void main(String[] args) {
		int[] aRdm = new int[100]; // 存放產生的亂數
		for (int i = 0; i < aRdm.length; i++) // 逐一產生亂數
			aRdm[i] = (int) (Math.random() * 10) + 1;
		int[] count = new int[10]; // 存放1 ~ 10的個數
		Arrays.fill(count, 0); // 預設個數為0
		for (int a : aRdm) { // 逐一讀取aRdm中的亂數值
			count[a - 1]++; // 例如亂數值為1就將count[0]加1
		}
		System.out.println(" 統計結果：");
		for (int i = 0; i < count.length; i++)
			System.out.println((i + 1) + "：\t" + count[i]);// 亂數值和註標值差1
	}

}
