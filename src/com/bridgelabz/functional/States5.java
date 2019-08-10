package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class States5 {
static double teamp2;
	public static void main(String[] args) {
		Utility utility=new Utility();
		int max=1;
		int min=0;
		double sum=0;
		 double[] array=new double[5];
    	 for(int i=0; i<5 ;i++) {
    		array[i]=utility.randum(max, min);
    		  System.out.println(array[i]);
    		  sum=sum + array[i];
    	 }
    	 double avg=sum/5;
    	 System.out.println("avg"+avg);
    	
    	 double temp2 = utility.maxnum1(array[0], array[1]);
    	 for(int i=2;i<5;i++) {
    		 temp2=utility.maxnum1(array[i], temp2); 
    	 }
		System.out.println("max"+temp2);
		
		 double temp1= utility.minnum1(array[0], array[1]);
    	 for(int i=2;i<5;i++) {
    		 temp1=utility.minnum(array[i],temp1); 
    	 }
		System.out.println("min"+temp1);
		
	}

}
