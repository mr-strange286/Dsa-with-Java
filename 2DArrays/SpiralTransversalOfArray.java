import java.util.Scanner;
public class SpiralTransversalOfArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the Numbers: ");
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=matrix.length-1;
        int maxc=matrix[0].length-1;
        int count=rows*columns;
        System.out.println("Resultant Matrix: ");
        while(count>0){
            for(int i=minr;i<=maxr && count>0;i++){
                System.out.println(matrix[i][minc]);
                count--;
            }
            minc++;
            for(int j=minc;j<=maxc && count>0;j++){
                System.out.println(matrix[maxr][j]);
                count--;
            }
            maxr--;
            for(int i=maxr;i>=minr && count>0;i--){
                System.out.println(matrix[i][maxc]);
                count--;
            }
            maxc--;
            for(int j=maxc;j>=minc && count>0;j--){
                System.out.println(matrix[minr][j]);
                count--;
            }
            minr++;
        }
        sc.close();
    }
}