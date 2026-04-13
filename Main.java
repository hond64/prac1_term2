//Miguel Wentzel
//4478677
//Practical 1 Term 2
//Question 2
public class Main {
    public static void main(String[] args) {
        // Tree 1: a, b, c, d, e
        BinaryTreeNode<String> nodeD = new BinaryTreeNode<>("d", null, null);
        BinaryTreeNode<String> nodeE = new BinaryTreeNode<>("e", null, null);
        BinaryTreeNode<String> nodeB = new BinaryTreeNode<>("b", nodeD, nodeE);
        BinaryTreeNode<String> nodeC = new BinaryTreeNode<>("c", null, null);
        BinaryTreeNode<String> nodeA = new BinaryTreeNode<>("a", nodeB, nodeC);

        BinaryTree<String> bt1 = new BinaryTree<>(5, nodeA);

        // Tree 2: 3.4, -1.5, 2.9, -9.3
        BinaryTreeNode<Double> nodeNeg9_3 = new BinaryTreeNode<>(-9.3, null, null);
        BinaryTreeNode<Double> node2_9 = new BinaryTreeNode<>(2.9, null, null);
        BinaryTreeNode<Double> nodeNeg1_5 = new BinaryTreeNode<>(-1.5, nodeNeg9_3, null);
        BinaryTreeNode<Double> node3_4 = new BinaryTreeNode<>(3.4, nodeNeg1_5, node2_9);

        BinaryTree<Double> bt2 = new BinaryTree<>(4, node3_4);

        // Print level order traversal for both trees
        System.out.println("bt1 Level Order:");
        printLevelOrder(bt1.getRoot());

        System.out.println("\nbt2 Level Order:");
        printLevelOrder(bt2.getRoot());
    }

    // Helper method for level order traversal
    public static <E> void printLevelOrder(BinaryTreeNode<E> root) {
        if (root == null) return;

        java.util.Queue<BinaryTreeNode<E>> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<E> current = queue.poll();
            System.out.print(current.getValue() + " ");

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
    }
}

