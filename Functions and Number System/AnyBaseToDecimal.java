import java.util.Scanner;

public class AnyBaseToDecimal {
    public static int AnyToDecimal(int n, int b)
    {
        int i=0;
        int ans=0;
        while(n>0)
        {
            ans+=(n%10)*(int)(Math.pow(b,i));
            n=n/10;
            i++;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(AnyToDecimal(n,b)); 
        sc.close();
    }
}