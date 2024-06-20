import java.util.*;
public class transpose_matrix{

    static void transpose(int[][]matrix_old , int [][] matrix_new ){


    }
    public static void main(String[] args) {
        int [][]matrix_old = {{1,2,3},
                              {4,5,6},
                              {7,8,9}
        };

        int matrix_new [] []= new int[3][3];

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matrix_new [i][j] = matrix_old[j][i]; 
            }
        }

        System.out.println("Normal Matrix is = ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(matrix_old[i][j] +" ");
            }
            System.out.println();
        }


        System.out.println("Transpose matrix = ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(matrix_new[i][j] + " " );
            }
            System.out.println();
        }
    }
}