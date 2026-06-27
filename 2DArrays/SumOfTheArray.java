import java.util.Scanner;
public class SumOfTheArray {
    @SuppressWarnings("ConvertToTryWithResources")      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Ente number of columns: ");
        int columns = sc.nextInt();
        int sum = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum+=sc.nextInt();
            }
        }
        System.out.print("The Sum Of Matrix: "+sum);
        sc.close();
    }
}