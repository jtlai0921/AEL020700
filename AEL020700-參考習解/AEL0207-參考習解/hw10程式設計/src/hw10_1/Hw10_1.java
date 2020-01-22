package hw10_1;

class MyThread extends Thread {// 繼承Thread類別
	private int sleepTime; // sleepTime屬性為暫停秒數
	private char printChart; // printChart屬性為列印字元

	MyThread(int s, char c) { // 建構式傳入暫停秒數和列印字元
		this.sleepTime = s * 1000; // 秒數轉換成毫秒
		this.printChart = c;
		// start(); // 啟動執行緒
	}

	public void run() { // 覆寫run()方法
		try {
			for (int i = 1; i <= 10; i++) { // 執行10次
				System.out.print(this.printChart); // 印出字元
				Thread.sleep(this.sleepTime); // 執行緒暫停
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Hw10_1 {

	public static void main(String[] args) {
		MyThread obT1 = new MyThread(1, 'A'); // 建立obT1執行緒傳入1秒和A字元參數
		MyThread obT2 = new MyThread(2, 'B'); // 建立obT2執行緒傳入2秒和B字元參數
		MyThread obT3 = new MyThread(3, 'C'); // 建立obT3執行緒傳入3秒和C字元參數
		obT1.start(); // 啟動obT1執行緒
		obT2.start(); // 啟動obT2執行緒
		obT3.start(); // 啟動obT3執行緒
	}

}
