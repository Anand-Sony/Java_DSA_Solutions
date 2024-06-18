import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        
        Queue <Integer> q = new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(5);
        q.add(19);
        q.add(1);

        // System.out.println(q.peek());
        // System.out.println(q.isEmpty());  // is empty or not (returns false)
        
        System.out.println(q.remove());
        System.out.println(q.remove());

        // first come first out
        System.out.println(q);
    }
    
}
