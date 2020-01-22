package hw08_2;

class BankException extends Exception {
	public void showMessage() {         // showMessage()方法是自定的方法
		System.out.println("帳號設定錯誤!");
	}
}

class Bank {
	String accno, name;
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

public class Hw08_2 {
	public static void main(String[] args) {
		try {
			Bank Jack=new Bank();
			Jack.setAcc("A0001","Jack",40000);
			Jack.showData();
			Bank Lung=new Bank();
			Lung.setAcc("B0001","Lung",-50000);
			Lung.showData();  //此行不會執行
		} catch (BankException e) {
			e.showMessage();
		}
	}
}
