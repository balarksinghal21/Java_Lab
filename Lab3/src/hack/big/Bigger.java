package hack.big;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bigger { 
    public static void permutation (char big[])
    {
        int i,j,flag=0;
        loop:
        for(i=big.length-1;i>0;i--)
        {
            if(big[i]>big[i-1])
            {
                j = big.length-1;
                while(flag==0 && j!=i-1){
                    if(big[i-1]<big[j])
                    {
                        char s = big[j];
                        big[j] = big[i-1];
                        big[i-1] = s;
                        flag = 1;
                        break loop;
                    }
                    j--;
                }
            }
               
        }       
      Arrays.sort(big,i,big.length);      
        if(flag==0)
            System.out.println("no answer");
        else
            System.out.println(big);     
    }  
    public static void main(String[] args) {
        char arr[];
        int i,n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            arr=in.next().toCharArray();
            permutation(arr);
        }
    }
}
