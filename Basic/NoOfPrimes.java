import java.util.Scanner;

public class NoOfPrimes
{
    static boolean isPrime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i = 2 ; i * i <= n ; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low ; i <= high ; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        
    }
}