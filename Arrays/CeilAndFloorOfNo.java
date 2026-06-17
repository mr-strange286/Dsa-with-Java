package Arrays;
import java.util.Scanner;
public class CeilAndFloorOfNo
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
	    int ceil=0;
	    int floor=0;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        if(data<nums[mid])
	        {
	            high=mid-1;
	            ceil=nums[mid];
	        }else if(data>nums[mid]){
	            low=mid+1;
	            floor=nums[mid];
	        }
	        else{
	            ceil=nums[mid];
	            floor=nums[mid];
	            break;
	        }
	    }
	    System.out.println("Ceil is: " + ceil + " and floor is: " + floor);
	}
}
