package com.bridgelabz.utility;

public class Utility {

    public int SumOfIntegers(int firstNumber,int secoundNumber)
    {
    	int result;
    	result=firstNumber+secoundNumber;
    	return result;
    }
    public int Operator1(int FirstNumber,int SecondNumber,int ThirdNumber)
    {
    	int result=FirstNumber+SecondNumber*ThirdNumber;
    	return result;
    }
    public int Operator2(int FirstNumber,int SecondNumber,int ThirdNumber)
    {
    	int result=FirstNumber*SecondNumber+ThirdNumber;
    	return result;
    }
    public int Operator3(int FirstNumber,int SecondNumber,int ThirdNumber)
    {
    	int result=ThirdNumber+FirstNumber/SecondNumber;
    	return result;
    }
    public int Operator4(int FirstNumber,int SecondNumber,int ThirdNumber)
    {
    	int result=FirstNumber%SecondNumber+ThirdNumber;
    	return result;
    }
    public double DoubleOpt(double FirstNumber,double SecondNumber)
    {
    	double result=FirstNumber+SecondNumber;
    	return result;
    }
    public boolean LeapYear(int year)
    {
    	if((year%4==0)&&(year%100==0)&&(year%400==0))
    	{
    		
    	return false;
    		
    	}
    	return true;
    }
    public float random(int max,int min)
    {
    	int range=max;
    	float randnum=(float)(Math.random()*range)+min;
    	return randnum;
    }
    public double maxnum
    (double a,double b)
    {
    	return Math.max(a, b);
    }
    public double minnum(double a,double b)
    {
    	return Math.min(a, b);
    }
    public double Euclidean(double x,double y)
    {
    	double result;
    	result=Math.sqrt(x*x+y*y);
    	return result;
    }
    public void calculate(double a,double b,double c)
    {
    	double root1,root2;
    	double delta=b*b+4*a*c;
    	if(delta>0)
    	{
    		
			root1=(-b+ Math.sqrt(delta)) / (2*a);
    		root2=(-b -Math.sqrt(delta)) / (2*a);
    		System.out.printf("two roots of equation" +a+"x*x+"+b+"x+"+c+"is %f  %f:",root1,root2);
 
    	}
    	if (delta==0)
    	{
    		root1=-b/2*a;
    		root2=root1;
    		System.out.printf("two roots of equation" +a+"x*x+"+b+"x+"+c+"is %f  %f :",root1,root2);
    	}
    	if(delta<0)
    	{
    		double realpart=-b/2*a;
    		double imagpart=Math.sqrt(delta)/2*a;
    		root1=realpart+imagpart;
    		root2=realpart-imagpart;
    		System.out.printf("two roots of equation" +a+"x*x+"+b+"x+"+c+"is %f  %f :",root1,root2);
    	}
    }
    public boolean ValidDate(int month,int day)
    {
     if(month<1 || month>2)
    	 return false;
     if(day<1||day>31)
       return false;
     if(month==2)
    	 if(day<1||day>28)
    	 return false;
     if(month==4 || month==6 || month==9 || month==11)
    	 if(day<1 || day>30)
    		 return false;
     return true;
    }
    public boolean SpringSeason(int month,int day)
    {
    	if(month==4 || month==5)
    		return true;
    	if((month==3&&day>=20)||(month==6&&day<=20))
    		return true;
       return false;
    }

	public float randum(int max , int min ) 
	{
		 int range = max;
		 float randnum= (float)(Math.random() * range) + min; 
		 
		 return randnum;
	}
	
	public double maxnum1(double a, double b) {
		 return Math.max(a, b);
	}
	public double minnum1(double a, double b) {
		 return Math.min(a, b);
	}
	public int DayOfWeek(int m,int d,int y)
	{
		    int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 +y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + 31 * m0 / 12) % 7;  
	       
	}
	public boolean day1(boolean c)
	{
	         if(c= 0 <= d0 <= 6)
	         {

	          if (c) 
	          {
	            String b = "Sunday";
	          }
	          else 
	          {
	           if (c) 
	           {
	            	String b = "Monday";
	            } 
	            else 
	            {

	              if (c)
	              {
	                String b = "Tuesday";
	            } 
	              else 
	              {
	              if (c) 
	              {
	                String b = "Wednesday";
	              } 
	              else 
	              {
	                if (c)
	                {
	                  String b = "Thursday";
	                } 
	                else
	                {
	                  if (c) 
	                  {
	                    String b = "Friday";
	                  } 
	                  else 
	                  {
	                    if (c) 
	                    {
	                      String b = "Saturday";
	                    }                 
	                   }
	                  }
	               }
	             }
	             }
	       
	          }
	         }
	          } 
	}

	






