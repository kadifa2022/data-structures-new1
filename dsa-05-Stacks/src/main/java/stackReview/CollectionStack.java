package stackReview;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack { // build in with ready methods pop(), peek(), push()
    public static void main(String[] args) {

        Deque<Integer> eStack = new LinkedList<>(); //Deque extend the queue FIFO and stack FIFO

        eStack.push(1);
        eStack.push(2);
        eStack.push(3);
        eStack.push(4);
        eStack.push(5);
        System.out.println(eStack.peek());
        System.out.println(eStack.pop());
        System.out.println("Peek is: " + eStack.peek());


    }
}
