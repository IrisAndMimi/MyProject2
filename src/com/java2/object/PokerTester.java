package com.java2.object;

public class PokerTester {

	public static void main(String[] args) {
		String flowers = "SHDC";
		Poker poker = new Poker();
//		Poker2 poker = new Poker2();
		poker.shuffle();
		poker.show();
	}

}
