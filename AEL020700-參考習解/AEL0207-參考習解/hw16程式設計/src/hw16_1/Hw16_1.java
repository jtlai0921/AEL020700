package hw16_1;
import java.util.*; //�ϥ�Comparator�����ޥΦ��R�W�Ŷ�

//�ǥ����O
class Student{
	private String name;	//�m�W
	private int chi;		//���	
	private int eng;		//�^��
	private int math;		//�ƾ�
	public Student(String _name, int _chi, int _eng, int _math){
		name =_name; chi=_chi; eng=_eng; math=_math;
	}
	//getTotal()��k�i���o��B�^�B�ƤT���`��
	public int getTotal(){
		return (chi+eng+math);
	}
	//��ܾǥͪ���m�W�H�ΰ�B�^�B�ƩM�T���`��
	public void show(){
		System.out.print(name + "  " + chi+ "  " + eng+ "  " + math + "  " + getTotal() + "  ");
	}
}

public class Hw16_1 {

	public static void main(String[] args){
		//�إ�stu[0]~stu[3]��Student����}�C
		Student[] stu = new Student[]{
			new Student("���p��", 54,77,92),
			new Student("���p��", 88,27,88),
			new Student("�i�j��", 83,77,99),
			new Student("���p�j", 66,44,72),
			new Student("�B�p�j", 26,44,92)	
		};
		//Arrays.sort�ĤG�ӰѼƫإ�Comparator�ΦW��������
		//�ù�@Comparator������compare��k�ΨӤ��Studnet�����B�^�B�ƤT���`��
		Arrays.sort(stu, (o1,o2)->{
				int a, b, r=1;
				a = o1.getTotal();
				b = o2.getTotal();		
				if (a>b){
					r = 1;
				}else if (a==b){
					r = 0;
				}else if(a<b){
					r = -1;
				}
				return r;
			}
		);
		System.out.println("  �m�W  ���  �^��  �ƾ�  �`��  �W��");
		System.out.println("============================");
		for (int i=stu.length-1, k=1; i>=0; i--, k++){
				stu[i].show();
				System.out.println(k);
		}
		
	}

}
