//Bryan Nauth
//My Project

import java.util.Scanner;

public class Main {
	
	public static double conversionIn(double number) {
		number = number * (double)2.54;
		return number;
		} 
	public static double conversionCm(double number) {
		number = number / (double)2.54;
		return number;
		}
	
	public static void main(String[] args) {
	  
		System.out.println("Hello! Thank you for choosing Bryan's Converter");
		
		////in java a variable is a placeholder for something else
		//Byte: 8 bit -128-127
		//Short: 16 bit  -32768-32767
		//Int: 32 bit 0-2^32-1
		//Long: 64 bit -0 - 2^64-1
		//Float: 32 bit
		//Double: 64 bit
		//Boolean: true/false
		//Char: 16 unicode
		//String: character strings
		//Default= 0/null/false
		Scanner reader = new Scanner(System.in);
		System.out.println("Please type 'in' to convert from inches or 'cm' to convert from centimeters");
		String conversion = reader.next();
		conversion = conversion.toUpperCase();
		System.out.println("Enter your number: ");
		double number = reader.nextDouble();
		switch (conversion)
		{    
		    case "IN":
		    	number = conversionIn(number);
		    	System.out.println(number);
		    	break;
		    case "CM":
		       number = conversionCm(number);
		        System.out.println(number);
		        break;
		    default:
		    	System.out.println("No input");
		        break;
		}
		System.out.println("Would you like to find out what happens when you divide 10 by 3 as integers? (yes or no)");
		String divide = reader.next();
		if (divide.contains("yes")) {
			int division = 10 / 3;
			System.out.println(division);	
		} else {
			System.out.println("int can only contain whole numbers, therefore dividing with integers is usually a bad idea");
		}
		
	}
	
}
//sdfsdf



	

