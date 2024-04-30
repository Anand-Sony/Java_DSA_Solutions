import java.util.Arrays;
import java.util.*;
class reverse_array{

    public static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void reverse(int[] arr){
        int start = 0;                      // arr = [11,  24 ,  45,  15 , 0] 
        int end= arr.length - 1;            //       0(s)   1     2   3   4(e)

        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int[] arr = {4,5,8,1,0,-7};

        System.out.println("Our old array = " + Arrays.toString(arr));

        reverse(arr);
        System.out.println();
        System.out.println("Reverse array = " + Arrays.toString(arr));

    }
}