package hw04;

public class Hw04_1 {

	public static void main(String[] args) {
		int[][] num = new int[9][9]; // �ŧi 9X9 ����ƤG���}�Cnum
		// ��for�_���j��ӳ]�wnum�������ȡA1X1���n�s�bnum[0][0]...9X9���n�s�bnum[8][8]��
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				num[i][j] = (i + 1) * (j + 1);
			}
		}
		// ��for�_���j�����ܤE�E���k��
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 8; j++) {
				System.out.printf("%d X %d = %2d  ", i + 1, j + 1, num[i][j]);
			}
			System.out.println(); // ����
		}
	}

}
