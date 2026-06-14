package Arrays;
import java.util.Scanner; 
public class ReversingOfArray
{
    public static void reverse(int[] arr)
    {
        for(int i = 0 ; i < arr.length/2 ; i++)
        {
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
		    arr[i]=sc.nextInt();
		}
		reverse(arr);
		for(int i = 0 ; i< n ; i++)
		{
		    System.out.println(arr[i]);
		}
		sc.close();
	}
}