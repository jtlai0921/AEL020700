package hw10_3;

class Runner implements Runnable { // 實作Runnable介面
	public int totalSteps; // totalSteps屬性總跑步距離

	public void run() { // 覆寫run()方法
		try {
			for (int i = 1; i <= 10; i++) { // 執行10次
				int steps = (int) ((Math.random() * 9) + 1); // 隨機產生1~10的亂數
				totalSteps += steps; // 紀錄總跑步距離
				System.out.println(Thread.currentThread().getName() + "跑 "
						+ totalSteps + "公尺 ( " + i + " 秒)"); // 印出執行緒的總跑步距離
				Thread.sleep(1000); // 執行緒暫停1秒
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
		Thread runner1 = new Thread(r1, "一號選手");
		Thread runner2 = new Thread(r2, "二號選手");
		runner1.start(); // runner1執行緒啟動
		runner2.start(); // runner2執行緒啟動
		try { // 加入runner1、runner2執行緒讓主執行緒暫停
			runner1.join();
			runner2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (r1.totalSteps > r2.totalSteps) { // 若r1的totalSteps > r2則一號選手獲勝
			System.out.println("一號選手獲勝");
		} else {
			System.out.println("二號選手獲勝");
		}
	}

}
