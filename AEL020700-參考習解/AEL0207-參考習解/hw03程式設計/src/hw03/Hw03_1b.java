package hw03;

public class Hw03_1b {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {		// i由 1 ~ 5 遞增
			for (int k = 1; k <= i; k++) {	// k由 1 ~ i 遞增
				System.out.print(i);		// 印出 i 值
			}
			System.out.println();			// 換行
		}
	}

}