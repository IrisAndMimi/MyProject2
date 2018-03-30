package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
//	List<String> flowers = new ArrayList<>();
//	int[] cards = new int[52];
	List<Integer> cards = new ArrayList<>();
	String flowers = "SHDC";
	public Poker2() {
		int a=0;
		while(a<52) {
		a++;
		cards.add(a);
		}
		for (int i = 0; i < cards.size(); i++) {
//			cards.get(i) = i;
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
		}
	}
	
	public void shuffle(){
		for (int i=0; i<cards.size(); i++){
			int r =random.nextInt(52-1);
//			cards[i] <-> cards[r]
			int temp = cards.get(i);
			cards.set(i,cards.get(r));
			cards.set(r,temp);
		}
	}
	
	public void show(){
		for (int i=0; i<cards.size(); i++){
			int c = cards.get(i);
			System.out.print((c%13) + "" + (flowers.charAt(c/13)) + " ");
			if (i%13==0){
				System.out.println();
			}
		}
	}
}
