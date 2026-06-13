package Arrays;
import java.util.Scanner;

public class IndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == d) {
                index = i;
                break;
            }
        }

        System.out.print(index);
    }
}