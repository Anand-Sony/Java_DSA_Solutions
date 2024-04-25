import java.util.Arrays;

public class missing_number {

    static int missingNumber(int array[], int n){

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int ans=0;
        for(int i=0 ; i<array.length ; i++){
            if (array[i] != i+1) {
                ans = i+1;
                break;
            }
        }

        if (ans==0) {
            ans = -1;
        }
        return ans;
        
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,8,5,6,9};
        System.out.println(missingNumber(arr, 10));
    }
    
}
