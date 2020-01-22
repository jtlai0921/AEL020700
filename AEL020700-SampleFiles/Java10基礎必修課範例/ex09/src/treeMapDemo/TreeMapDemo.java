package treeMapDemo;

import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		//var tmap = new TreeMap<>();
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(260, "宜蘭");
		tmap.put(970, "花蓮");
		tmap.put(500, "彰化");
		tmap.put(900, "屏東");
		tmap.put(600, "嘉義");
		System.out.println("集合內容：" + tmap);
		System.out.println("集合的元素個數：" + tmap.size());
		int key = (int) tmap.firstKey();
		System.out.println("集合的第一個郵遞區號：" + key);
		System.out.println("集合的第一個地名：" + tmap.get(key));
		System.out.println("集合的最後一個郵遞區號：" + tmap.lastKey());
		System.out.println("集合的最後一個地名：" + tmap.get(tmap.lastKey()));
		System.out.println("郵遞區號大於等於" + 600 + "的元素集合：" + tmap.tailMap(600));
	}
}
