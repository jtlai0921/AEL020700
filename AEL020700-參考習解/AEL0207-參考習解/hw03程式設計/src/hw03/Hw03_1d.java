package hw03;

public class Hw03_1d {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // i�� 1 ~ 5 ���W
			for (int k = 5; k >= -i + 2; k--) { // k�� 5 ~ -i+2 ����
				if (k > i) // �p�G k > i
					System.out.print(" "); // �L�X�ťզr��
				else
					System.out.print(i); // �L�X i ��
			}
			System.out.println(); // ����
		}
	}

}
