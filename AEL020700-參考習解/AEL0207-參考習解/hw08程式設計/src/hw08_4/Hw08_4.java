package hw08_4;

public class Hw08_4 {
	public static void main(String[] args) {
		try {
		  div(10, 3);
		  div(11, -1);
		  div(5, 0);
		}
		catch(ArithmeticException e) {
		   System.out.println("\n算術錯誤，發生例外了!!");
		}
	  }
	  
	  static void div(int x, int y) throws ArithmeticException {
		if(y == 0) {
		  new ArithmeticException();
		}
		System.out.print("\n"+x + " 除 " + y + " 等於 ");
		System.out.println ((double)(x/y));
	  }
}
