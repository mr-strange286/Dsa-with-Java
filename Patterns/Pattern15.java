package Patterns;

import java.util.Scanner;
public class Pattern15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sp;
	    int st;
	    int num;
	    for(int i = 1 ; i <= n ; i++)
	    {
	        if(i<=(n+1)/2)
	        {
	            sp=(n+1)/2-i;
	            st=2*i-1;
	            num=i-1;
	        }
	        else{
	            sp=i-(n+1)/2;
	            st=2*(n+1-i)-1;
	            num=n-i;
	        }
	        for(int j = 1 ; j <= sp ; j++)
	        {
	            System.out.print("  ");
	        }
	        for(int j=1; j<=st; j++)
	        {
	            
	            if(j<=(st+1)/2)
	            {
	                num++;
	            }
	            else{
	                num--;
	            }
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
		sc.close();
	}
}