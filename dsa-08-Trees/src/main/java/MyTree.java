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

    }   }