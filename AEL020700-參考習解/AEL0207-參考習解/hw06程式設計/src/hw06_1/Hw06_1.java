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
		System.out.println("��b�| = " + r + " ����");
		System.out.println("��P�� = " + cir.getPerimeter() + " ����");
		System.out.println("�ꭱ�n = " + cir.getArea() + " ���褽��");
	}
}
