package hw07_2;

import java.util.Scanner;

abstract class Player {
	abstract void Show();
}

class CD extends Player {
	public void Show() {
		System.out.println("現在播放的是「CD音樂」");
	}
}

class DVD extends Player {
	public void Show() {
		System.out.println("現在播放的是「DVD影片」");
	}
}

public class Hw07_2 {
	public static void main(String[] args) {
		Player p;
		CD p1 = new CD();
		DVD p2 = new DVD();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("請輸入 CD 或 DVD ？ ");
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
