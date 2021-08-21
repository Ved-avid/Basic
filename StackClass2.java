import java.util.*;
public class Main {
    public static void main(String args[]) {
    
    LinkedList<Integer> s = new LinkedList<Integer>();
    s.push(1);
    s.push(2);
    System.out.println(s);
    System.out.println(s.peek());
    System.out.println(s.getFirst());
   // System.out.println(s.poll());
   // System.out.println(s.pollLast());
    System.out.println(s.remove());
    System.out.println(s);
    s.push(5);
    s.push(6);
    System.out.println(s);
    System.out.println(s.peek()+" "+s.getFirst()+" "+s.peekFirst());

    Stack<Integer> stack = new Stack<>();
    stack.add(1);
    stack.add(2);
    System.out.println(stack);
    System.out.println(stack.peek());    
    }
}
