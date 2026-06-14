package Arrays;
import java.util.Scanner;
public class RotationOfArray
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	    for(int i = 0 ; i < n ; i++)
	    {
	        nums[i] = sc.nextInt();
	    }
	    int k = sc.nextInt();
	    k=((k%n)+n)%n;
	    for(int i = 0; i < n ; i++)
	    {
	        System.out.println(nums[(k+i)%n]);
	    }
	    sc.close();
	}
}