package hw07_3;

abstract class CPerson { // 抽象類別
	abstract void showAttack(int force); // 抽象方法
}

class CSpider extends CPerson { // Spider類別繼承Person抽象類別
	public void showAttack(int force) {
		System.out.println("蜘蛛人的攻擊力：" + force);
		System.out.println("攻擊方式會發射蜘蛛網！\n");
	}
}

class CSuperMan extends CPerson { // SuperMain類別繼承Person抽象類別
	public void showAttack(int force) {
		System.out.println("超人的攻擊力：" + force);
		System.out.println("攻擊方式使用拳頭！\n");
	}
}

public class Hw07_3 {
	public static void main(String[] args) {
		CPerson pflag; // 宣告CPerson類別的參考變數pflag
		CSpider Bill = new CSpider(); // 產生CSpider類別的物件Bill
		CSuperMan clark = new CSuperMan(); // 產生CSuperMan類別的clark
		pflag = Bill; // pflag參考變數指到Bill物件
		pflag.showAttack(60); // 執行CSpider類別的showAttack()方法
		pflag = clark; // pflag參考變數指到clark物件
		pflag.showAttack(100); // 執行CSuperMan類別的showAttack()方法
	}
}