import java.util.Scanner;
public class MinimumValueInMatrix {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the Numbers: ");
        int[][] matrix = new int[rows][columns];
        matrix[0][0] = sc.nextInt();
        int min=matrix[0][0];
        for(int i = 0 ; i < rows ; i++){
            for(int j = (i==0 ? 1 : 0) ; j < columns ; j++){
                matrix[i][j]=sc.nextInt();
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
        }
        System.out.print("The Minimum value in matrix: " + min);
        sc.close();
    }
}