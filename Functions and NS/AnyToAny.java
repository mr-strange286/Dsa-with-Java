import java.util.Scanner;

public class AnyToAny {
    public static int DecimalToAny(int n, int b)
    {
        int i=0;
        int ans=0;
        while(n>0)
        {
            ans+=(n%b)*(int)(Math.pow(10,i));
            n=n/b;
            i++;
        }
        
        return ans;
    }
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
    public static int AnyToAny(int n, int b1, int b2)
    {
        int buf=AnyToDecimal(n,b1);
        return DecimalToAny(buf,b2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        
        System.out.print(AnyToAny(n,b1,b2)); 
        
    }
}