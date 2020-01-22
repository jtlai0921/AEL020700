package hw05;

public class Hw05_4 {

	public static void main(String[] args) {
		int sum = 0;	//
		//逐一讀取args陣列中的元素值
		for (int i = 0; i < args.length; i++) {
			System.out.printf("第 %d 位同學的分數： %s %n", i + 1, args[i]);
			//將字串陣列的元素值轉型為整數後，加到sum中
			sum += Integer.parseInt(args[i]);	
		}
		System.out.println("總分： " + sum);
	}

}