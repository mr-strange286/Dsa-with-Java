package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == n) {
                // First and last rows
                for (int j = 1; j <= n; j++)
                    System.out.print("* ");
            }

            else if (i < mid) {
                // Upper V
                for (int j = 1; j <= i - 1; j++)
                    System.out.print("  ");

                System.out.print("* ");

                for (int j = 1; j <= n - 2 * i; j++)
                    System.out.print("  ");

                System.out.print("* ");
            }

            else if (i == mid) {
                // Middle row
                for (int j = 1; j <= mid - 1; j++)
                    System.out.print("  ");

                System.out.print("* ");
            }

            else {
                // Lower filled triangle
                int stars = 2 * (i - mid) + 1;
                int spaces = n - i;

                for (int j = 1; j <= spaces; j++)
                    System.out.print("  ");

                for (int j = 1; j <= stars; j++)
                    System.out.print("* ");
            }

            System.out.println();
        }
    }
}