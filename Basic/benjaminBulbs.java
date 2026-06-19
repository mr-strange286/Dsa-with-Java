
import java.util.Scanner;
public class BenjaminBulbs{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Bulbs that remain ON: ");
        for(int i = 1; i*i<= num ; i++){
            System.out.println(i*i);
        }
        sc.close();
    }
}