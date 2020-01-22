package hw10_4;

class Teacher extends Thread {
	College college; // �ŧiCollege����
	int score; // �ŧi���score�O���[������

	public Teacher(College c, int s) { // �غc�l
		this.college = c; // �]�wcollege�ݩʭ�
		this.score = s; // �]�wscore�ݩʭ�
	}

	public void run() {
		college.setScore(score); // �I�scollege���O��setScore��k
	}
}

class College {
	int totalScore; // totalScore�ݩʰO���ǰ|�ثe�`��

	public College(int s) { // �غc�l
		this.totalScore = s; // �]�wtotalScore�ݩʭ�
	}

	public synchronized void setScore(int s) {
		int t_score;	//�ثe�`��
		t_score = this.totalScore;
		System.out.println("���Ӥ��h�ǰ|�ثe�`�� �G " + t_score+ "�� ");
		if (s >= 0) {
			System.out.println("���Ӥ��h�[���G " + s+ "�� ");
		} else {
			System.out.println("���Ӥ��h�����G " + s+ "�� ");
		}
		System.out.println("���Ƭ����� .....");
		try {// �����O�����ƪ��ɶ�
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t_score += s; // �p��[�����᪺�`��
		if (t_score > 0) {	//�Y�[�����᪺�`��>0
			System.out.println("���Ӥ��h�ǰ|���ƭp���G " + t_score + "��\n");
			this.totalScore = t_score; // �]�wtotalScore�ݩʭ�
		} else {
			this.totalScore = 0; // �]�wtotalScore�ݩʭ��k�s
			System.out.println("���Ӥ��h�ǰ|���ƨ쩳�F�I " + totalScore + "��\n" );
		}
	}
}

public class Hw10_4 {

	public static void main(String[] args) {
		College college = new College(0);		// �إ�college����ó]���Ƭ�0
		Teacher t1 = new Teacher(college, 5);	// t1������[ 5 ��
		Teacher t2 = new Teacher(college, -8);	// t2������� 8 ��
		Teacher t3 = new Teacher(college, 2);	// t3������[ 2 ��
		Teacher t4 = new Teacher(college, 10);	// t4������[ 10 ��		
		t1.start(); // t1������Ұ�
		t2.start(); // t2������Ұ�
		t3.start(); // t3������Ұ�
		t4.start(); // t4������Ұ�
		try {
			t1.join(); // ����t1��������槹��
			t2.join(); // ����t2��������槹��
			t3.join(); // ����t3��������槹��
			t4.join(); // ����t4��������槹��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		System.out.println("���Ӥ��h�ǰ|�̲פ��ơG " + college.totalScore+ "��");
	}
}
