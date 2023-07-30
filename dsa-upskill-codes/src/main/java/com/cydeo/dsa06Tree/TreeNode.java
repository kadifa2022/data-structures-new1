package com.cydeo.dsa06Tree;

public class TreeNode {
    // Data
    String name;
    String lastName;
    int id;

    //reference for left child
    TreeNode leftChild;

    //reference for right child
    TreeNode rightChild;

    public TreeNode(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;

    }
}
