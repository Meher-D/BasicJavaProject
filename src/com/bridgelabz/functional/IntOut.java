package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOut {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the FirstNumber:-");
		int FirstNumber=scanner.nextInt();
		System.out.println("Enter the SecondNumber:-");
		int SecondNumber=scanner.nextInt();
		System.out.println("Enter the ThirdNumber:-");
		int ThirdNumber=scanner.nextInt();
		System.out.println("Enter the Number of times you want to perfrom operation:-");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
	   System.out.println("Select the Operations:-  \n1.a+b*c \n 2. a*b+c \n 3. c+a/b \n 4. a%b+c ");
		int Operator=scanner.nextInt();
	   int result;
	   switch(Operator)
	   {
	   case 1:
	   result=utility.Operator1(FirstNumber,SecondNumber,ThirdNumber);
	   System.out.println("Operation1:"+result);
	   
	   break;
	   case 2:
		   result=utility.Operator2(FirstNumber,SecondNumber,ThirdNumber);
	   System.out.println("OPeration2:"+result);
	   break;
	   case 3:
		   result=utility.Operator3(FirstNumber, SecondNumber, ThirdNumber);
	   System.out.println("Operation3:"+result);
	   break;
	   case 4:
		   result=utility.Operator4(FirstNumber, SecondNumber, ThirdNumber);
	   System.out.println("Operation4:"+result);
	   break;
	   default:
	   System.out.println("Enter the correct Number..");
		   break;
		   
	   }
	}
		scanner.close();
	}
	}


