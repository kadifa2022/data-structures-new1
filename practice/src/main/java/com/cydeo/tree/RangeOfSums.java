package com.cydeo.tree;


import java.util.Stack;

public class RangeOfSums {

    public class TNode {
        int val;
        TNode left;
        TNode right;


        public TNode(int val) {
            this.val = val;
        }

        public static void main(String[] args) {

//
//            TNode root = new TNode (10);
//
//
//            System.out.println(rangeOfSum(10,7,15));
//


        }

        public static int rangeOfSum(TNode root, int low, int high) {
            int sum = 0;
            Stack<TNode> stack = new Stack<>();
            stack.push(root);//10
            while (!stack.isEmpty()) {
                TNode current = stack.pop();//popped it and comparing the current

                if (current.val >= low && current.val < high) {
                    sum += current.val;
                }
                if (low < current.val) {
                    stack.push(current.left);
                }
                if (current.val < high) {
                    stack.push(current.right);
                }

            }
            return sum;
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
                    if (low < node.val)
                        stack.push(node.left);
                    if (node.val < high)
                        stack.push(node.right);

                }
            }
            return ans;
        }


    }
}