package com.cydeo.dsa04LinkedLists.singlyLinkedList;

public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList= new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i <10 ; i++) {
            myList.add(i);

        }
        myList.printNodes();
        myList.deleteById(4);
        myList.printNodes();

    }
}
