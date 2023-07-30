package com.cydeo.dsa06Tree;

public class TreeApp1 {
    public static void main(String[] args) {
        TreeClass tree = new TreeClass();
        System.out.println(tree.root);
        tree.insert(new TreeNode("John", "Locke" ,5));
        tree.insert(new TreeNode("Sam ", "oZZ" ,3));
        tree.insert(new TreeNode("Julia", "Smith" ,4));
        tree.insert(new TreeNode("AL", "Locke" ,6));
        tree.insert(new TreeNode("Jas", "Locke" ,9));

        tree.preOrderTraversal(tree.root);
    }
}
