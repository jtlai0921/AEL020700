package hw10_4;

class Teacher extends Thread {
	College college; // 宣告College物件
	int score; // 宣告整數score記錄加扣分數

	public Teacher(College c, int s) { // 建構子
		this.college = c; // 設定college屬性值
		this.score = s; // 設定score屬性值
	}

	public void run() {
		college.setScore(score); // 呼叫college類別的setScore方法
	}
}

class College {
	int totalScore; // totalScore屬性記錄學院目前總分

	public College(int s) { // 建構子
		this.totalScore = s; // 設定totalScore屬性值
	}

	public synchronized void setScore(int s) {
		int t_score;	//目前總分
		t_score = this.totalScore;
		System.out.println("葛來分多學院目前總分 ： " + t_score+ "分 ");
		if (s >= 0) {
			System.out.println("葛來分多加分： " + s+ "分 ");
		} else {
			System.out.println("葛來分多扣分： " + s+ "分 ");
		}
		System.out.println("分數紀錄中 .....");
		try {// 模擬記錄分數的時間
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t_score += s; // 計算加扣分後的總分
		if (t_score > 0) {	//若加扣分後的總分>0
			System.out.println("葛來分多學院分數計算後： " + t_score + "分\n");
			this.totalScore = t_score; // 設定totalScore屬性值
		} else {
			this.totalScore = 0; // 設定totalScore屬性值歸零
			System.out.println("葛來分多學院分數到底了！ " + totalScore + "分\n" );
		}
	}
}

public class Hw10_4 {

	public static void main(String[] args) {
		College college = new College(0);		// 建立college物件並設分數為0
		Teacher t1 = new Teacher(college, 5);	// t1執行緒加 5 分
		Teacher t2 = new Teacher(college, -8);	// t2執行緒扣 8 分
		Teacher t3 = new Teacher(college, 2);	// t3執行緒加 2 分
		Teacher t4 = new Teacher(college, 10);	// t4執行緒加 10 分		
		t1.start(); // t1執行緒啟動
		t2.start(); // t2執行緒啟動
		t3.start(); // t3執行緒啟動
		t4.start(); // t4執行緒啟動
		try {
			t1.join(); // 等待t1執行緒執行完成
			t2.join(); // 等待t2執行緒執行完成
			t3.join(); // 等待t3執行緒執行完成
			t4.join(); // 等待t4執行緒執行完成
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		System.out.println("葛來分多學院最終分數： " + college.totalScore+ "分");
	}
}
