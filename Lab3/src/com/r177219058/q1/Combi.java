package com.r177219058.q1;
import java.util.Scanner;

public class Combi {

	public static void main(String[] args) {
		int per[]=new int[3];
		System.out.println("Enter the three numbers between 0 and 9"); 
		Scanner num= new Scanner(System.in);
		per[0]=num.nextInt();
		per[1]=num.nextInt();
		per[2]=num.nextInt();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					if(i!=j&&j!=k&&k!=i)
						System.out.println(per[i] + "" + per[j] + "" + per[k]);
				}
				
			}
		}

	}
}
