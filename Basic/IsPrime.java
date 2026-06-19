
import java.util.Scanner;
public class IsPrime{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<2)
            isPrime=false;
        for(int i = 2 ; i*i <= n ; i++){
            if(n%i == 0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Given number is prime");
        }else{
            System.out.println("Given number is not prime");
        }
        sc.close();
    }
}