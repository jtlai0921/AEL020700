package hw10_5;

class Dinner { // 在Dinner類別中設定餐廳物件的屬性和方法
	private boolean isCook = false; // 記錄是否煮好晚餐，false=未煮好

	public synchronized void cook(int cNo) { // 烹飪的方法
		while (isCook) { // 當isCook為true就不斷執行
			try {
				wait(); // 主廚進入等待狀態
			} catch (InterruptedException e) {
			}
		}
		System.out.println("煮好第 " + cNo + "份點餐");
		isCook = true; // 設為煮好晚餐
		notify(); // 呼叫服務生來烹飪
	}

	public synchronized void server(int sNo) { // 上菜的方法
		while (!isCook) { // 當isCook為false就不斷執行
			try {
				wait(); // 服務生進入等待狀態
			} catch (InterruptedException e) {
			}
		}
		System.out.println("送出第 " + sNo + "份點餐");
		isCook = false; // 設為未煮好晚餐
		notify(); // 呼叫主廚可接受點餐
	}
}

class CookDinner implements Runnable { // CookDinner類別實作Runnable介面
	Dinner dinner; // 建立Dinner類別物件dinner

	CookDinner(Dinner d) { // 建構子
		this.dinner = d;
	}

	public void run() { // 在run()方法中執行煮晚餐10次
		for (int i = 1; i <= 10; i++) {
			dinner.cook(i);
		}
	}
}

class ServerDinner implements Runnable { // ServerDinner類別實作Runnable介面
	Dinner dinner; // 建立Dinner類別物件dinner

	ServerDinner(Dinner d) { // 建構子
		this.dinner = d;
	}

	public void run() { // 在run()方法中執行上菜10次
		for (int i = 1; i <= 10; i++) {
			dinner.server(i);
		}
	}
}

public class Hw10_5 {

	public static void main(String[] args) {
		Dinner dinner = new Dinner(); // 建立Dinner類別物件dinner
		Thread chef = new Thread(new CookDinner(dinner));
		Thread waiter = new Thread(new ServerDinner(dinner));
		chef.start(); // 啟動chef執行緒執行主廚烹煮晚餐
		waiter.start(); // 啟動waiter執行緒執行服務生上菜
	}

}
