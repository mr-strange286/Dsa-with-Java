import java.util.Scanner;

public class RotationOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int nod = 0;

        while (temp > 0) {
            nod++;
            temp /= 10;
        }

        int k = sc.nextInt();
        k %= nod;
        if (k < 0)
            k += nod;

        int div = (int)Math.pow(10, k);
        int mul = (int)Math.pow(10, nod - k);

        int rem = num % div;
        int quo = num / div;

        int ans = rem * mul + quo;

        System.out.println(ans);
    }
}