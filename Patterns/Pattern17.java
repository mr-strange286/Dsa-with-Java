package Patterns;

import java.util.Scanner;
public class Pattern17
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    
	    for(int i = 1 ; i <= n ; i++)
	    {
	        
	        for(int j = 1 ; j <= n/2 - (i==(n+1)/2 ? n/2 : 0) ; j++)
	        {
	            System.out.print("  ");
	        }
	        int st=i;
	        if(i>(n+1)/2)
	        {
	            st=n-i+1;
	        }
			for(int j=1; j<=st+(i==(n+1)/2 ? n/2 : 0); j++)
	        {   
	            
	            System.out.print("* ");
	        }
			
	        System.out.println();
	    }
	}
}