package hw05;

public class Hw05_4 {

	public static void main(String[] args) {
		int sum = 0;	//
		//�v�@Ū��args�}�C����������
		for (int i = 0; i < args.length; i++) {
			System.out.printf("�� %d ��P�Ǫ����ơG %s %n", i + 1, args[i]);
			//�N�r��}�C���������૬����ƫ�A�[��sum��
			sum += Integer.parseInt(args[i]);	
		}
		System.out.println("�`���G " + sum);
	}

}