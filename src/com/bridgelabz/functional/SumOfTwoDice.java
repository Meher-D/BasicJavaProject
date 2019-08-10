package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
	  int max=6;
	  int min=1;
	  int a=(int)utility.random(max,min);
	  System.out.println("First Random number on first Dice is="+a);
	  int b=(int)utility.random(max,min);
	  System.out.println("Second random number on second Dice is=" +b);
	  int sum=a+b;

	}

}
