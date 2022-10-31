import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    // need just rood
    TNode root;
    public MyTree(){//NoArgsConstructor
    }
    void insert(int value) {//start with root with void
        TNode newNode = new TNode(value);//TN assign with value new TNode

        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {//value can  be less than value
                if (current.leftChild == null) {//another check
                    // if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;//assign
            } else {//value is grater than current value
                if (current.rightChild == null) {
                    //if right is null insert there!!
                    current.rightChild = newNode;//inserted child
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    //PreOrderTraversal of the tree
    //Root -left-right
    void preOrderTraversal(TNode root){
        if(root ==null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    void inOrderTraversal(TNode root){
        if(root==null)return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }
    void postOrderTraversal(TNode root){
        if(root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");

    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.print(toVisit.value+ ", ");
            if( toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }



}