package hw04;

import java.util.Arrays;
import java.util.Scanner;

public class Hw04_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10]; // 宣告長度為10的整數陣列arr
		// 用for迴圈接受使用者輸入的整數
		for (int i = 0; i < arr.length; i++) { // i值由0到9
			System.out.printf("請輸入第 %d 個整數:", i + 1);
			arr[i] = scn.nextInt(); // 將輸入的整數存入對應的元素中
		}
		scn.close();
		System.out.print("排序前: ");
		for (int a : arr) // 用for-each迴圈讀取陣列元素值
			System.out.print(a + ", ");
		System.out.println();
		Arrays.sort(arr); // 用Arrays類別的sort方法將arr陣列排序
		System.out.print("排序後: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}

}