import java.util.Scanner;

public class Hw02_4 {
	public static void main(String[] args) {
		final int PASS = 60;
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��Ӧ��Z(�����Ϊťլ۹j)�G");
		int score = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��score����ܼ�
		System.out.printf("�Ĥ@�Ӧ��Z��%4d,�ή���Ƭ�%4d,�O�_�ή�G%b%n", score, PASS, score >= PASS);
		score = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��score����ܼ�
		System.out.printf("�Ĥ@�Ӧ��Z��%4d,�ή���Ƭ�%4d,�O�_�ή�G%b%n", score, PASS, score >= PASS);
		scn.close();
	}
}