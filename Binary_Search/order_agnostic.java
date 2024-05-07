import java.util.Arrays;

public class order_agnostic {
    
    static int order(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        }
        else{
            isAsc = false;
        }


        while (start<= end) {
            
            int mid = start + (end - start)/2 ;

            if (isAsc) {
                if (arr[mid] == target) {
                    return mid;
                }
                else if (target > arr[mid]) {
                    start = mid+1;
                }
                else if (target < arr[mid]) {
                    end = mid-1;
                }
            }

            else{
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] > target ) {
                    start = mid+1;
                }
                else if (arr[mid] < target) {
                    end = mid-1;
                }
            }
            

        }
        return -1;
        
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,5,6,8,11,21,25,46,51};     // Ascending order
        int[] arr2 = {98,94,46,45,21,20,15,16,1};     // Descending order     
        int target = 46;

        System.out.println("Array 1 = "+ Arrays.toString(arr1));
        System.out.println("Array 2 = "+ Arrays.toString(arr2));

        System.out.println("Target Element of Array 1 is at index of " + order(arr1, target));     
        System.out.println("Target Element of Array 2 is at index of " + order(arr2, target)); // return -1 becoz target 25 is not present in Array 2

    }
}
