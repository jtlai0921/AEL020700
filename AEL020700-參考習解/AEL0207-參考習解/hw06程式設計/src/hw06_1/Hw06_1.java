package hw06_1;

class Circle {
	private int radius;

	public Circle(int r) {
		radius = r;
	}
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Hw06_1 {
	public static void main(String[] args) {
		int r = 10;
		Circle cir = new Circle(r);
		System.out.println("圓半徑 = " + r + " 公分");
		System.out.println("圓周長 = " + cir.getPerimeter() + " 公分");
		System.out.println("圓面積 = " + cir.getArea() + " 平方公分");
	}
}
