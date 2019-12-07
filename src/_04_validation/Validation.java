//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber == 0) {
			System.out.println("why you so beautiful");
		}
		if(randomNumber == 1) {
			System.out.println("you lookin bad yesterday but good today");
		}
		if(randomNumber == 2) {
			System.out.println("how you do that hair so not bad");
		}
		if(randomNumber == 3) {
			System.out.println("why you look like a turtle if turtles looked like you");
		}
		if(randomNumber == 4) {
			System.out.println("you lookin thicc");
		}
			
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
