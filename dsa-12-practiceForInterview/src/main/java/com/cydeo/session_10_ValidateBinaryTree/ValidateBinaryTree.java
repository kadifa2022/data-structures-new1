package com.cydeo.session_10_ValidateBinaryTree;

public class ValidateBinaryTree {
    public static void main(String[] args) {


    TreeNode root = new TreeNode(5);
    root.left= new TreeNode(1);
    root.right= new TreeNode(4);
    root.right.left = new TreeNode(3);
    root.right.right= new TreeNode(6);
    System.out.println(isValidBST(root));


}

public static boolean isValidBST(TreeNode root){
        return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
}
public static boolean isValidBST(TreeNode root, long minValue, long maxValue){
        if(root == null) return true;
        if(root.val>=maxValue || root.val<=minValue) return false;

        return  isValidBST(root.left, minValue, root.val)
                && isValidBST(root.right,root.val, maxValue);
}
}
