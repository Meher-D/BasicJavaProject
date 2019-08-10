package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Month:");
		int month=scanner.nextInt();
		System.out.println("Enter the Day:");
		int day=scanner.nextInt();
		if(utility.ValidDate(month, day)) 
		{
			if(utility.SpringSeason(month, day))
			{
				System.out.println("It is a SpringSession..");
			}
			else 
			{
				System.out.println("It is not SpringSession....");
		
			}
		}
		else 	
		{
			System.out.println("Enter valid String...");
		}	
	}
}


