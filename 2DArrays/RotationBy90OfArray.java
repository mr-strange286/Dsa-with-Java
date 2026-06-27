import java.util.Scanner;
public class RotationBy90OfArray{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        if(rows != columns){
            System.out.println("Rotation using transpose works only for square matrices.");
            return;
        }
        System.out.println("Enter the Numbers: ");
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int temp;
        for(int i=0;i<rows;i++){
            for(int j = 0;j<i;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns - 1 - j];
                matrix[i][columns - 1 - j] = temp;
            }
        }
        System.out.println("Resultant Matrix: ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result.append(matrix[i][j]).append(" ");
            }
            result.append('\n');
        }
        System.out.print(result);
        sc.close();
    }
}