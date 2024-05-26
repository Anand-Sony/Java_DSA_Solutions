import java.util.Arrays;

public class Selection {
    static void select(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;       // example if i=0 then last = arr.length

            int max = getMax(arr ,0 , last);
            swap(arr,max, last);
        }
        
    }

    private static int getMax(int [] arr , int start , int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
           }
        }
        return max;
    }

    static void swap(int [] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {

        int [] arr = {5,6,8,7,2,4};
        select(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
