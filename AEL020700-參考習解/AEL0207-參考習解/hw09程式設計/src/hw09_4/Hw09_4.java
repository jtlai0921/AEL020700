package hw09_4;

import java.util.*;

public class Hw09_4 {
	public static void main(String[] args) {
		System.out.println("��ƫظm��......");
		ArrayList<String> alist = new ArrayList<>();
		int order = 1;
		String st;
		Scanner keyin = new Scanner(System.in);
		System.out.println("�̧ǿ�J5�Ӫ��^��m�W....\n");
		while (order <= 5) {
			System.out.print("�� " + order + " �өm�W�H ");
			st = keyin.nextLine();
			if (alist.add(st))
				order++;
		}

		LinkedList<String> queue = new LinkedList<>(alist);
		System.out.println("\n���X�覡(��C)�G���i���X");
		for (int j = queue.size() - 1; j >= 0; j--) {
			System.out.print(queue.getFirst() + "  ");
			queue.removeFirst();
		}
		System.out.println();

		LinkedList<String> stack = new LinkedList<>(alist);
		System.out.println("\n���X�覡(���|)�G��i���X");
		while (true) {
			System.out.print(stack.removeLast() + "  ");
			if (stack.isEmpty())
				break;
		}
		System.out.println("");
		keyin.close();
	}
}
