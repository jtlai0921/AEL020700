package hw10_5;

class Dinner { // �bDinner���O���]�w�\�U�����ݩʩM��k
	private boolean isCook = false; // �O���O�_�N�n���\�Afalse=���N�n

	public synchronized void cook(int cNo) { // �i������k
		while (isCook) { // ��isCook��true�N���_����
			try {
				wait(); // �D�p�i�J���ݪ��A
			} catch (InterruptedException e) {
			}
		}
		System.out.println("�N�n�� " + cNo + "���I�\");
		isCook = true; // �]���N�n���\
		notify(); // �I�s�A�ȥͨӲi��
	}

	public synchronized void server(int sNo) { // �W�檺��k
		while (!isCook) { // ��isCook��false�N���_����
			try {
				wait(); // �A�ȥͶi�J���ݪ��A
			} catch (InterruptedException e) {
			}
		}
		System.out.println("�e�X�� " + sNo + "���I�\");
		isCook = false; // �]�����N�n���\
		notify(); // �I�s�D�p�i�����I�\
	}
}

class CookDinner implements Runnable { // CookDinner���O��@Runnable����
	Dinner dinner; // �إ�Dinner���O����dinner

	CookDinner(Dinner d) { // �غc�l
		this.dinner = d;
	}

	public void run() { // �brun()��k������N���\10��
		for (int i = 1; i <= 10; i++) {
			dinner.cook(i);
		}
	}
}

class ServerDinner implements Runnable { // ServerDinner���O��@Runnable����
	Dinner dinner; // �إ�Dinner���O����dinner

	ServerDinner(Dinner d) { // �غc�l
		this.dinner = d;
	}

	public void run() { // �brun()��k������W��10��
		for (int i = 1; i <= 10; i++) {
			dinner.server(i);
		}
	}
}

public class Hw10_5 {

	public static void main(String[] args) {
		Dinner dinner = new Dinner(); // �إ�Dinner���O����dinner
		Thread chef = new Thread(new CookDinner(dinner));
		Thread waiter = new Thread(new ServerDinner(dinner));
		chef.start(); // �Ұ�chef���������D�p�i�N���\
		waiter.start(); // �Ұ�waiter���������A�ȥͤW��
	}

}
