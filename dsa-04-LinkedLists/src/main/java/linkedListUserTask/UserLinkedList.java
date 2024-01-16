package linkedListUserTask;

public class UserLinkedList {
    UserNode head;
    UserNode tail;
    int  size;


    public UserLinkedList() { // good habit to create constructor and initial value to 0
        this.size = 0;
    }

    boolean isEmpty(){ return head == null;
    }

    void insertLast(UserNode node ){ // sending object but, the values can be sent also
        //1. If List is Empty head and tail will = new node
        if(isEmpty()){
            head=tail=node; // new node
        } else {
            // not empty
            tail.next = node; // new node and new node is tail
            tail = node;
        }
        size ++;  //increase size
    }

    void printNames(){

        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        //Assign current value to the head
        UserNode current  = head;
        // loop
        while(current != null){
            System.out.print(current.name+ " => " );
            current = current.next;
            if(current == null) System.out.print("null");// if is the last element will print the null
        }
    }



}
