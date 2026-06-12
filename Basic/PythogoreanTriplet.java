import java.util.Scanner;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int sum = a * a + b * b + c * c - max * max;

        System.out.println(max * max == sum);
    }
}