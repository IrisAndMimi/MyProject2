package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(87);
		cards.add(123);
		cards.add(22);
		cards.add(99);
		System.out.println("本來有"+cards.size()+"個");
		System.out.println("打算移除"+cards.get(0));
		cards.remove(0);
		System.out.println("第2項變成了"+cards.get(1));
		System.out.println("再來移除第2項:"+cards.remove(1));
		System.out.println("剩下"+cards.size()+"個");
	}

}
