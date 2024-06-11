import java.util.ArrayList;
import java.util.Arrays;

public class list2remove {
    static void listmethod(int[] arr){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] != 2){
                l.add(arr[i]);
            }
        }
        System.out.println(l);
    }

    static void arrMethod(int arr[]){
        for(int i= 0 ; i<arr.length ; i++){
            if (arr[i] != 2) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5};
        listmethod(arr);

        System.out.println();
        arrMethod(arr);
    }
}
