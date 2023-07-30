package com.cydeo.dsa06Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeClass {
    TreeNode root;

    public TreeClass() {

        //why is null? reference type null null
    }

    public void insert(TreeNode newNode) {//1. insert  sending node
        // Tree can be empty -> and always root is null
        if (root == null) {
            root = newNode;
            return;
        }
        // we need temp variable
        TreeNode current = root;  // assign
        while (true) {
            if (newNode.id <= current.id) {
                if (current.leftChild == null) {
                    // make insertion
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild; //if left child is not null  make left branch

            } else {
                if (current.rightChild == null) {
                    // make insertion
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;//if left child is not null  make  branch right
            }

        }
    }

    void preOrderTraversal(TreeNode root){
        // termination
        if(root==null) return;
        System.out.println(root.name); //visit perform operation/ root node
        preOrderTraversal(root.leftChild); //recursive visit left subtree
        preOrderTraversal(root.rightChild); //recursive visit right subtree
    }
    void inOrderTraversal(TreeNode root){
        if(root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.name + " ");
        inOrderTraversal(root.rightChild);

    }
    void inPostOrderTraversal(TreeNode root){
        if (root == null) return;
        inPostOrderTraversal(root.leftChild);
        inPostOrderTraversal(root.rightChild);
        System.out.println(root.name + " ");
    }

    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TreeNode> queue = new LinkedList<>() ;
            queue.add(root);
        while(!queue.isEmpty()){//queue is not empty
            TreeNode toVisit=queue.poll();//mean front of element// as variable to print
            System.out.print(toVisit.name +" ");//  print out and visit element
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);//check if we have a left child and put in queue
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);//check if we have a right child and put in queue
        }
        }
    }



