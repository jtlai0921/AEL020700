package hw05;

public class Hw05_1 {
	// getRnd�R�A��k�i�ΨӨ��on~m������num�ӶüơA�öǵ��ҳ]�w���}�C
	static void getRnd(int[] vArray, int min, int max, int num) {
		int max_dim, rem_num, choice;
		max_dim = max - min + 1;
		int[] t = new int[max_dim];
		for (int i = 0; i <= max_dim - 1; i++) {
			t[i] = min + i;
		}
		rem_num = max_dim;
		for (int i = 0; i <= num - 1; i++) {
			choice = (int) (Math.random() * rem_num);
			vArray[i] = t[choice];
			for (int j = choice; j < rem_num - 1; j++) {
				t[j] = t[j + 1];
			}
			rem_num--;
		}
	}

	public static void main(String[] args) {
		int[] lot = new int[4];
		getRnd(lot, 1, 9, 4); // �I�s�R�A��kgetRnd
		System.out.println("�����|�P�m�}�����X�p�U�G");
		for (int i = 0; i < lot.length; i++)
			System.out.print("  " + lot[i]);
	}

}
