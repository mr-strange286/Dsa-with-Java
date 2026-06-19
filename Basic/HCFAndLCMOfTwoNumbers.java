
import java.util.Scanner;
public class HCFAndLCMOfTwoNumbers {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int hcf = gcd(Math.abs(num1), Math.abs(num2));
        long lcm = (long) num1 / hcf * num2; 
        System.out.println("HCF of both numbers: " + hcf);
        System.out.println("LCM of both numbers: " + Math.abs(lcm));
        sc.close();
    }
}