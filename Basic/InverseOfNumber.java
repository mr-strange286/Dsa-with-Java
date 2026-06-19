
import java.util.Scanner;
public class InverseOfNumber {
    public static int getPowerOf10(int exponent) {
        int result = 1;
        while (exponent > 0) {
            result *= 10;
            exponent--;
        }
        return result;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int ans=0;
        int position=1;
        while(n>0){
            int digit=n%10;
            ans+=position*getPowerOf10(digit-1);
            n/=10;
            position++;
        }
        System.out.println("Inverse of N: " + ans);
        sc.close();
    }
}