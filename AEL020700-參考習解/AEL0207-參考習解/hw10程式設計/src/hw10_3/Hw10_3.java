package hw10_3;

class Runner implements Runnable { // ��@Runnable����
	public int totalSteps; // totalSteps�ݩ��`�]�B�Z��

	public void run() { // �мgrun()��k
		try {
			for (int i = 1; i <= 10; i++) { // ����10��
				int steps = (int) ((Math.random() * 9) + 1); // �H������1~10���ü�
				totalSteps += steps; // �����`�]�B�Z��
				System.out.println(Thread.currentThread().getName() + "�] "
						+ totalSteps + "���� ( " + i + " ��)"); // �L�X��������`�]�B�Z��
				Thread.sleep(1000); // ������Ȱ�1��
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Hw10_3 {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		Runner r2 = new Runner();
		Thread runner1 = new Thread(r1, "�@�����");
		Thread runner2 = new Thread(r2, "�G�����");
		runner1.start(); // runner1������Ұ�
		runner2.start(); // runner2������Ұ�
		try { // �[�Jrunner1�Brunner2��������D������Ȱ�
			runner1.join();
			runner2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (r1.totalSteps > r2.totalSteps) { // �Yr1��totalSteps > r2�h�@��������
			System.out.println("�@��������");
		} else {
			System.out.println("�G��������");
		}
	}

}
