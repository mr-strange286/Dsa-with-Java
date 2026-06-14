package Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
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

        int[] ans = new int[Math.max(n1, n2) + 1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = ans.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += nums1[i];
                i--;
            }

            if (j >= 0) {
                sum += nums2[j];
                j--;
            }

            ans[k] = sum % 10;
            carry = sum / 10;
            k--;
        }

        int start = 0;
        if (ans[0] == 0) {
            start = 1;
        }

        for (int p = start; p < ans.length; p++) {
            System.out.println(ans[p]);
        }
        sc.close();
    }
}
