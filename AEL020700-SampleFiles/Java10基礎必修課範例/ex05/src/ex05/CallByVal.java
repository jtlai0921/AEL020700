package ex05;

public class CallByVal {

	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println(" �ǭȩI�s�e\t a = " + a + "\t b = " + b);
		byVal(a, b);
		System.out.println(" �ǭȩI�s��\t a = " + a + "\t b = " + b);
	}

	static void byVal(int x, int y) {
		int t; // �H�ܼ�t�@���Ȧs�ϡA�N�޼Ƥ���
		t = x;
		x = y;
		y = t;
		System.out.println(" �ǭȩI�s��\t x = " + x + "\t y =" + y);
	}
}