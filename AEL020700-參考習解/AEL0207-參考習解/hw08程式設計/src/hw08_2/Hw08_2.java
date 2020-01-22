package hw08_2;

class BankException extends Exception {
	public void showMessage() {         // showMessage()��k�O�۩w����k
		System.out.println("�b���]�w���~!");
	}
}

class Bank {
	String accno, name;
	long account;

	void setAcc(String cno, String cname, long m) throws BankException {
		System.out.println("�]�w " + cname + " ���b��!");
		if (m < 0) {
			throw new BankException(); // �ߥXBankException�۩w�ҥ~���O���������
		} else {
			accno = cno;
			name = cname;
			account = m;
		}
	}

	void showData() {
		System.out.println("�b��s���G " + accno);
		System.out.println("�Ȥ�m�W�G " + name);
		System.out.println("�b��l�B�G " + account + "\n");
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
			Lung.showData();  //���椣�|����
		} catch (BankException e) {
			e.showMessage();
		}
	}
}
