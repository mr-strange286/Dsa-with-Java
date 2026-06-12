import java.util.Scanner;
public class digits
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod=0;
        int num = n;
        while(num>0)
        {
            nod++;
            num=num/10;
        
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        for(int i = nod-1 ; i>=0; i--)
        {
            System.out.println(n/(int)(Math.pow(10,i)));
            n=n%(int)(Math.pow(10,i));
        }
    }
}
