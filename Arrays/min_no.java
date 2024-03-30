import java.util.*;
public class min_no {
    
    static int min (int[] arr){
        if (arr.length ==0) {
            return -1;
        }

        
        int min = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] < min) {
                min = arr[i];        
            }
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the length of the Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter the " + i+" index value : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Array is : "+ Arrays.toString(arr));

        System.out.println("Minimum value in this array is : "+min(arr));

    }
}
