import java.util.*;
public class Max_wealth {

    public static int sum1(int[] arr){
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the array : Remember both array should have same size : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0 ; i<n ; i++){          
            arr1[i] = sc.nextInt();         
        }

        for(int i=0 ; i<n ; i++){
            arr2[i] = sc.nextInt();
        }

        
        System.out.println("Array 1 = "+Arrays.toString(arr1));
        System.out.println("Array 1 = "+Arrays.toString(arr2));

        System.out.println("Sum of value of array 1 = " + sum1(arr1));
        System.out.println("Sum of value of array 2 = " + sum1(arr2));
        

    }
}
