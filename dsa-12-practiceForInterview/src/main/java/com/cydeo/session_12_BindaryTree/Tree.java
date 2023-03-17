package com.cydeo.session_12_BindaryTree;



public class Tree {
    private Node root;


    void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value <= current.value) {

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


    }


