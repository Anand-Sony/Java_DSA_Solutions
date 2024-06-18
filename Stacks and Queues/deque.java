import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

    public static void main(String[] args) {
       
        Deque<Integer> d = new ArrayDeque<>();
        d.add(78);
        d.add(89);
        d.addLast(108);
        d.removeFirst();

        System.out.println(d);

    }
    
}
