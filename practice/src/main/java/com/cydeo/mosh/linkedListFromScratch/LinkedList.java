package com.cydeo.mosh.linkedListFromScratch;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {// since this class is declared inside the LinkedList class we have access to private fields
        private int value;
        private Node next; // with this field we keep reference to next node
        public Node(int value){ // we created constructor  to sett the value
            this.value =value;
        }
    }
    private Node first; //head
    private Node last; //tail

    //------------------addFirst---------------------//

    public void addFirst(int item){
        Node node = new Node(item);
     //    if (first == null) we are improving code and replacing this logic  with isEmpty()
        if(isEmpty())
            first =last= node;
        else {
            node.next = first;// node link to first
            first=node;
        }
    }

    // --------------isEmpty() -----------------------//
    private Boolean isEmpty(){// private method won't be accessible outside the class
        return first == null;
    }

    //-----------------------addLast-------------------//
    public void addLast(int item){ // passing integer value
        Node node = new Node(item); // vrap the value inside the node object and also created constructor inside the node class to pass the value
        /* node.value = item; // this field is declared as private, we can't access outside the node class
         since we are creating constructor in node class  we don't need to set value
          */
        if(isEmpty())  // this mean we don't have any node in this list
            first = last = node; // set first and last to the node in sae line
        else { // at least one node
            last.next = node; // to link the last node to new node
            last = node; //we are updating last node
        }
    }
    //-----------------------------indexOf----------------------//

    public int indexOf(int item){// soon as we find the item we need to return index
        // we need to traverse this list starting from beginning all to the end
        int index = 0; // we need to declare variable and initial with the 0
        var current = first; // initial first node
        while(current !=null) {  //
            if (current.value == item) return index; // we are comparing current value with item
            current = current.next;  //otherwise we will set current to the next node
            index++;  // and also increment index by1
        }
        // if we come to the end of the list and can't find we need to return -1
        return -1;
    }

    //--------------------------------contains-----------------//
    public boolean contains(int item){ // we already  built this logic in indexOf method
        return indexOf(item) != -1; // if this expression is true that's mean we have that's item in our list
    }
    //-------------deleteFirst-or- removeFirst()---------------//

    public void removeFirst(){ // we don't need any parameter here
        //[10->20->30]
        //first -> 20
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first =last = null;
            return;
        }
        var second = first.next; // creating this variable referencing to the second node, not to loose connection to the list
        first.next = null; // will remove link between first and second node
        first = second; // updating second to the first
    }
    //-------------deleteLast-or removeLast--------------//

    public void removeLast(){
        //[10 -> 20 -> 30] // we need to traverse list from the head  to the tail
        // previous -> 20 // to remove last item we need to find previous node
        //last ->20
        if(isEmpty()) //edge case if list is empty
            throw new NoSuchElementException();
        // if list has only one item
        if(first == last){
            first = last =null;
            return;
        }

        var previous = getPrevious(last);
        last = previous; //this will shrink our list
        last.next = null;// remove link


        }
        // declaring private method to get the prev Node and storing all logic from removeLast()
    private Node getPrevious(Node node) {
        var current = first;// find the previous node and  define variable
        while (current != null) { // as long current is not null we are going forward
            if (current.next == node)
                return current;// first we are checking if current is equal to the last we will breake loop
            current = current.next; // current is pointed to the next step //at this point we have prev node
        }
        return null;

    }


}







