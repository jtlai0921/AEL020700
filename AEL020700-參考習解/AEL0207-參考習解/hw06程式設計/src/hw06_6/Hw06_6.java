package hw06_6;

class Ball {
	private int radius;
	private double volume, area;

	public Ball(int r) {
		radius = r;
		CalVolume();
		CalArea();
	}

	private void CalVolume() {
		volume = (4.0 / 3) * 3.1416 * Math.pow(radius, 3);
	}

	private void CalArea() {
		area = 4 * 3.1416 * Math.pow(radius, 2);
	}

	public double GetArea() {
		return area;
	}

	double GetVolume() {
		return volume;
	}
}

public class Hw06_6 {
	public static void main(String[] args) {
		int radius = 10;
		Ball ball = new Ball(radius);
		System.out.println("球半徑 = " + radius);
		System.out.println("球體積 = " + ball.GetVolume());
		System.out.println("球表面積 = " + ball.GetArea());
	}
}
