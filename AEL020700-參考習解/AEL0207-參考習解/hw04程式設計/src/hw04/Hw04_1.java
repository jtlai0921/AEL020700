package hw04;

public class Hw04_1 {

	public static void main(String[] args) {
		int[][] num = new int[9][9]; // 宣告 9X9 的整數二維陣列num
		// 用for巢狀迴圈來設定num的元素值，1X1的積存在num[0][0]...9X9的積存在num[8][8]中
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				num[i][j] = (i + 1) * (j + 1);
			}
		}
		// 用for巢狀迴圈來顯示九九乘法表
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				System.out.printf("%d X %d = %2d  ", i + 1, j + 1, num[i][j]);
			}
			System.out.println(); // 換行
		}
	}

}
