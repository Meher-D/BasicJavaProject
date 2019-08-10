package com.bridgelabz.functional;

import java.util.Scanner;

public class PrintThreeNumbers {

	public static void main(String[] args) {

	      Scanner scanner=new Scanner(System.in);
	      System.out.println("Enter First String:-");
	     String firstName=scanner.nextLine();
	      System.out.println("Enter Second String");
	      String secondName=scanner.nextLine();
	      System.out.println("Enter Third string:-");
	      String thirdName=scanner.nextLine();
	      System.out.println("Hi" +thirdName+ " "+secondName+" "+firstName);
	      scanner.close();
	}

}
