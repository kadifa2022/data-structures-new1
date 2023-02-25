package com.cydeo.Session_8_Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PhoneBookTree {
    CustomerNode root;

    public PhoneBookTree() {//constructor
        this.root = null; //initial root with null when  you create object
    }


    void insert(CustomerNode newNode) {

        if (root == null) { //if is null and assign new node
            root = newNode; // assign new node to root
            return;
        }
        CustomerNode current = root;
        while (true) {
            if (newNode.firstName.compareToIgnoreCase(current.firstName) < 0) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;

                }
                current = current.rightChild;


            }
        }
    }

    void printNamesInAscOrder(CustomerNode root) { //traversal in order

        if (root == null) return; // always start from the root -if root null there is nothing
        printNamesInAscOrder(root.leftChild);
        System.out.println(root.firstName + ", ");
        printNamesInAscOrder(root.rightChild);


    }

    List<String> firstNamesList(CustomerNode root) {
        return null;


//        Queue<TNode> queue= new LinkedList<>();
//        queue.add(root);//add root to queue
//        while(!queue.isEmpty()){//queue is not empty
//            TNode toVisit=queue.poll();//mean front of element// as variable to print
//            System.out.print(toVisit.value+", ");//  print out and visit element
//            if( toVisit.leftChild!=null) queue.add(toVisit.leftChild);//check if we have a left child and put in queue
//            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);//check if we have a right child and put in queue
//        }
    }

}