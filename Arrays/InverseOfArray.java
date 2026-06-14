package Arrays;
import java.util.Scanner;
public class InverseOfArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	    int[] ans = new int[n];
	    for(int i = 0 ; i < n ; i++)
	    {
	        nums[i] = sc.nextInt();
	        ans[nums[i]]=i;
	    }
	    for(int i = 0; i < n ; i++)
	    {
	        System.out.println(ans[i]);
	    }
	    sc.close();
	}
}