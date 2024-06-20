public class multiplication_matrix {
    
    public static void main(String[] args) {
        
        int [][] matrix_A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrix_B = {{1,0,0},{1,0,0},{1,0,0}};
        int [][] matrix_C = new int[3][3];

        System.out.println("Matrix A = ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                System.out.print(matrix_A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix B = ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                System.out.print(matrix_B[i][j] + " ");
            }
            System.out.println();
        }

        
        for(int i = 0 ; i <3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matrix_C[i][j]= 0;

                for(int k=0 ; k<3 ; k++){
                    matrix_C[i][j] =matrix_C[i][j]  + matrix_A[i][k] * matrix_B[k][j]; 
                }
            }
        }

        System.out.println("Multiplication of Mtarix A and B = ");
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(matrix_C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
