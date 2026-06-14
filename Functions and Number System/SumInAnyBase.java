import java.util.Scanner;

public class SumInAnyBase {
    public static int SumOfAny(int b, int n1, int n2)
    {
        int carry=0;
        int ans=0;
        int i=0;
        while(n1>0 || n2>0 || carry!=0)
        {
            int d1 = n1%10;
            int d2 = n2%10;
            ans+=((d1+d2+carry)%b)*(int)(Math.pow(10,i));
            carry=(d1+d2+carry)/b;
            n1/=10;
            n2/=10;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.print(SumOfAny(b,n1,n2)); 
        sc.close();
    }
}