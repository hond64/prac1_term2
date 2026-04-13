//Miguel Wentzel
//4478677
//Practical 1 Term 2
//Question 2
public class Main {
    public static void main(String[] args) {

        // =========================
        // Tree 1: Characters
        // Level order: a, b, c, d, e
        // =========================
        BinaryTree<Character> bt1 = new BinaryTree<>();

        BinaryTreeNode<Character> a = new BinaryTreeNode<>('a');
        BinaryTreeNode<Character> b = new BinaryTreeNode<>('b');
        BinaryTreeNode<Character> c = new BinaryTreeNode<>('c');
        BinaryTreeNode<Character> d = new BinaryTreeNode<>('d');
        BinaryTreeNode<Character> e = new BinaryTreeNode<>('e');

        // Connect nodes
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);

        // Set root
        bt1.setRoot(a);
        bt1.setSize(5);


        // =========================
        // Tree 2: Doubles
        // Level order: 3.4, -1.5, 2.9, -9.3
        // =========================
        BinaryTree<Double> bt2 = new BinaryTree<>();

        BinaryTreeNode<Double> n1 = new BinaryTreeNode<>(3.4);
        BinaryTreeNode<Double> n2 = new BinaryTreeNode<>(-1.5);
        BinaryTreeNode<Double> n3 = new BinaryTreeNode<>(2.9);
        BinaryTreeNode<Double> n4 = new BinaryTreeNode<>(-9.3);

        // Connect nodes
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        // n2 right = null automatically

        // Set root
        bt2.setRoot(n1);
        bt2.setSize(4);


        // =========================
        // TEST OUTPUT (Optional)
        // =========================
        System.out.println("Trees created successfully!");
    }
}
