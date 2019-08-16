package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SqrtN 
{
 public static void main(String[] args) {
	
				Utility utility=new Utility();
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter non negative number : ");
				int n=scanner.nextInt();
				if(n>0)
				{
					utility.sqrtNewton(n);
				
				}
				else
				{

					System.out.println("Please,Enter positive number");
				}
         scanner.close();
			}

		}

