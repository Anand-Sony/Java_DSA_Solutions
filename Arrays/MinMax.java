import java.util.*;
import java.util.Collections;
public class MinMax {

    static void miniMaxSum(List<Integer> arr) {
            
        Collections.sort(arr);
        
        int max = 0;
        for(int i = arr.size() ; i>arr.size()-4 ; i--){
            max = max + arr.get(i);
        }
        System.out.print(max);
        
        int min = 0;
        for(int j = 0 ; j<4 ; j++){
            min = min + arr.get(j);
        }
        System.out.print(min);

    }

    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();

	    l1.add(new Integer(1));
	    l1.add(new Integer(11));
	    l1.add(new Integer(12));
	    l1.add(new Integer(5));
	    l1.add(new Integer(16));
	    l1.add(new Integer(100));
		System.out.print(miniMaxSum(l1));
    }
    
}
