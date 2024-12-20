package trees.review;

public class TreeApp {
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        int[] num = new int[]{10, 5, 8, 20, 4,9,5, 17, 42,47,29,1};

        for (int i = 0; i < 12; i++) { //<=for same number to be inserted left in tree
            myTree.insert(num[i]);
        }
        VisualizeTree.printTree(myTree.root, null, false);
        System.out.println();
//        System.out.println("pre order traverse: ");
//        myTree.preOrderTraversal(myTree.root);
//        System.out.println();
//        System.out.println("In Order traversal: ");
//        myTree.inOrderTraversal(myTree.root);
//        System.out.println();
//        System.out.println("Post Order traversal: ");
//        myTree.postOrderTraversal(myTree.root);
//        System.out.println();
//        System.out.println("Level order Breadth first: ");
//        myTree.levelOrderTraversal();
        System.out.println(myTree.contains(88));
        myTree.printLeaves(myTree.root);
        System.out.println();
        System.out.println("Count of leaves: " + myTree.countLeaves(myTree.root));
        System.out.println("Find sum of the leaves : "+ myTree.findSumOfLeaves(myTree.root));
        System.out.println("Height of the Tree: "+ myTree.heightOfTheTree(myTree.root));
        System.out.println("Sum of the Node Depths is: " + myTree.calculateNodeDepthSum());
        System.out.println("Sum of all Nodes in myTree: " + myTree.sumOfAllNodes());
    }

}
