package com.cydeo.linkedList;

public class GetElements {
    public static void main(String[] args) {

    }

    public static Node getElements(Node head, Integer a, Integer b) {

        //first assign head to current and create counter

        Node current = head;
        Node lastAnode=head;

        while(current !=null){
            int countA= a;
            int countB= b;
            while(current!=null && countA !=0){
                lastAnode=current;
                current=current.next;
                countA--;
            }
            //continue ti traverse check whether element number equal to b
            while (current != null && countB !=0){
                current=current.next;
                countB--;
            }
           // delete n nodes (write last a nodes will
            // point last  b nodes)=>two pointer keep a delete b
            lastAnode.next=current;
        }
        return head;


    }
}