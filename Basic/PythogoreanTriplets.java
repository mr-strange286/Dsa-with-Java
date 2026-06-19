
import java.util.Scanner;
public class PythogoreanTriplets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int num3 = sc.nextInt();
        int sumSquares=num1*num1+num2*num2+num3*num3;
        int max=Math.max(Math.max(num1,num2),num3);
        int maxSquare=max*max;
        if(sumSquares==2*maxSquare)
        {
            System.out.println("Given Numbers are Pythogorean Triplets");
        }else{
            System.out.println("Given Number are not Pythogorean Triplets");
        }
    }
}