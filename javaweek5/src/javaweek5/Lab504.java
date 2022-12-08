package javaweek5;

import java.util.Scanner;

public class Lab504 {

	public static void main(String[] args) {
		String fullName ;
		String firstName;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n: ");
		fullName = scan.nextLine();
		firstName = fullName.substring(0,fullName.indexOf(' '));
		System.out.println(abbreviatName(fullName)+firstName);
		abbreviatName(fullName);

	}
	public static String abbreviatName(String fullName) {
		String initalLetter="";
		for(int i =0;i<fullName.length();i++) {
			if (fullName.charAt(i)== ' '){
			initalLetter = (initalLetter + fullName.charAt(i+1)).toUpperCase();
			initalLetter = initalLetter +".";
			}
		}
		return initalLetter;
	
	}

}
