package running;

public class Running {

	public static void main(String[] args) {
		Thread manA = new Thread() {
			public void run() {
				for (int a = 2; a <= 40; a += 2) {
					System.out.println("�]��A �@�]�F " + a + " ����");
				}
				System.out.println("�]��A ��F���I!");
			}
		};
		Thread manB = new Thread() {
			public void run() {
				for (int b = 4; b <= 40; b += 4) {
					if (Math.random() > 0.5) {
						System.out.println("�]��B ��t�� ");
						b -= 3; // �϶]��B��t
					}
					System.out.println("�]��B �@�]�F " + b + " ����");
				}
				System.out.println("�]��B ��F���I!");
			}
		};
		manA.start();
		manB.start();
	}
}