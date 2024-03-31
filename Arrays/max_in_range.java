import java.util.*;

public class max_in_range {

    public static int max_range(int[] arr , int start , int end){
        int maxval = arr[start];
        for(int i=start ; i<=end ; i++){
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        
        int [] arr = new int[5];
        arr[0] = 69;
        arr[1] = 21;
        arr[2] = 3;
        arr[3] = 45;
        arr[4] = -8;

        Scanner sc = new Scanner(System.in);
        System.out.println(arr);

        System.out.print("Enter 1st range : ");
        int start = sc.nextInt();

        System.out.println();

        System.out.println("Enter 2nd range : ");
        int end = sc.nextInt();
        System.out.println(max_range(arr, start, end));

    }
    
}
