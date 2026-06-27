import java.util.Scanner;
public class WaveTraversalOfArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the Numbers: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Result Matrix: ");
        StringBuilder result = new StringBuilder();
        for (int col = 0; col < columns; col++) {
            if ((col & 1) == 0) {
                for (int row = 0; row < rows; row++) {
                    result.append(matrix[row][col]).append('\n');
                }
            } else{
                for (int row = rows - 1; row >= 0; row--) {
                    result.append(matrix[row][col]).append('\n');
                }
            }
        }
        System.out.print(result);
        sc.close();
    }
}