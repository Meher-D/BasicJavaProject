package com.bridgelabz.conditional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary1 {

	public static void main(String[] args)
	{
		Utility utility =new Utility();
		 Scanner scanner=new Scanner(System.in);
		 int n,a;
		 String x="";
		 System.out.println("Enter The Number:-");
		 n=scanner.nextInt();
		 int b=n;
		 if(n>255) 
		 {
			 System.out.println("Invalid Input");
		 }
		 else
		 {
			 while(n>0)
			 {
				 a=n%2;
				 x=a + "" +x;
				 n=	n/2;
			 }
			 System.out.println("The binary Number is:-"+x);
		 }
		 int s=utility.SwapNibbles(b);
		 
	}

}
