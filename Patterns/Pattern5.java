package Patterns;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sp, st;

            if (i <= (n + 1) / 2) {
                sp = (n + 1) / 2 - i;
                st = 2 * i - 1;
            } else {
                sp = i - (n + 1) / 2;
                st = 2 * (n - i + 1) - 1;
            }

            for (int j = 1; j <= sp; j++)
                System.out.print("  ");

            for (int j = 1; j <= st; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}