import java.util.Scanner;

public class Hw02_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�p�����Z�G");
		int score1 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��score1����ܼ�
		System.out.print("�п�JJava���Z�G");
		int score2 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��score2����ܼ�
		System.out.print("�п�J�q�l�Ǧ��Z�G");
		int score3 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��score3����ܼ�
		// %f����ܯB�I�ơA6��w�d6�ӪŦ�A�]���̦h��100.00�A.2����ܨ�p�ƲĤG��
		// �]��score1~score3���O��ơA�ҥH�ϥ�(float)�j���૬���B�I��
		System.out.printf("��������  =%6.2f%n", (float) (score1 + score2 + score3) / 3);
		scn.close();
	}
}
