package com.coderscampus.week2;

public class Week2Example {
	
	public static void main(String[] args) {
		int age = 18;
		
		
		if (age >= 19) {
			System.out.println("You are an adult");
			if (age >= 65) {
				System.out.println("You are a senior");
			}
		} else if (age >= 13) {
			System.out.println("You are a teenger"); 
		} else if (age == 12) {
			System.out.println("You a pre-teen");
		} else {
			System.out.println("You are a child");
		}
		 
		String output = "Your age is " + age;
		
		System.out.println(output);
		
		if (output.equals("Your age is 18")) {
			System.out.println("Yay you can vote!");
		}else if (output == "Your age is 21") {
			System.out.println("Yay you can drink / gamble!");
		}
			
	}

}
