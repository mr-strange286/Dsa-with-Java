
import java.util.Scanner;

public class RotationOfNumber {
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.print("Enter the Number of Rotations: ");
        int k = sc.nextInt();
        int digits = countDigits(n);
        k = ((k % digits) + digits) % digits;
        int divisor = (int) Math.pow(10, k);
        int rotated = (n % divisor) * (int) Math.pow(10, digits - k) + n / divisor;
        System.out.println("Rotated Number: " + rotated);
        sc.close();
    }
}