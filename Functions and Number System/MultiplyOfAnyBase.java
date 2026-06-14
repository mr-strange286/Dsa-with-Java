import java.util.Scanner;
public class MultiplyOfAnyBase
{
    public static int SumOfAny(int b, int n1, int n2)
    {
        int carry=0;
        int ans=0;
        int p=1;
        while(n1>0 || n2>0 || carry!=0)
        {
            int d1 = n1%10;
            int d2 = n2%10;
            ans+=((d1+d2+carry)%b)*p;
            carry=(d1+d2+carry)/b;
            n1/=10;
            n2/=10;
            p*=10;
        }
        return ans;
    }
    public static int MultiplyByDigitOfAny(int b, int n1 , int d)
    {
        int carry=0;
        int ans=0;
        int p=1;
        while(n1>0 || carry!=0)
        {
            int d1=n1%10;
            n1/=10;
            ans+=((d1*d+carry)%b)*p;
            carry=(d1*d+carry)/b;
            p*=10;
        }
        return ans;
    }
    public static int MultiplyOfAny(int b, int n1, int n2)
    {
        int p=1;
        int ans=0;
        while(n2>0)
        {
            int d = n2%10;
            n2/=10;
            int d1=(MultiplyByDigitOfAny(b, n1, d)*p);
            ans=SumOfAny(b, ans , d1);
            p*=10;
        }
        return ans;
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(MultiplyOfAny(b, n1 , n2));
        sc.close();
    }
}