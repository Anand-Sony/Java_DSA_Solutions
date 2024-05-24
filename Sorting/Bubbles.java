import java.util.Arrays;

public class Bubbles {

    static void bubble(int []arr){
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap =false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swap = true;

                }
            }
            if (swap == false) {
                break;
            }
        }

    }
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
