package trees.review;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {// NoArgConstructor
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {// if root is null will be inserted in root as newNode
            root = newNode;
            return;
        }
        TNode current = root; // starting from root
        while (true) {
            if (value <= current.value) { // branch left
                if (current.leftChild == null) {
                    // if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    //if right child insert there!!
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    //PreOrder Traversal of the tree
    // ROOT - LEFT - RIGHT
    void preOrderTraversal(TNode root) {// we are sending root
        if (root == null) return;// termination
        System.out.print(root.value + ", ");// visit root
        preOrderTraversal(root.leftChild);//visit left subtree
        preOrderTraversal(root.rightChild);//visit right subtree

    }

    void inOrderTraversal(TNode root) {
        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TNode root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }

    //Breadth first
    void levelOrderTraversal() {// we don't need to send anything because is not recursive
        if (root == null) return;// if is empty return
        Queue<TNode> queue = new LinkedList<>();// create queue
        queue.add(root);// add root to the queue
        while (!queue.isEmpty()) {// if queue is not empty /visit
            TNode toVisit = queue.poll(); // node that we called visit // front element of the queue
            System.out.print(toVisit.value + ", "); // print and then check if is there elements if yes put them in queue
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);// visit left and add elements in queue
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);/// visit right and add -||-
        }

    }

    boolean contains(int value) {
        if (root == null) return false;
        TNode current = root;
        while (current != null) {
            if (value < current.value) current = current.rightChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }
        return false;
    }
}