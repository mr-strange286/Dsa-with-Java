import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int n1 = num1;
        int n2 = num2;

        while (n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n1;
        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD = " + gcd + " and LCM = " + lcm);
    }
}