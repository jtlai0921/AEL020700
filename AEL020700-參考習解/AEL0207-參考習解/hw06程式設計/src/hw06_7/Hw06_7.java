package hw06_7;

class MakeRnd {
	public int[] GetRnd(int num, int min, int max) {
		if (num > max - min + 1) {
			System.out.println("錯誤：存放數目超過範圍！");
			System.exit(0);
		}

		int[] data = new int[num];
		int temp, n = 0;
		boolean is_repeat;

		do {
			is_repeat = false;
			temp = (int) (Math.random() * (max - min + 1)) + min;
			for (int k = 0; k < n; k++)
				if (data[k] == temp)
					is_repeat = true;
			if (!is_repeat) {
				data[n] = temp;
				n++;
			}
		} while (n < num);
		return data;
	}
}

public class Hw06_7 {
	public static void main(String[] args) {
		MakeRnd rnd = new MakeRnd();
		int r_num = 5, min = 10, max = 20;
		int[] data = rnd.GetRnd(r_num, min, max);

		for (int i = 1; i <= r_num; i++)
			System.out.println("第" + i + "個亂數：" + data[i - 1]);
	}
}
