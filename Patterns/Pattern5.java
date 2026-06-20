package Patterns;
import java.util.Scanner;
public class Pattern5{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Patter 5: ");
        int mid = (rows+1)/2;
        StringBuilder row = new StringBuilder(2*rows);
        for(int i = 1 ; i <= rows ; i++){
            row.setLength(0);
            int spaces = Math.abs(mid - i);
            int stars = rows - 2 * spaces;
            for(int j = 1 ; j <= spaces ; j++) row.append("  ");
            for(int j = 1 ; j <= stars ; j++) row.append("* ");
            System.out.println(row);
        }
        sc.close();
    }
}