package com.cydeo.tree;

import com.cydeo.linkedList.Node;

import java.util.Stack;

public class RangeSumBST {
    int val;
    Node left;
    Node right;

    public RangeSumBST(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public class TNode {
        int val;
       TNode left;
       TNode right;


        public TNode(int val) {
            this.val = val;
        }


        public static int rangeSumBST(TNode root, int low, int high) {
            int ans = 0;
            Stack<TNode> stack = new Stack();
            stack.push(root);
            while (!stack.isEmpty()) {
                TNode node = stack.pop();
                if (node != null) {
                    if (low <= node.val && node.val <= high)
                        ans += node.val;
                    if (low < node.val) ;
                    stack.push(node.left);
                    if (node.val < high)
                        stack.push(node.right);
                }
            }
            return ans;

        }
    }

}