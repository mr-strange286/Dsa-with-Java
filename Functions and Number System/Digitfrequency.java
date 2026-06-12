
import java.util.Scanner;

public class Digitfrequency {
    public static int digitfrequency(int n, int d)
    {
        int count=0;
        while(n>0)
        {
            if(d==n%10)
            {
                count++;
            }
            n=n/10;
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.print(digitfrequency(n,d)); 
        
    }
}