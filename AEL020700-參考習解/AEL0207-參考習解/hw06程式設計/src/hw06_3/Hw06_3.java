package hw06_3;

class Cmath {
	public int getMax(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public int getMax(int[] vArray) {
		int n = vArray[0];
		for (int i = 1; i < vArray.length; i++) {
			if (vArray[i] > n)
				n = vArray[i];
		}
		return n;
	}
}

public class Hw06_3 {
	public static void main(String[] args) { // 祘Α
		Cmath max1 = new Cmath();
		System.out.println("10 ㎝ 20 程计" + max1.getMax(10, 20));
		int[] ary = new int[] { 52, 66, 78, 99, 11 };
		System.out.println("{52,66,78,99,11} 皚い程计" + max1.getMax(ary));
	}
}
