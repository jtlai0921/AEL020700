package hw04;

import java.util.Arrays;

public class Hw04_5 {
	public static void main(String[] args) {
		int[] aRdm = new int[10];
		for (int i = 0; i < aRdm.length; i++)
			aRdm[i] = (int) (Math.random() * (1000 - 500 + 1)) + 500; // 產生500~1000的亂數
		System.out.println("排序前：");
		for (int a : aRdm)
			System.out.print(a + "\t");
		Arrays.sort(aRdm); // 使用sort()方法排序
		System.out.println();
		System.out.println("排序後：");
		for (int a : aRdm)
			System.out.print(a + "\t");
		System.out.println();
		System.out.printf("最小值：%d%n", aRdm[0]); // 排序後最小值在註標0
		System.out.printf("最大值：%d%n", aRdm[aRdm.length - 1]); // 最大值在最後一個註標
	}
}
