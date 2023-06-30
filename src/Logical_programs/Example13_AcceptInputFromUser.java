package Logical_programs;

import java.util.Scanner;

public class Example13_AcceptInputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		String s1 = scan.next();              //accept string input from user
		
		System.out.println(s1.toUpperCase());
		
		
		
		
//		System.out.print("Enter num1: ");
//		int num1 = scan.nextInt();       //accept integer input from user
//		
//		System.out.print("Enter num2: ");
//		int num2 = scan.nextInt();     
//		
//		System.out.println(num1+num2);
	}

}
