package hw07_3;

abstract class CPerson { // ��H���O
	abstract void showAttack(int force); // ��H��k
}

class CSpider extends CPerson { // Spider���O�~��Person��H���O
	public void showAttack(int force) {
		System.out.println("�j��H�������O�G" + force);
		System.out.println("�����覡�|�o�g�j����I\n");
	}
}

class CSuperMan extends CPerson { // SuperMain���O�~��Person��H���O
	public void showAttack(int force) {
		System.out.println("�W�H�������O�G" + force);
		System.out.println("�����覡�ϥή��Y�I\n");
	}
}

public class Hw07_3 {
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