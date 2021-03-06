package com.r177219058.q2;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		int n,ele,sum=0;
		Scanner sc=new Scanner(System.in);  
		System.out.print("How many numbers? ");    
		n=sc.nextInt();  
		int[] a= new int[20];  
		System.out.println("Enter the elements in the array: ");  
		for(ele=0;ele<n;ele++)  
		{  
		a[ele]=sc.nextInt();  
		}  
		for (ele=0;ele<n;ele++)   
		{ 
			a[ele]=a[ele]*a[ele];
            sum=sum+a[ele];
		}
		System.out.print("Sum of the square of the numbers are :");
		for (ele=0;ele<n;ele++)
		{
		System.out.println(a[ele]); 
		}
		System.out.println("Sum of the square of the numbers are :"+sum);
				  
	}

}
