package running2;

public class Running2 {

	public static void main(String[] args) {
		Thread manA = new Thread(() -> {
			for (int a = 2; a <= 40; a += 2) {
				System.out.println("跑者A 共跑了 " + a + " 公里");
			}
			System.out.println("跑者A 抵達終點!");
		});
		Thread manB = new Thread(() -> {
			for (int b = 4; b <= 40; b += 4) {
				if (Math.random() > 0.5) {
					System.out.println("跑者B 減速中 ");
					b -= 3; // 使跑者B減速
				}
				System.out.println("跑者B 共跑了 " + b + " 公里");
			}
			System.out.println("跑者B 抵達終點!");
		});
		manA.start();
		manB.start();
	}

}
