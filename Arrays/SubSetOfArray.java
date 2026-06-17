package Arrays;
import java.util.Scanner;
public class SubSetOfArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        nums[i]=sc.nextInt();
	    }
	    
	    int limit=(int)(Math.pow(2,n));
	    
	    for(int i = 0 ; i < limit ; i++)
	    {
	        String set = "";
	        int k=i;
	        for(int j=n-1;j>=0;j--)
	        {
	            int r = k%2;
	            k/=2;
	            if(r==0)
	            {
	                set="- "+set;
	            }
	            else
	            {
	                set=nums[j]+" " +set;
	            }
	        }
	        System.out.println(set);
	    }
        sc.close();
	}
}