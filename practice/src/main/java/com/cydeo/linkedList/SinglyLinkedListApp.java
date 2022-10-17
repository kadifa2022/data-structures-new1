package com.cydeo.linkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList  myList= new MySinglyLinkedList();//is empty
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
            
        }
        myList.printNodes();
        myList.deleteById(2);
        myList.printNodes();

    }
}
