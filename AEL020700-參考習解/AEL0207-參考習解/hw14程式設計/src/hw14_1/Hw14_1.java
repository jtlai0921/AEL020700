package hw14_1;

import java.util.Scanner;
import java.io.*;

public class Hw14_1 {
	public static void main(String[] args) {
		String data;
		try {

			System.out.print("請輸入檔案路徑1：");
			Scanner sn = new Scanner(System.in);
			String fpath1 = sn.next();

			System.out.print("請輸入檔案路徑2：");
			String fpath2 = sn.next();

			FileReader f1 = new FileReader(fpath1);

			String str1 = "", str2 = "";
			BufferedReader bfin1 = new BufferedReader(f1);
			do {
				data = bfin1.readLine();
				if (data == null) {
					break;
				}
				str1 += data + "\n";
				// System.out.println(data);
			} while (true);
			bfin1.close();

			FileReader f2 = new FileReader(fpath2);

			BufferedReader bfin2 = new BufferedReader(f2);
			do {
				data = bfin2.readLine();
				if (data == null) {
					break;
				}
				str2 += data + "\n";
				// System.out.println(data);
			} while (true);
			bfin2.close();

			try {
				String fpath = "D:/newtest.txt";
				BufferedWriter fout = new BufferedWriter(new FileWriter(fpath));
				fout.write(str1 + str2);
				fout.close();

				System.out.println("兩個檔案合併至D:/newtext.txt");

			} catch (IOException e) {
				System.out.println("輸入檔案路徑有誤!!");
			}

		} catch (IOException e) {
			System.out.println("輸入檔案路徑有誤!!");
		}
	}
}
