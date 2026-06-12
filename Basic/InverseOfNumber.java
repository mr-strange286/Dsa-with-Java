import java.util.Scanner;
public class InverseOfNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i = 1;
	    int ans=0;
	    while(n>0)
	    {
	        int dig=n%10;
	        ans+=i*(int)(Math.pow(10,dig-1));
	        n=n/10;
	        i++;
	    }
		System.out.println(ans);
	}
}