import java.util.Scanner;

public class Hw02_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�Ӿ�ơG");
		int num1 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��num1����ܼ�
		System.out.print("�п�J�ĤG�Ӿ�ơG");
		int num2 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��num2����ܼ�
		// �]���D��Ƭ۰����ӡA�Ӫ��ȬO��ơA�ҥH�ϥ�(int)�j���૬�����
		System.out.printf("%d ���H %d ���Ӭ�  %d%n", num1, num2, (int) (num1 / num2));
		scn.close();
	}
}
