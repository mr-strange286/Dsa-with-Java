import java.util.Scanner;

public class DecimalToAnyBase {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(DecimalToAny(n,b)); 
        
    }
}