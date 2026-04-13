//Miguel Wentzel
//4478677
//Practical 1 Term 2
//Question 1
class BinaryTreeNode<E> {
    // Private attributes for encapsulation
    private E value;
    private BinaryTreeNode<E> left;
    private BinaryTreeNode<E> right;

    // Default constructor
    public BinaryTreeNode() {
        this.value = null;
        this.left = null;
        this.right = null;
    }

    // Loaded constructor
    public BinaryTreeNode(E value, BinaryTreeNode<E> left, BinaryTreeNode<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // Getters
    public E getValue() {
        return value;
    }

    public BinaryTreeNode<E> getLeft() {
        return left;
    }

    public BinaryTreeNode<E> getRight() {
        return right;
    }

    // Setters
    public void setValue(E value) {
        this.value = value;
    }

    public void setLeft(BinaryTreeNode<E> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<E> right) {
        this.right = right;
    }
}
