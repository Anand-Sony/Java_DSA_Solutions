import java.util.Scanner;

public class Is_Symmetric {

    static void symmetric(int[][] matrix1 ,int[][] matrix2 ){
        

        boolean flag = true;
        // check symmetricity :  
        if (matrix1 == matrix2) {
            flag = true;
        }
        else{
            flag = false;
        }

        if (flag==false) {
            System.out.println("Not Symmetric");
        }
        else{
            System.out.println("Symmetric");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]matrix1 = new int[3][3];
        int [][]matrix2 = new int[3][3];
        System.out.println("Enter the value of the matrix");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 = ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // Now we will do transpose of that matrix
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix2[i][j] = matrix1[j][i];
            }
        }
        System.out.println("Transpose of the matrix1 : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        symmetric(matrix1, matrix2);
    }
    
}