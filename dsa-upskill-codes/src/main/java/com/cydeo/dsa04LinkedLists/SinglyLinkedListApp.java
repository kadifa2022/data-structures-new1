package com.cydeo.dsa04LinkedLists;

public class SinglyLinkedListApp {

    public static void main(String[] args) {


        MySinglyLinkedList myList1 = new MySinglyLinkedList();
        MySinglyLinkedList myList2 = new MySinglyLinkedList();
        myList1.add(1);myList1.add(3);myList1.add(6);myList1.add(7);
        myList2.add(2);myList2.add(4);myList2.add(5);

        for (int i = 0; i<10; i++){
            myList1.add(i);
        }
        myList1.printNodes();
        myList1.deleteById(3);

        System.out.println("index of 3" + myList1.indexOf(3));

        Node newHead= MergeTwoLinkedList.mergeLinkedLists(myList1.head, myList2.head);



        while (newHead !=null){
            System.out.println(newHead.id);
            newHead= newHead.next;
        }
    }
}
