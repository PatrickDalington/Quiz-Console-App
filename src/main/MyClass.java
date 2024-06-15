package main;

import java.util.Scanner;

public class MyClass {
	

	//String variable myName holding my name
	static String myName = "Folake";
	
	// Char variable holding myAge holding my age
	static char myAge = '5';

	// integer variable holding myYearOfBirth my year of birth
	static int myYearOfBirth = 1998;
	
	
	//String myInfo is holding a good sentence with the info above
	static String myInfo;
	
	
	public static void main(String[] args) {
		

		myInfo = "My name is " + myName + ". I am " + myAge + " years old." +
					" I was born in the year " + myYearOfBirth;
		
	
		System.out.println(myInfo);
	}

}
