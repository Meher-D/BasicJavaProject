package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOut {

	public static void main(String[] args) {
		Utility utility=new Utility();
        Scanner scanner=new Scanner(System.in);
         double FirstNumber,SecondNumber,result;
         //FirstNumber=12.0;
         //SecondNumber=10.1;
        System.out.println("Enter the FirstNumber=");
        FirstNumber=scanner.nextDouble();
        System.out.println("Enter the SecondNumber=");
        SecondNumber=scanner.nextDouble();
       result=utility.DoubleOpt(FirstNumber, SecondNumber);
       System.out.print("result are="  + result);
       scanner.close();
	}

}
