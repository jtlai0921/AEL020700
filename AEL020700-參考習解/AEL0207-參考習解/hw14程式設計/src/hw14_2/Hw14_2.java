package hw14_2;

import java.io.*;
import java.util.Scanner;

public class Hw14_2 {
    public static void main(String[] args) {
        try {
        	System.out.print("請輸入檔案路徑：");
        	Scanner scn = new Scanner(System.in);
        	String fpath = scn.next();
            FileInputStream fin = new FileInputStream(fpath);
            int size = fin.available();
            byte b[] = new byte[size];
            fin.read(b);
            System.out.println(fpath + " 可讀位元組的數量：" + size);
            for (int i = size-1; i >= 0; i--) {
                System.out.print((char) b[i]);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("輸入檔案路徑有誤!!");
        }
    }

}
