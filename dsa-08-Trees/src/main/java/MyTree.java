import com.sun.source.tree.WhileLoopTree;
import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    // need just rood
    TNode root;
    public MyTree(){//NoArgsConstructor
    }
    void insert(int value) {//start with root with void
        TNode newNode = new TNode(value);//TN assign with value new TNode

        if (root == null) {//if root is null //root is new node
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {//compared value
            if (value <= current.value) {//value can  be less than value

                if (current.leftChild == null) {//another check
                    // if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }//if leftChild is notnull branch into left subtree
                current = current.leftChild;//assign
            } else {//value is grater than current value

                if (current.rightChild == null) {
                    //if right is null insert there!!

                    current.rightChild = newNode;//inserted child
                    break;
                }//if leftChild is notnull branch into rightsubtree
                current = current.rightChild;
            }
        }
    }

    //PreOrderTraversal of the tree
    //Root -left-right
    void preOrderTraversal(TNode root){//recursive methode
        if(root ==null) return;//termination
        System.out.print(root.value+", ");//visit root
        preOrderTraversal(root.leftChild);//operations visit left subtree
        preOrderTraversal(root.rightChild);//visit tight subtree
    }
    void inOrderTraversal(TNode root){//send root node
        if(root==null)return;//terination
        inOrderTraversal(root.leftChild);//go left until you find null
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }
    void postOrderTraversal(TNode root){
        if(root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value+", ");

    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode> queue= new LinkedList<>();
        queue.add(root);//add root to queue
        while(!queue.isEmpty()){//queue is not empty
            TNode toVisit=queue.poll();//mean front of element
            System.out.print(toVisit.value+", ");//  print out and visit element
            if( toVisit.leftChild!=null) queue.add(toVisit.leftChild);//check if we have a left child and put in queue
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);//check if we have a right child and put in queue
        }
    }
    public boolean contains(int value) {
        if (root == null) return false;//starting from root
        TNode current = root;
        while (current!=null){
        if(value< current.value)current=current.leftChild; //branch left
        else if (value> current.value)  current=current.rightChild;

        else return true;
        }
        return false;

    }

    public boolean isLeaf(TNode node){//leaf check
        return node.leftChild==null && node.rightChild ==null;//if is correct return true
    }

   public  void printLeaves(TNode root){

        if (root==null) return;
        //perform visit on root
       if(isLeaf(root)) System.out.print(root.value+ ", ");//just change order for traversal
       //Recursively branch left subtree
       printLeaves(root.leftChild);
       printLeaves(root.rightChild);
       //branch right subtree

    }


}