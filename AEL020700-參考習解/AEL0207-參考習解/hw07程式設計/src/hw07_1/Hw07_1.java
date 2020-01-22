package hw07_1;

import java.util.Scanner;

interface IPass {
	int S1 = 60;
	int S2 = 70;

	String pass(int score);
}

class Collage implements IPass {
	int score;
	String title = "大學成績： ";

	public String pass(int score) {
		if (score >= S1)
			return "及格";
		else
			return "不及格";
	}
}

class Graduate implements IPass {
	int score;
	String title = "研究所成績： ";

	public String pass(int score) {
		if (score >= S2)
			return "及格";
		else
			return "不及格";
	}
}

public class Hw07_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入學期分數： ");
		int score = scn.nextInt();
		
		Collage col = new Collage();
		System.out.println(col.title + col.pass(score));
		
		Graduate gra = new Graduate();
		System.out.println(gra.title + gra.pass(score));
	}
}