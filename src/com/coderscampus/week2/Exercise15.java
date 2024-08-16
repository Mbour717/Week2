package com.coderscampus.week2;

import java.util.Scanner;

public class Exercise15 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in a number between 50 and 300");
		String input = scanner.nextLine();
		
		int convertedInput = Integer.parseInt(input);
		
		if (convertedInput < 50 || convertedInput > 300) {
			System.out.println("No!");
		}
		else {
			System.out.println("Yes!");
		}
		
		scanner.close();
	}

}
