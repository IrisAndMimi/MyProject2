package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		
		System.out.println("連加ArrayList:");
		List<Integer> cs = new ArrayList<>();
		int a=0;
		while(a<4) {
		a++;
		cs.add(a);
		}
		System.out.println("cs.get(0)到cs.get(3)");
		System.out.println("1~4 共"+cs.size()+"項");
		System.out.println();
		
		System.out.println("size/get/remove/set:");
		List<Integer> cards = new ArrayList<>();
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
