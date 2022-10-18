package com.cydeo.linkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList  myList= new MySinglyLinkedList();//is empty
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
            
        }
        myList.printNodes();
       // myList.deleteById(9);
        System.out.println(" kth item from last:" + myList.getKthItemFromLast(3));
        myList.removeKthItemFromLast(1);//this is for removing kth item from the list
        myList.printNodes();
       // System.out.println("index of 3 :" + myList.indexOf(3));


    }
}
