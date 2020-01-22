package hw06_2;

class Average {
	private int num1, num2;
	private double avg;

	public void SetValue(int x, int y) {
		num1 = x;
		num2 = y;
		avg =(double)(num1 + num2)/2;
	}

	int getNum1() {
		return num1;
	}
	int getNum2() {
		return num2;
	}
	double getAvg() {
		return avg;
	}
}

public class Hw06_2 {
	public static void main(String[] args) {
		Average cal = new Average();
		cal.SetValue(15, 12);
		System.out.println("cal物件的 num1 = " + cal.getNum1());
		System.out.println("cal物件的 num2 = " + cal.getNum2());
		System.out.println("cal物件的 avg = " + cal.getAvg());
	}
}
