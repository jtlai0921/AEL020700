package hw03;

public class Hw03_1c {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // i由 1 ~ 5 遞增
			for (int k = 5; k >= 1; k--) { // k由 5 ~ 1 遞減
				if (k > i) // 如果 k > i
					System.out.print(" "); // 印出空白字元
				else
					System.out.print(i); // 印出 i 值
			}
			System.out.println(); // 換行
		}
	}

}
