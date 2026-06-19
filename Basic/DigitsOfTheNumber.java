
import java.util.Scanner;
public class DigitsOfTheNumber{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int div=1;
        while(n/div>=10)
        {
            div*=10;
        }
        System.out.println("Digits of N: ");
       
        while(div>0){
            System.out.println(n/div);
            n%=div;
            div/=10;
        }
        sc.close();
    }
}