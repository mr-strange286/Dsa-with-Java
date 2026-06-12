package Patterns;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sp;
        int st;
        for(int i=1;i<=n; i++)
        {
            if(i<=(n+1)/2)
            {
                st=(n+1)/2-i;
                sp=2*i-1;
            }
            else{
                st=i-(n+1)/2;
                sp=2*(n-i+1)-1;
            }
            for(int j = 1 ; j  <= st ; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1; j <=sp ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j  <= st ; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}