import java.util.Scanner;
public class MatrixMultiplication {
    @SuppressWarnings("ConvertToTryWithResources")  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of 1st Matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns of 1st Matrix: ");
        int columns1 = sc.nextInt();
        System.out.println("Enter the Numbers of Matrix 1: ");
        int[][] matrix1 = new int[rows1][columns1];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter number of rows of 2nd Matrix: ");
        int row2 = sc.nextInt();
        if(columns1!=row2){
            System.out.println("Cannot do Matrix Multiplication!");
            return;
        }
        System.out.print("Enter number of columns of 2nd Matrix: ");
        int columns2 = sc.nextInt();
        System.out.println("Enter the Numbers of Matrix 2: ");
        
        int[][] matrix2 = new int[row2][columns2];
        for(int i = 0;i<row2;i++){
            for(int j=0;j<columns2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        
        System.out.println(" The Result Matrix: ");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns2;j++){
                int sum=0;
                for(int k=0;k<columns1;k++){
                    sum+=matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}