package hw07_7;

class BasePay {
	protected int hours, rate;
	public void setValue(int h, int r) {
		this.hours = h;
		this.rate = r;
	}
	public int hourPay() {
		return hours * rate;
	}
}

class Amount extends BasePay {
	private int bonus = 0;
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int totPay() {
		return super.hourPay() + bonus;
	}
}
public class Hw07_7 {
	public static void main(String[] args) {
		Amount Peter = new Amount();
	    Amount Tom = new Amount();
	    Peter.setValue(4, 150);
	    Tom.setValue(8, 120);
	    Tom.setBonus(200);

	    System.out.println("Peter日薪總額：" + Peter.totPay() + "元");
	    System.out.println("Tom日薪總額：" + Tom.totPay()+ "元");
	}
}
