package hw03;

public class Hw03_1a {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) { // i由 5 ~ 1 遞減
			for (int k = 1; k <= i; k++) { // k由 1 ~ i 遞增
				System.out.print(k); // 印出 k 值
			}
			System.out.println(); // 換行
		}
	}
}