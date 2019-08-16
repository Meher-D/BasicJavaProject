package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
    Utility utility=new Utility();
	Scanner scanner=new Scanner(System.in);
	boolean Going=true;
	while(Going)
	{
	System.out.println("Month");
	int m=scanner.nextInt();
	if(m<1 || m>12)
	{
		
		System.out.println("Months are Between 1 and 12");
		continue;
	}
	}
	while(Going)
	{
		System.out.println("Days");
		int d=scanner.nextInt();
		if(d<1 || d>31)
		{
			System.out.println("Days are between 1 to 31");
			continue;
		}
	}
	while(Going)
	{
		System.out.println("Years");
		int y=scanner.nextInt();
		if(y<-10000 || y>10000)
		{
			System.out.println("Years between -10000 to 10000");
		}
		}
 scanner.close();
	}

}
