import java.util.Scanner;
public class SaddlePointInArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n of Square Matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter the Numbers: ");
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int minCol=0;
            boolean isSaddle=true;
            for(int j=1;j<n;j++){
                if(matrix[i][minCol]>matrix[i][j]){
                    minCol=j;
                }
            }
            
            for(int k=0;k<n;k++){
                if(matrix[i][minCol]<matrix[k][minCol]){
                    isSaddle=false;
                    break;
                }
            }
            
            if(isSaddle){
                System.out.println("Saddle Point is (" + i + "," + minCol + ")");
                return;
            }
        }
        System.out.println("No Saddle Point");
        sc.close();
    }
}