import java.util.Arrays;

public class cyclic {

    static int missing(int [] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr ,  correct ,i);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {5,6,4,1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
