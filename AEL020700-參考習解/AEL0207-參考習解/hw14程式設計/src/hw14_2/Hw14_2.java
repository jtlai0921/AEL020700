package hw14_2;

import java.io.*;
import java.util.Scanner;

public class Hw14_2 {
    public static void main(String[] args) {
        try {
        	System.out.print("�п�J�ɮ׸��|�G");
        	Scanner scn = new Scanner(System.in);
        	String fpath = scn.next();
            FileInputStream fin = new FileInputStream(fpath);
            int size = fin.available();
            byte b[] = new byte[size];
            fin.read(b);
            System.out.println(fpath + " �iŪ�줸�ժ��ƶq�G" + size);
            for (int i = size-1; i >= 0; i--) {
                System.out.print((char) b[i]);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("��J�ɮ׸��|���~!!");
        }
    }

}
