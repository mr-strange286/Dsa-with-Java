
import java.util.Scanner;
public class PrimeFactorsOfNumber{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("PrimeFactors of N: ");
        while(n%2==0){
            System.out.println(2);
            n/=2;
        }
        for(int i=3;i*i<=n ; i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
        sc.close();
    }
}