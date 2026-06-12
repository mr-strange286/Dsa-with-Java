package Patterns;
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
               if(j==1 || j==n || (i==j && i>=(n+1)/2) || (i+j==n+1 && i>=(n+1)/2))
               {
                   System.out.print("* ");
               }
               else
               {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }

            
        
    }
}