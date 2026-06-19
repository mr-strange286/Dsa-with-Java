
import java.util.Scanner;

public class PrimesBetweenTwoNumbers{
    public static boolean IsPrime(int x){
        if(x==1 || x==0){
            return false;
        }
        for(int j = 2 ; j*j<=x ;j++){
            if(x%j==0)
            {
                return false;
            }
        }
        return true;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int low = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int high = sc.nextInt();
        System.out.print("The Prime Number between " + low + " and " + high + " : " );
        for(int i = low ; i <= high ;i++){
            if(IsPrime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}