package talk2;

class ThreadB extends Thread {
	String str;
	int m;

	ThreadB(String a, int s) { // ThreadB���O���غc��
		str = a; // �]str������w���r��
		m = s; // �]m������w�����j�ɶ�
		start(); // �I�s�غc���ɡA�����Ұʰ����
	}

	public void run() { // �мgThread���O��run��k
		try {
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				sleep(m); // �Ȱ������
			}
		} catch (InterruptedException e) {
			System.out.println("���ͨҥ~.....!");
		}
	}
}

public class Talk2 {

	public static void main(String[] args) {
		String str1 = "HELLO,WORLD";
		String str2 = "javase10";
		ThreadB obT1 = new ThreadB(str1, 200); // �إ�obT1������ǤJ��str1�M200
		ThreadB obT2 = new ThreadB(str2, 500); // �إ�obT2������ǤJ��str2�M500
	}

}