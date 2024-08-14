package com.coderscampus.week2;

import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String input = Scan.nextLine();
		int convertedInput = Integer.parseInt(input);
		
		if (convertedInput <= 50) {
			System.out.println("No!");
		}
		else if (convertedInput >= 300) {
			System.out.println("Yes!");
		}
	}

}
