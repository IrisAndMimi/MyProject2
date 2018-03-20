package com.java2.object;

import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String secret = "9873";
		Scanner scanner = new Scanner(System.in);
		int rslt = 0;
		while (rslt != 40){
			System.out.print("猜吧");
			String num = scanner.nextLine();
			ABNumber n = new ABNumber(num);
			rslt = n.validate(secret);
			System.out.println((rslt/10)+"A"+(rslt%10)+"B");
		}
	}

}
