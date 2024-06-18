import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(31);
        s.push(340);

        System.out.println(s.pop()); 
        System.out.println(s.pop()); 
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        // last come first out
    }
    
}