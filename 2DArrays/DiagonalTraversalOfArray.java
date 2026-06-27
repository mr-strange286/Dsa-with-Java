import java.util.Scanner;
public class DiagonalTraversalOfArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n of Square Matrix: ");
        int n=sc.nextInt();
        System.out.println("Enter the Numbers: ");
        int[][] matrix = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Resultant Numbers are: ");
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                System.out.println(matrix[i][j]);
            }
        }
        sc.close();
    }
}