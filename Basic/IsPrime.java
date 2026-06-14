import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int k=0; k <t ; k++)
        {
            int n = sc.nextInt();
            boolean isPrime=true;
            if(n==1 || n==0)
            {
                isPrime=false;
            }
            for(int i = 2 ; i*i <= n ; i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime)
            {
                System.out.println("is a Prime");
            }
            else{
                System.out.println("not a Prime");
            }

        }
        sc.close();
    }
}