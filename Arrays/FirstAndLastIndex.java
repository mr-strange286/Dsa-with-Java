package Arrays;
import java.util.Scanner;
public class FirstAndLastIndex
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        nums[i]=sc.nextInt();
	    }
	    int data = sc.nextInt();
	    int low=0;
	    int high=n-1;
	    int first=0;
	    int last=0;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        if(data<nums[mid])
	        {
	            high=mid-1;
	        }else if(data>nums[mid]){
	            low=mid+1;
	        }
	        else{
	            first=mid;
	            high=mid-1;
	        }
	    }
	    low=0;
	    high=n-1;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        if(data<nums[mid])
	        {
	            high=mid-1;
	        }else if(data>nums[mid]){
	            low=mid+1;
	        }
	        else{
	            last=mid;
	            low=mid+1;
	        }
	    }
	    System.out.println("First Index is: " + first + " and Last Index is: " + last);
	}
}