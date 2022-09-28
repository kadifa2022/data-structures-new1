package com.cydeo.day05_stack.PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll= new MySinglyLinkedList();
        for(int i=1; i<=6;i++){
            sll.add(i);
        }
        printMiddle(sll);
    }


    public static void printMiddle(MySinglyLinkedList sll){
        //create two pointers
        Node a = sll.head;
        Node b = sll.head;
        //iterate over the likedList
       while(b !=sll.tail && b.next !=sll.tail){
           a=a.next;//singe jump
           b=b.next.next; //double jump
       }
       if(b==sll.tail) System.out.println(a.id);
       else System.out.println(a.id+","+b.id);

    }

}
