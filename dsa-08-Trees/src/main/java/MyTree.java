public class MyTree {

    TNode root;
    public MyTree(){
    }
    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;//inserted child
                    break;
                }
                current = current.rightChild;
            }
        }

    }   }