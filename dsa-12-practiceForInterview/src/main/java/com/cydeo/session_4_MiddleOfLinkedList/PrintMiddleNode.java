package com.cydeo.session_4_MiddleOfLinkedList;



public class PrintMiddleNode {
    public static void main(String[] args) {


        MySinglyLinkedList sll= new MySinglyLinkedList();
        for(int i=1; i<=9;i++){
            sll.add(i);
        }
        printMiddle(sll);


    }
    // please check this solutions
    public  static MySinglyLinkedList printMiddle(MySinglyLinkedList sll){
        //create two pointers
        Node a = sll.head;
        Node b = sll.head;
        //iterate over the likedList
        while(b!=sll.tail && b.next!=sll.tail){
            a=a.next;//singe jump
            b=b.next.next; //double jump
        }
       if(b==sll.tail) System.out.println(a.id);
       else System.out.println(a.id+","+ a.next.id);
        return sll;

    }

    public Node   middleNode(Node head){

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
