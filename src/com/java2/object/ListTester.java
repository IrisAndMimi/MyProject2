package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		List<Integer> cs = new ArrayList<>();
//		int n[] = {4, 5, 6, 3, 2, 1};
//		cs.add
		System.out.println(cs.size());
		cards.add(87);
		cards.add(123);
		cards.add(22);
		cards.add(99);
		System.out.println("本來有"+cards.size()+"個");
		System.out.println("打算移除"+cards.get(0));
		System.out.println("(移除yee下)");
		cards.remove(0);
		System.out.println("第1項變成了"+cards.get(0));
		System.out.println("再來移除第2項:"+cards.remove(1));
		System.out.println("剩下"+cards.size()+"個");
		System.out.println("現在"+cards.set(1,87)+"變成了"+cards.get(1));
	}

}
