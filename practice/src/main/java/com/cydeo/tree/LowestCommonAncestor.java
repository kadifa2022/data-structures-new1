package com.cydeo.tree;

public class LowestCommonAncestor {
    public static void main(String[] args) {

        TreeNode root;
        TreeNode p, q;
        root = getSampleTreeNode1();//root =13
        p= root.left.right;//-13
        q=root.left.left.left;//-25
       // VisualizeTree.printTree(root, null,false);
        System.out.println("Inputs: root node =>" + root.val + " p=> " + p.val+ " => "+ q.val + " expected output -10 ");
        System.out.println(lowestCommonAncestor(root, p, q).val);
    }
    static TreeNode getSampleTreeNode1(){
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-15);
        root.right =new TreeNode(0);
        root.left.left= new TreeNode(-22);
        root.left.right = new TreeNode(-13);
        root.left.left.left = new TreeNode(-25);
        return root;

    }

    static TreeNode getSampleTree2(){
        TreeNode root = new TreeNode(13);
        root.left=new TreeNode(5);
        root.right= new TreeNode(16);
        root.left.left=new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.left.right.left= new TreeNode(7);
        root.left.right.right = new TreeNode(10);
        root.right.left= new TreeNode(14);
        root.right.right= new TreeNode(28);
        return root;


    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);
        TreeNode current = root;
        while (root !=null){
            if(small> root.val){
                root=root.right;
            }else if(large < root.val){
                root = root.left;
            }else{
                return root;
            }
        }
        return null;

    }


}
/*
 Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined
between two nodes p and q as the lowest node in T that has both p and q as descendants
 (where we allow a node to be a descendant of itself).”



Example 1:


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [2,1], p = 2, q = 1
Output: 2

 */