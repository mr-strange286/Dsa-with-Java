import java.util.Scanner;
public class ExitPointOfMatrix{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the Numbers: ");
        for(int i = 0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int dir=0;
        int i=0;
        int j=0;
        while(true){
            dir=(dir+matrix[i][j])%4;
            switch (dir) {
                case 0 -> j++;
                case 1 -> i++;
                case 2 -> j--;
                case 3 -> i--;
                default -> {
                }
            }
            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==rows){
                i--;
                break;
            }else if(j==columns){
                j--;
                break;
            }
        }
        System.out.println("Exited from (" + i + "," + j + ")");
        sc.close();
    }
}