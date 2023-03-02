package com.cydeo.Session_8_Trees;

import javax.swing.tree.TreeNode;
import java.util.*;

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



    List<String> firstNamesList(CustomerNode root, List<String> names) {
        if (root==null) return names;
        if(root!=null);
        firstNamesList(root.leftChild, names);
        names.add(root.firstName);
        firstNamesList(root.rightChild,names);

return names;
    }


}











