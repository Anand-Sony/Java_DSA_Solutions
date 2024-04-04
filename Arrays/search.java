import java.util.*;
public class search {

    public static int linear_search(int[] arr , int target){
        if (arr.length ==0) {
            return -1;
        }

        for(int i=0 ; i<arr.length ; i++){
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,70,5,13,5,13,7,722,15,27,7,8,5,1,1,1,51};
        System.out.println("Your array is = "+ Arrays.toString(arr));

        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        int ans = linear_search(arr, target);
        
        System.out.println("Target " + target + " is at index of "+ans);

    }
    
}
