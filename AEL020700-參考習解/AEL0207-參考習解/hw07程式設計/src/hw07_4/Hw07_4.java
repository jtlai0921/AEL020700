package hw07_4;

interface  CPerson { 
	void showAttack(int force); 
}

class CSpider implements CPerson { 
	public void showAttack(int force) {
		System.out.println("�j��H�������O�G" + force);
		System.out.println("�����覡�|�o�g�j����I\n");
	}
}

class CSuperMan implements CPerson { // SuperMain���O�~��Person��H���O
	public void showAttack(int force) {
		System.out.println("�W�H�������O�G" + force);
		System.out.println("�����覡�ϥή��Y�I\n");
	}
}

public class Hw07_4 {
	public static void main(String[] args) {
		CPerson pflag; // �ŧiCPerson���O���Ѧ��ܼ�pflag
		CSpider Bill = new CSpider(); // ����CSpider���O������Bill
		CSuperMan clark = new CSuperMan(); // ����CSuperMan���O��clark
		pflag = Bill; // pflag�Ѧ��ܼƫ���Bill����
		pflag.showAttack(60); // ����CSpider���O��showAttack()��k
		pflag = clark; // pflag�Ѧ��ܼƫ���clark����
		pflag.showAttack(100); // ����CSuperMan���O��showAttack()��k
	}
}