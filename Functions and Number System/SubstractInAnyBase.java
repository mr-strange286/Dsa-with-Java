import java.util.Scanner;

public class SubstractInAnyBase {
    public static int SubstractOfAny(int b, int n1, int n2)
    {
        int ans=0;
        int borrow=0;
        int i=0;
        if(n2>n1)
        {
            int temp=n2;
            n2=n1;
            n1=temp;
        }
        while(n1>0)
        {
            int d1 = n1%10;
            int d2 = n2%10;
            if(d1-borrow<d2)
            {
                ans+=(d1-d2-borrow+b)*(int)(Math.pow(10,i));
                borrow=1;
            }else{
                ans+=(d1-d2-borrow)*(int)(Math.pow(10,i));
                borrow=0;
            }
            
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
        
        System.out.print(SubstractOfAny(b,n1,n2)); 
        sc.close();
    }
}