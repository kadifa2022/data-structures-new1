package stackReview;

import java.util.NoSuchElementException;

public class MyStack <T> { // generic type
    public SNode<T> bottom;
    public SNode<T> top;
    int size;
    public boolean isEmpty(){ // if is bottom empty return null
        return bottom == null;
    }
    public void push(T item ){// < T> is my data
        // Create new now node
        SNode<T> node = new SNode<>(item); // i have new node and i can push to the stack
        if(isEmpty()) bottom=top=node;
           else{
               top.next = node;
               top= node;
            }
           size ++;
        }
    public T peek(){
        return (T) top.value;
    }

    public  T pop() {// remove operation
        // first we peekNode
        SNode peekNode;
        if (isEmpty()) throw new NoSuchElementException(" List is Empty");
        // we have to check 2 cases:
        // 1. stack has one element
        if (top == bottom) { // this means is one item
            peekNode = top;
            top = bottom = null;
        } else {//2. more than one element
            peekNode = top;
            SNode prev = bottom;
            while (prev.next != top) {
                prev = prev.next;
            }
            prev.next = null;
            top = prev;
        }
        size--;
        return (T) peekNode.value;

    }

}
