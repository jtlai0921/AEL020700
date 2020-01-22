package hw06_5;

class Cstudent {
	   private int height = 150;      //初始化height資料成員的值為150
	   private int weight = 40;       //初始化weight資料成員的值為40
	   private void setWeight(int w) {
	      if (w>=40 && w<=150) weight = w;
	   }
	   private void setHeight(int h) {
	      if (h>=50 && h<=250) height = h ;
	   }
	   public Cstudent() { }           //Cstudent類別的建構式，沒有傳入引數
	   public Cstudent(int w) {        //Cstudent類別的建構式，傳入一個引數
	      setWeight(w);                //呼叫setWeight方法初始化weight資料成員
	   }
	   public Cstudent(int h, int w) { //Cstudent類別的建構式，傳入兩個引數
	      setHeight(h);                //呼叫setHeight方法初始化height資料成員
	      setWeight(w);                //呼叫setWeight方法初始化weight資料成員
	   }
	   public void getShow() {
	      System.out.println("  身高是:" + height + " , 體重是:" + weight + "\n");
	   }
	}

	public class Hw06_5 {                    //主類別
	   public static void main(String[] args) {  //主程式   
	      Cstudent Peter = new Cstudent();
		  System.out.println("Peter的資料 >>> 使用Cstudent()建構式");
		  Peter.getShow();
		  Cstudent David = new Cstudent(300);
		  System.out.println("David的資料 >>> 使用Cstudent(300)建構式");
		  David.getShow();
		  Cstudent Mary = new Cstudent(180,78);
		  System.out.println("Mary的資料 >>> 使用Cstudent(180, 78)建構式");
	      Mary.getShow();
	   }
	}