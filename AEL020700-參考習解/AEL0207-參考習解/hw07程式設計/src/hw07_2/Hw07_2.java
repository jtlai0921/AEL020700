package hw07_2;

import java.util.Scanner;

abstract class Player {
	abstract void Show();
}

class CD extends Player {
	public void Show() {
		System.out.println("�{�b���񪺬O�uCD���֡v");
	}
}

class DVD extends Player {
	public void Show() {
		System.out.println("�{�b���񪺬O�uDVD�v���v");
	}
}

public class Hw07_2 {
	public static void main(String[] args) {
		Player p;
		CD p1 = new CD();
		DVD p2 = new DVD();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("�п�J CD �� DVD �H ");
			String item = scn.nextLine();
			if (item.equals("CD") || item.equals("cd"))
				p = p1;
			else if (item.equals("DVD") || item.equals("dvd"))
				p = p2;
			else
				continue;	
			p.Show();
			break;
		}	
	}
}
