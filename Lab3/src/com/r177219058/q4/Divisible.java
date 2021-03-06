package com.r177219058.q4;

public class Divisible {
	public static void main(String[] args) {
	int sum=0,i;
    
	for(i=41;i<250;i++)
	{
	    if(i%5==0)
	    {
	    	sum=sum+i;	
	    }
	}

System.out.println("Sum of all integers which are greater than 40 and less than 250 that are divisible by 5 is:"+sum);

}
}
