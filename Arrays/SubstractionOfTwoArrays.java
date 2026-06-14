package Arrays;
import java.util.Scanner;

public class SubstractionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] ans = new int[Math.max(n1, n2)];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = ans.length - 1;
        int borrow = 0;

        while (i >= 0 || j >= 0) {
            int diff = borrow;

            if (i >= 0) {
                diff += nums1[i];
                i--;
            }

            if (j >= 0) {
                diff -= nums2[j];
                j--;
            }

            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[k] = diff;
            k--;
        }

        int start = 0;
        while (start < ans.length - 1 && ans[start] == 0) {
            start++;
        }

        for (int p = start; p < ans.length; p++) {
            System.out.println(ans[p]);
        }
        sc.close();
    }
}