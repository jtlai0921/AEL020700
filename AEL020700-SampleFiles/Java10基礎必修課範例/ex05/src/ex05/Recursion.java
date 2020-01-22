package ex05;

public class Recursion {

	static int factorial(int n) {
		if (n == 1)
			return n;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("6! = " + factorial(6));
		System.out.println("9! = " + factorial(9));
	}

}