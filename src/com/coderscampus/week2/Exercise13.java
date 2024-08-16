package com.coderscampus.week2;

import java.util.Scanner;

public class Exercise13 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in the number between 50 and 300");
		String input = scanner.nextLine();
		
		int convertedInput = Integer.parseInt(input);
		
		if (convertedInput <= 50) {
			System.out.println("No!");
		}
		else if (convertedInput >= 300) {
			System.out.println("Yes!");
		}
		
		scanner.close();
	}
	
}
