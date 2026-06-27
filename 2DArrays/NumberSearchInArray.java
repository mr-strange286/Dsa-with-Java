import java.util.Scanner;
public class NumberSearchInArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int num = sc.nextInt();
                if (num == search) {
                    System.out.println("Number found at (" + i + ", " + j + ")");
                    sc.close();
                    return; 
                }
            }
        }

        System.out.println("Number not found");
        sc.close();
    }
}