package hw14_1;

import java.util.Scanner;
import java.io.*;

public class Hw14_1 {
	public static void main(String[] args) {
		String data;
		try {

			System.out.print("�п�J�ɮ׸��|1�G");
			Scanner sn = new Scanner(System.in);
			String fpath1 = sn.next();

			System.out.print("�п�J�ɮ׸��|2�G");
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

				System.out.println("����ɮצX�֦�D:/newtext.txt");

			} catch (IOException e) {
				System.out.println("��J�ɮ׸��|���~!!");
			}

		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
}
