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
            tail.next = node;//assign to tail to node and increase size
            tail = node;
            size++;

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