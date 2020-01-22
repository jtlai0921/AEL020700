package hw10_1;

class MyThread extends Thread {// �~��Thread���O
	private int sleepTime; // sleepTime�ݩʬ��Ȱ����
	private char printChart; // printChart�ݩʬ��C�L�r��

	MyThread(int s, char c) { // �غc���ǤJ�Ȱ���ƩM�C�L�r��
		this.sleepTime = s * 1000; // ����ഫ���@��
		this.printChart = c;
		// start(); // �Ұʰ����
	}

	public void run() { // �мgrun()��k
		try {
			for (int i = 1; i <= 10; i++) { // ����10��
				System.out.print(this.printChart); // �L�X�r��
				Thread.sleep(this.sleepTime); // ������Ȱ�
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Hw10_1 {

	public static void main(String[] args) {
		MyThread obT1 = new MyThread(1, 'A'); // �إ�obT1������ǤJ1��MA�r���Ѽ�
		MyThread obT2 = new MyThread(2, 'B'); // �إ�obT2������ǤJ2��MB�r���Ѽ�
		MyThread obT3 = new MyThread(3, 'C'); // �إ�obT3������ǤJ3��MC�r���Ѽ�
		obT1.start(); // �Ұ�obT1�����
		obT2.start(); // �Ұ�obT2�����
		obT3.start(); // �Ұ�obT3�����
	}

}
