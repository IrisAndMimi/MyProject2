package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "9873";
//		String nums = "2461";
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		while(a!=4){
			a = 0;
			b = 0;
			System.out.print("猜吧:");
			String nums = scanner.nextLine();
			int length = secret.length();
				for (int i=0; i<length; i++){
					char c = nums.charAt(i);
					//System.out.println(c);
					for (int j = 0; j<length; j++){
						if (c == secret.charAt(j)){
							if (i==j){
								a++;
							}else{
								b++;
							}
						}
					}
					
				}
			System.out.println(a+"A"+b+"B");
		}
	
	}

}
