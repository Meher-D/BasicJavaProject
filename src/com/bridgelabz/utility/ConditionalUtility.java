package com.bridgelabz.utility;

public class ConditionalUtility {
	 public void sqrtNewton(int c)
	 {
		 int t;
		 t=c;
		 t=(t/c+c)/2;
		 int epsilon=1+(10^-15);
		 if(Math.abs(t - c/t) > epsilon*t)
		 {
			 t=c;
			 t=(t/c+c)/2;
			 System.out.println(t);
        	 
		 }
	 }
	public void gamlingSimulation(int stake,int goal,int day)
	{
		int win=0;
		 int trails=0;
		for(int t=0;t<day;t++)
		{
			int cash=stake;
			  while (cash > 0 && cash < goal)
			  {
				  if (Math.random() < 0.5)
				  {
					  cash++;
				  trails++;
			      }
			       else
			      {
				  cash--;
				  trails++;
			      }
			  if(cash==goal)
			  {
				  win++;
			  }
			    System.out.println(" Number of wins " + win);
		        System.out.println("Percent of  win " +  win*1000 / day);
		        System.out.println("Avg no of  bets made" +trails/ day);
		      }
			  }
	}
	
	public  static boolean PrimeNo(int no)
	{
		int temp=no;
		for(int i=2;i<temp/2;i++)
		{
			if(temp%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	public void Binary(int n)
	{
	 int a;
	 String x="";
	 while(n>0)
	 {
		 a=n%2;
		 x=a + "" +x;
		 n=	n/2;
	 }
		while(x.length()<4)
		{
			x="0" +x;
			
		}
		System.out.println("Binary No of="+x);	
	}
	static int swapNibbles(int x) 
	{ 
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	   
	   
	}
}
