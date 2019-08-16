package com.bridgelabz.conditional;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for n th Harmonic number:");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i!=n)
			{
				System.out.print("1/"+i+"+");
			}
			else if(i==n)
			{
				System.out.print("1/"+i);
			}
		}
		scanner.close();
	}	
	}


