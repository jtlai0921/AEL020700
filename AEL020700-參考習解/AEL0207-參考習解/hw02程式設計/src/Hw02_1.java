import java.util.Scanner;

public class Hw02_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�Ӿ�ơG");
		int num1 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��num1����ܼ�
		System.out.print("�п�J�ĤG�Ӿ�ơG");
		int num2 = scn.nextInt(); // Ū�J�@�Ӿ�ƨë��w��num2����ܼ�
		// �Ĥ@��%d��num1�A�ĤG��%d��num2�A�]��num1 > num2�O���L�ȩҥH�ϥ�%b
		System.out.printf("%d > %d = %b%n", num1, num2, num1 > num2);
		scn.close();
	}
}
