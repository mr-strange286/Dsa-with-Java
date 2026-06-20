package Patterns;
import java.util.Scanner;
public class Pattern2{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Pattern 2: ");
        StringBuilder row = new StringBuilder(2*rows);
        for(int i = 1 ; i<=rows; i++){
            row.setLength(0);
            for(int  j = rows-i+1 ; j >0; j--){
                row.append("* ");
            }
            System.out.println(row);
        }
        sc.close();
    }
}