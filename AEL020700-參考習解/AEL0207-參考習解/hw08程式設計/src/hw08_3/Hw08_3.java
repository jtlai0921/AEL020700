package hw08_3;

class BankException extends Exception { // BankException繼承Exception
	public String toString() { // 覆寫Throwable類別的toString()方法
		return "發生BankException類別的例外!";
	}

	public String getMessage() { // 覆寫Throwable類別的getMessage()方法
		return "帳戶餘額不可以數負數!";
	}

	public void showMessage() { // showMessage()方法是自定的方法
		System.out.println("設定帳號請小心，發生例外了!");
	}
}

class Bank {
	String accno;
	String name;
	long account;

	void setAcc(String cno, String cname, long m) throws BankException {
		System.out.println("設定 " + cname + " 的帳戶!");
		if (m < 0) {
			throw new BankException(); // 拋出BankException自定例外類別的物件實體
		} else {
			accno = cno;
			name = cname;
			account = m;
		}
	}

	void showData() {
		System.out.println("帳戶編號： " + accno);
		System.out.println("客戶姓名： " + name);
		System.out.println("帳戶餘額： " + account + "\n");
	}
}

public class Hw08_3 {
	public static void main(String[] args) {
		try {
			Bank Jack = new Bank();
			Jack.setAcc("A0001", "Jack", 40000);
			Jack.showData();
			Bank Lung = new Bank();
			Lung.setAcc("B0001", "Lung", -50000);
			Lung.showData(); // 此行不會執行
		} catch (BankException e) { // 補捉自行定義的BankException類別例外
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.showMessage();
		}
	}
}
