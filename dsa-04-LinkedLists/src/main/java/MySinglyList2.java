public class MySinglyList2 {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null; //no element in the list
    }

    void add(int data) { //insertion

        Node node = new Node(data);
        //no elements in list
        if (isEmpty()) {
            head = tail = node; // assign head and tail to node and increase size
            size++;
        } else {//if is no empty
            tail.next = node;//assign tail to node and increase size
            tail = node;
            size++;

        }

    }
    void deleteById(int id){
        // check if is empty
        if(isEmpty()) System.out.println("List is empty");


        //assign temp value  prev and current with the head
        Node prev = head;
        Node current= head;
        while(current!=null){
            if(current.id == id) {// if there is match

                // case 1: head
                if(current == head){
                    head= current.next;
                    current.next= null;// brake link

                }
                // case 2: tail
                else if(current == tail){
                    tail= prev;
                    prev.next = null; // ex tail will be eligible for Garbage collection
                }
                // case 3: middle
                else{
                    prev.next = current.next;
                    current.next= null;//current will be eligible for Garbage collection
                }
                //after deletion decrease size
                size--;
            }
            // move forward with elements in the list
            prev= current;
            current= current.next;
        }
    }


    void printNodes1() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id+"=> null");
            else {
                System.out.print(current.id +"=> ");

            }
            current = current.next;
        }

    }
}