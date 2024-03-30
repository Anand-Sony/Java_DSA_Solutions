import java.util.*;
public class Max_element {

    static int max(int[] arr){
        int maxval = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;   
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        System.out.println("Maximum value in the array = " + max(arr));


    }
}