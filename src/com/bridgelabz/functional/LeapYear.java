package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a year greater than 1582");
		System.out.println("Enter The Year:-");
		int year=scanner.nextInt();
		if(year>=1582&&year<=9999)
		{
		if(utility.LeapYear(year))
		{
		System.out.println("It is aLeapYear...");
		}
		else 
		{
			System.out.println("It is not LeapYear....");
		}
	
		}
		else
		{
			System.out.println("Enter valid year....");
		
		}
		scanner.close();	
	}

}
