package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfIntegers {

	public static void main(String[] args) {
		Utility utility = new Utility();
        int  firstNumer,secoundNumber,result;
        
        Scanner scanner  =new Scanner(System.in);
        System.out.println("Enter the firstNumber:");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter the secoundNumber");
        secoundNumber=scanner.nextInt();
        result = utility.SumOfIntegers(firstNumber,secoundNumber);
        System.out.println("sum of two integers are:" + result);
        scanner.close();
	}


	}


