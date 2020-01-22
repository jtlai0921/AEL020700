package hw07_1;

import java.util.Scanner;

interface IPass {
	int S1 = 60;
	int S2 = 70;

	String pass(int score);
}

class Collage implements IPass {
	int score;
	String title = "�j�Ǧ��Z�G ";

	public String pass(int score) {
		if (score >= S1)
			return "�ή�";
		else
			return "���ή�";
	}
}

class Graduate implements IPass {
	int score;
	String title = "��s�Ҧ��Z�G ";

	public String pass(int score) {
		if (score >= S2)
			return "�ή�";
		else
			return "���ή�";
	}
}

public class Hw07_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("��J�Ǵ����ơG ");
		int score = scn.nextInt();
		
		Collage col = new Collage();
		System.out.println(col.title + col.pass(score));
		
		Graduate gra = new Graduate();
		System.out.println(gra.title + gra.pass(score));
	}
}