import java.util.Scanner;
public class ShellRotationOfArray {
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
        System.out.print("Enter number of rotations: ");
        int rotations=sc.nextInt();
        System.out.print("Enter Shell Number: ");
        int shell=sc.nextInt();
        if(shell < 1 || shell > Math.min(rows, columns) / 2 + Math.min(rows, columns) % 2){
            System.out.println("Invalid shell number");
            return;
        }
        int[] arr =getShell(matrix,shell);
        rotate(arr,rotations);
        fillShell(matrix,shell,arr);
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
    public static int[] getShell(int[][] matrix,int s){
        int minRow=s-1;
        int minCol=s-1;
        int maxRow=matrix.length-s;
        int maxCol=matrix[0].length-s;
        int size=2*(maxRow-minRow+maxCol-minCol);
        int[] arr = new int[size];
        int idx=0;
        // Left wall
        for (int i = minRow; i <= maxRow; i++) {
            arr[idx++] = matrix[i][minCol];
        }

        // Bottom wall
        for (int j = minCol + 1; j <= maxCol; j++) {
            arr[idx++] = matrix[maxRow][j];
        }

        // Right wall
        for (int i = maxRow - 1; i >= minRow; i--) {
            arr[idx++] = matrix[i][maxCol];
        }

        // Top wall
        for (int j = maxCol - 1; j >= minCol + 1; j--) {
            arr[idx++] = matrix[minRow][j];
        }
        return arr;
    }
    public static void rotate(int[] arr, int r){
        int n = arr.length;
        r=((r%n)+n)%n;
        reverse(arr,0,n-r-1);
        reverse(arr,n-r,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void fillShell(int[][] matrix,int s, int[] arr){
        int minRow=s-1;
        int minCol=s-1;
        int maxRow=matrix.length-s;
        int maxCol=matrix[0].length-s;
        int idx=0;
        
        // Left wall
        for (int i = minRow; i <= maxRow; i++) {
            matrix[i][minCol] = arr[idx++];
        }

        // Bottom wall
        for (int j = minCol + 1; j <= maxCol; j++) {
            matrix[maxRow][j] = arr[idx++];
        }

        // Right wall
        for (int i = maxRow - 1; i >= minRow; i--) {
            matrix[i][maxCol] = arr[idx++];
        }

        // Top wall
        for (int j = maxCol - 1; j >= minCol + 1; j--) {
            matrix[minRow][j] = arr[idx++];
        }
    }
}