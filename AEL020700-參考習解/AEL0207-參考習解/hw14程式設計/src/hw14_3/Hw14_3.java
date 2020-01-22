package hw14_3;

import java.io.*;
import java.util.Scanner;

public class Hw14_3 {
	public static void main(String[] args) {
		String data, str = "";
		try {
			System.out.print("�п�J�ɮ׸��|�G");
			Scanner sn = new Scanner(System.in);
			String fpath = sn.next();
			FileReader f = new FileReader(fpath);
			BufferedReader bfin = new BufferedReader(f);
			do {
				data = bfin.readLine();
				if (data == null) {
					break;
				}
				// System.out.println(data);
				str += data;
			} while (true);
			bfin.close();
		} catch (IOException e) {
			System.out.println("��J�ɮ׸��|���~!!");
		}
		int[] letter = new int[26];
		int k;
		char ch;

		char[] fileCh = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			fileCh[i] = str.charAt(i);
			ch = fileCh[i];
			if (ch >= 'A' && ch <= 'Z') {
				k = (int) ch - 65;
				letter[k]++;
			} else if (ch >= 'a' && ch <= 'z') {
				k = (int) ch - 97;
				letter[k]++;
			}
		}

		System.out.println();
		System.out.println("���ɭ^��r���X�{���r�Ʀp�U...");
		for (int i = 0; i < 26; i++) {
			System.out.println((char) (65 + i) + "," + (char) (97 + i) + "->" + letter[i] + "��");
		}
	}
}
