import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int duplicate(int[] nums) {
        ArrayList <Integer>  l1 = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            for(int j = i+1 ; j<nums.length ;j++  ){
                if(nums[i] == nums[j]){
                    l1.add(nums[i]);
                    System.out.println(l1);
                    
                }            
            }
            
            
        }
        ArrayList<Object> allElements = new ArrayList<>();
        allElements.addAll(l1);

        // Print the ArrayList
        for (Object element : allElements) {
            System.out.print(element + " ");
        }
        System.out.println();
        return 0;

    }
    public static void main(String[] args){
            int[] nums = {1,5,9,1,3,6,3,5,9,4,21,203,20,121,21,4};

            System.out.print("Previous List = " + Arrays.toString(nums));
            
            System.out.println();
            
            System.out.print(duplicate(nums));
    }
}