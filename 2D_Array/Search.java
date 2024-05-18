import java.util.Arrays;

public class Search {
    static int[] searchh(int[][] matrix , int target){
        int row=0;
        int col = matrix.length -1;
        while (row<matrix.length && col>=0) {
            if (matrix[row][col] == target) {
                return new int []{ row, col};
            }
            if (matrix[row][col]<target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        
        int arr[][] = {
            {4,5,6},
            {5,7,8},
            {6,7,9}
        };
        int target = 7;

        System.out.println(Arrays.toString(searchh(arr, target)));
    }
}