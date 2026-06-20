package Patterns;
import java.util.Scanner;
public class Pattern1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Pattern 1: ");
        StringBuilder row = new StringBuilder();
        for(int i = 1 ; i <= rows ; i++){
            row.setLength(0);
            for(int j = 1 ; j<=i ; j++){
                row.append("* ");
            }
            System.out.println(row);
        }
        sc.close();
    }
}