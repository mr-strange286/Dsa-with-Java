package Patterns;

import java.util.Scanner;
public class Pattern16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i = 1 ; i <= n ; i++)
	    {
			int num=0;
	        for(int j=1; j<=i; j++)
	        {   
	            num++;
	            System.out.print(num + " ");
	        }
	        for(int j = 1 ; j <= 2*(n-i)-1 ; j++)
	        {
	            System.out.print("  ");
	        }
			if(i==n)
			{
				num--;
			}
			for(int j=1; j<=i-(i==n ? 1 : 0); j++)
	        {   
	            
	            System.out.print(num + " ");
				num--;
	        }
			
	        System.out.println();
	    }
	}
}