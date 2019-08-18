package com.bridgelabz.Functionas;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;



public class StringPalindrome {

	public static void main(String[] args) {
		 Utility utility=new Utility();
				Scanner scanner=new Scanner(System.in);
				String str;
				
				System.out.println("Enter String to find palidrome or not");
				str=scanner.next();
				if(!utility.findStringPalindrome(str)) {
					System.out.println("String is palindrome");
				}else {
					System.out.println("String is not palindrome");
				}
				scanner.close();
				
			}

		
	}


