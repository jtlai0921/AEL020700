package hw06_4;

class Cstudent {
	// num靜態成員用private宣告，表示只能在自身類別使用，
	private static int num; // num用來計算使用Cstudent類別建立物件的個數
	public int weight, height;

	public Cstudent() {
		num++; // num靜態成員加1
	}

	public Cstudent(int w, int h) {
		num++; // num靜態成員加1
		weight = w;
		height = h;
	}

	public static void getObjectNum() { // getObjectNum靜態成員
		System.out.println(">> 目前使用Cstudent類別產生了 " + num + " 個物件實體\n");
	}
}

public class Hw06_4 { // 主類別
	public static void main(String[] args) { // 主程式
		Cstudent Peter = new Cstudent();
		Peter.weight = 65;
		Peter.height = 165;
		System.out.println("Peter體重=" + Peter.weight + " , 身高=" + Peter.height);
		Cstudent.getObjectNum(); // Cstudent類別呼叫getObjectNum靜態成員
		Cstudent David = new Cstudent(58, 170);
		System.out.println("David體重=" + David.weight + " , 身高=" + David.height);
		David.getObjectNum(); // 物件呼叫getObjectNum靜態成員
	}
}