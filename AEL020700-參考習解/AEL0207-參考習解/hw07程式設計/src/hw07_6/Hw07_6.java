package hw07_6;

import java.util.Scanner;

abstract class Share {
	abstract double area();
}

class Circle extends Share {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public double area() {
		return 3.14 * this.radius * this.radius;
	}
}

class Triangle extends Share {
	private double high;
	private double base;

	public Triangle(double h, double b) {
		this.high = h;
		this.base = b;
	}

	public double area() {
		return (this.high * this.base) / 2;
	}
}

class Rectangle extends Share {
	private double len;
	private double wide;

	public Rectangle(double l, double w) {
		this.len = l;
		this.wide = w;
	}

	public double area() {
		return this.len * this.wide;
	}
}

class CalArea {
	private static double totArea;

	public CalArea(Share S) {
		totArea += S.area();
		System.out.printf("  ���Ϊ����n��%.1f,�ثe�֭p���n��%.1f", S.area(), totArea);
	}
}

public class Hw07_6 {
	public static void main(String[] args) {
		CalArea cal;
		Circle cir;
		Triangle tri;
		Rectangle rec;

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("�п�ܭn�֭p���Ϊ��G(1.���  2.�T����  3.�x�Ρ@4.���}) �H ");
			int item = scn.nextInt();
			if (item == 1) {
				System.out.print("  ��J��Υb�| �H ");
				double radius = scn.nextDouble();
				cir = new Circle(radius);
				cal = new CalArea(cir);
			} else if (item == 2) {
				System.out.print("  ��J�T���ΰ��� �H ");
				double high = scn.nextDouble();
				System.out.print("  ��J�T���Ω��� �H ");
				double base = scn.nextDouble();
				tri = new Triangle(high, base);
				cal = new CalArea(tri);
			} else if (item == 3) {
				System.out.print("  ��J�x�Ϊ��� �H ");
				double len = scn.nextDouble();
				System.out.print("  ��J�x�μe�� �H ");
				double wide = scn.nextDouble();
				rec = new Rectangle(len, wide);
				cal = new CalArea(rec);
			} else {
				scn.close();
				break;
			}
			System.out.println();
		}
	}
}
