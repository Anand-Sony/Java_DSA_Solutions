import java.util.*;
class sum_digit{
    
    static int sumDigits(int[] arr)
    {
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum = sum + arr[i] ;
        }
        return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{

        ArrayList <Integer> l1 = new ArrayList<>();

	    Scanner sc  = new Scanner(System.in);
		// your code goes here

        System.out.print("Enter size of the array : ");
		int n = sc.nextInt();
		int[] inputs = new int[n];
		
		for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
            l1.add(inputs[i]);
        }      

        System.out.println(l1);

        
        
        System.out.println("Sum of element in the ArrayList is : "+sumDigits(inputs));
        
        
        
        

	}
}