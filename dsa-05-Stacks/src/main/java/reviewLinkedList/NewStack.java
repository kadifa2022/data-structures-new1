package reviewLinkedList;

public class NewStack<T> { // Generics new stack

    // here is used object-oriented design patter
    MySinglyLinkedList<T>  list = new MySinglyLinkedList<>();  // created my list
    void push(T t){
        list.addFirst(t);
    }
    T pop(){
        return list.removeFirst();
    }
    boolean isEmpty(){
        return list.isEmpty();
    }
    int size(){
       return list.size;
    }
}
