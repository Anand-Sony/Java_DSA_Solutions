public class CycleSort {

    public static int missing(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (correct >= 0 && correct < arr.length && arr[i]!= arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!= j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6,3,8};
        System.out.println(missing(arr));
    }
}