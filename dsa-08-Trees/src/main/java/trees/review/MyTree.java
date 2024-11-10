package trees.review;

public class MyTree {
    TNode root;

    public MyTree() {// NoArgConstructor
    }

    void insert(int value){
        TNode newNode = new TNode(value);
        if(root == null) {// if root is null will be inserted in root as newNode
            root = newNode;
            return;
        }
        TNode current = root; // starting from root
        while(true){
            if(value <= current.value){ // branch left
                if(current.leftChild == null){
                    // if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }
                current= current.leftChild;
            } else{
                if(current.rightChild == null){
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
    void preOrderTraversal(TNode root){
        if(root == null) return;
        System.out.println(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);

    }
}
