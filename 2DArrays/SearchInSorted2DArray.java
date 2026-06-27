import java.util.Scanner;
public class SearchInSorted2DArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the Numbers: ");
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the required Number: ");
        int num = sc.nextInt();
        int i=0;
        int j=columns-1;
        while(i<rows&&j>=0){
            if(matrix[i][j]==num){
                System.out.print("Found the number at (" + i + "," + j + ")");
                return;
            }else if(matrix[i][j]<num){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("Number not found");
        sc.close();
    }
}