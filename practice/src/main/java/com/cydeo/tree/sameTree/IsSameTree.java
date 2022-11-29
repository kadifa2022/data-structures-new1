package com.cydeo.tree.sameTree;



public class IsSameTree {

    public static boolean isSameTree(TreeN root1, TreeN root2) {


        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.value != root2.value) {
            return false;
        }
        boolean isLeftTrue = isSameTree(root1.leftChild, root2.rightChild);
        boolean isRightTrue = isSameTree(root1.leftChild, root2.rightChild);

        return isLeftTrue &&isRightTrue;
    }
}