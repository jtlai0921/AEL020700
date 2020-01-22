package userException;
import java.util.Scanner;

public class UserException {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b;
		try {
			System.out.print("請輸入第一個數值：");
			a = Integer.parseInt(scn.nextLine());
			System.out.print("請輸入第二個數值：");
			b = Integer.parseInt(scn.nextLine());
			System.out.println(a + "/" + b + "=" + a / b);
		} catch (ArithmeticException e) { // 檢查例外是否為算術運算的錯誤
			System.out.println("算術運算錯誤! 如除數為0!!");
		} catch (NumberFormatException e) { // 檢查例外是否為字串轉成數值的錯誤
			System.out.println("錯誤!字串無法轉成數值!!");
		}
	}
}
