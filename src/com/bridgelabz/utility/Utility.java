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
		
		/*Prime Range*/
		public  static boolean PrimeNo(int n)
		{
			int temp=n;
			for(int i=2;i<temp/2;i++)
			{
				if(temp%i==0)
				{
					return false;
				}
				
			}
			return true;
		}
		/*Binary swap*/
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
		public int SwapNibbles(int y)
		{
			 
			
			int  x = (((y & 0x0F) << 4) |((y & 0xF0) >> 4));
			System.out.println(x);	
			return  x; 
			 
		}
		public double CalculateAngleX(int x) {
			
			return x%(2*180);
		}
		
		/*Repeated Number*/
		public void RepeatedNo(int[] arr, int n)
		{

			for(int i=0;i< arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
					System.out.println("Repeated = "+arr[j]);		
				    }
					
				}
			}
		}

		public double CalAngleX(int x) {
			
			return x%(2*180);
		}
		
		/*sin.java*/
		public void SinXSeries(double angleX, int noOddSeries) {
			
			int count=1;

			System.out.print("Sin("+angleX+") = ");
			System.out.print(angleX +" - ");
			for(int i=3;i<=noOddSeries;) {
				if(count%2!=0) {
					System.out.print(Math.pow(angleX, i)+" / "+CalFactorial(i));
					if(i!=noOddSeries) {
						System.out.print(" + ");
					}
					
					count++;
					
				}else {
					System.out.print(Math.pow(angleX, i)+" / "+CalFactorial(i));
					if(i!=noOddSeries) {
						System.out.print(" - ");	
					}
					count++;
				}
				i=i+2;
				
			}
			
		}
		public int CalFactorial(int number) {
			int fact=1;
			for (int i=1;i<=number;i++) {
				fact*=i;
			}
			return fact;
		}
/*cos.java*/
		public void CosXSeries(double angleX, int noEvenSeries) {
			int count=1;
			
			System.out.print("Sin("+angleX+") = ");
			System.out.print( "1 - ");
			for(int i=2;i<=noEvenSeries;) {
				if(count%2==0) {
					System.out.print(Math.pow(angleX, i)+" / "+CalFactorial(i));
					if(i!=noEvenSeries) {
						System.out.print(" + ");
					}
					
					count++;
					
				}else {
					System.out.print(Math.pow(angleX, i)+" / "+CalFactorial(i));
					if(i!=noEvenSeries) {
						System.out.print(" - ");	
					}
					count++;
				}
				i=i+2;
				
			}
			
		}
		
		/*Prime Factorial*/
		public void PrimeFact(int n) 
		{
			    int num;
				String primeNumbers="";
			      for (int i = 1; i <= n; i++)         
			      { 		  	  
			         int counter=0; 	  
			         for(num =i; num>=1; num--)
				     {
			           if(i%num==0)
				          {
			 		        counter = counter + 1;
				          }
				      }
			         
				  if (counter==2)
				  {
				    
				     primeNumbers = primeNumbers + i + " ";
				  }	
			         }
			       System.out.println("Prime numbers from 1 to "+n+" are :");
			       System.out.println(primeNumbers);
			
			}
		
		
}
		

		
		
 


	






