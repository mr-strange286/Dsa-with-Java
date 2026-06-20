package Patterns;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Pattern 4: ");
        StringBuilder row = new StringBuilder(2*rows);
        for(int i = 1 ; i <= rows ; i++){
            row.setLength(0);
            for(int  j= 1 ; j <= i-1 ; j++){
                row.append("  ");
            }
            for(int j = 1 ; j <= rows-i+1 ; j++){
                row.append("* ");
            }
            System.out.println(row);
        }
        sc.close();
    }
}