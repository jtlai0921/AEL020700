package hw04;

import java.util.Scanner;

public class Hw04_7 {

	public static void main(String[] args) {
		String[][][] views = new String[4][][]; // 三維非對稱字串陣列
		views[0] = new String[][] { { "陽明山", "台北後花園" }, { "九份", "悲情城市有情天" } };
		views[1] = new String[][] { { "高美濕地", "賞鳥、看夕陽最佳景點" }, { "鹿港老街", "穿越時空隧道" }, { "日月潭", "湖光山色美景天成" } };
		views[2] = new String[][] { { "台江四草", "紅樹林綠色隧道" }, { "阿里山", "雲浪洶湧日出奇景" }, { "西子灣", "壽山山麓海天一色" },
				{ "墾丁", "南國風情海上活動豐富" } };
		views[3] = new String[][] { { "太魯閣", "峽谷景觀雄偉壯麗" }, { "秀姑巒溪", "泛舟活動刺激體驗" }, { "蘭嶼", "奇岩異石潛水天堂" } };
		Scanner scn = new Scanner(System.in);
		int area = 0; // 紀錄使用者選擇的地區
		int sel = 0; // 紀錄使用者選擇的風景區
		do {
			System.out.println("** 請輸入數字選擇地區 **");
			System.out.print("1北部  2中部  3南部  4東部  0結束   -> " );
			area = scn.nextInt(); // 輸入值-1表註標值
			if (area != 0) { // 如果地區不是輸入0
				do {
					System.out.println("** 請輸入數字選擇風景區 **");
					for (int i = 0; i < views[area - 1].length; i++) { // 顯示指定地區中的風景區名稱
						System.out.print((i + 1) + views[area - 1][i][0] + "  ");
					}
					System.out.print("0結束   -> ");
					sel = scn.nextInt();
					if (sel != 0) { // 如果風景區不是輸入0
						System.out.printf("** %s風景區簡介  **%n", views[area - 1][sel - 1][0]);// views[area-1][sel-1][0]表選擇風景區的名稱
						System.out.println(views[area - 1][sel - 1][1]); // views[area-1][sel-1][1]表選擇風景區的簡介
					}
				} while (sel != 0); // 風景區輸入 0 跳出do迴圈
			}
		} while (area != 0); // 地區輸入 0 跳出do迴圈
		System.out.println("** 程式結束  **");
		scn.close();
	}
}
