package Array;

public class search {

    static int search_element(int []arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return search_element(arr, target, index+1);
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8,9};
        System.out.println(search_element(arr, 5, 0));
    }
    
}
