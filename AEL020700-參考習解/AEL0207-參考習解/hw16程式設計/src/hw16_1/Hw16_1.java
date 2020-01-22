package hw16_1;
import java.util.*; //使用Comparator必須引用此命名空間

//學生類別
class Student{
	private String name;	//姓名
	private int chi;		//國文	
	private int eng;		//英文
	private int math;		//數學
	public Student(String _name, int _chi, int _eng, int _math){
		name =_name; chi=_chi; eng=_eng; math=_math;
	}
	//getTotal()方法可取得國、英、數三科總分
	public int getTotal(){
		return (chi+eng+math);
	}
	//顯示學生物件姓名以及國、英、數和三科總分
	public void show(){
		System.out.print(name + "  " + chi+ "  " + eng+ "  " + math + "  " + getTotal() + "  ");
	}
}

public class Hw16_1 {

	public static void main(String[] args){
		//建立stu[0]~stu[3]的Student物件陣列
		Student[] stu = new Student[]{
			new Student("王小明", 54,77,92),
			new Student("李小華", 88,27,88),
			new Student("張大立", 83,77,99),
			new Student("蔡小強", 66,44,72),
			new Student("丁小強", 26,44,92)	
		};
		//Arrays.sort第二個參數建立Comparator匿名介面物件
		//並實作Comparator介面的compare方法用來比較Studnet物件國、英、數三科總分
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
		System.out.println("  姓名  國文  英文  數學  總分  名次");
		System.out.println("============================");
		for (int i=stu.length-1, k=1; i>=0; i--, k++){
				stu[i].show();
				System.out.println(k);
		}
		
	}

}
