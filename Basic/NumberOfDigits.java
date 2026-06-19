
import java.util.Scanner;
public class NumberOfDigits{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int nod=0;
        while(num>0){
            nod++;
            num/=10;
        }
        System.out.print("Number of Digits in N: " + nod);
        sc.close();
    }
}