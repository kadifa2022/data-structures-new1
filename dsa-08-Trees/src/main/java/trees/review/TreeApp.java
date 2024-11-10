package trees.review;

public class TreeApp {
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        int[] num = new int[]{10, 5, 8, 20, 4,9,5, 17, 42,47,29,29,1};

        for (int i = 0; i < 12; i++) { //<=for same number to be inserted left in tree
            myTree.insert(num[i]);
        }
        VisualizeTree.printTree(myTree.root, null, false);
    }

}
