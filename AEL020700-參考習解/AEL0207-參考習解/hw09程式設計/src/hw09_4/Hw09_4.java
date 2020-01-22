package hw09_4;

import java.util.*;

public class Hw09_4 {
	public static void main(String[] args) {
		System.out.println("資料建置中......");
		ArrayList<String> alist = new ArrayList<>();
		int order = 1;
		String st;
		Scanner keyin = new Scanner(System.in);
		System.out.println("依序輸入5個的英文姓名....\n");
		while (order <= 5) {
			System.out.print("第 " + order + " 個姓名？ ");
			st = keyin.nextLine();
			if (alist.add(st))
				order++;
		}

		LinkedList<String> queue = new LinkedList<>(alist);
		System.out.println("\n取出方式(佇列)：先進先出");
		for (int j = queue.size() - 1; j >= 0; j--) {
			System.out.print(queue.getFirst() + "  ");
			queue.removeFirst();
		}
		System.out.println();

		LinkedList<String> stack = new LinkedList<>(alist);
		System.out.println("\n取出方式(堆疊)：後進先出");
		while (true) {
			System.out.print(stack.removeLast() + "  ");
			if (stack.isEmpty())
				break;
		}
		System.out.println("");
		keyin.close();
	}
}
