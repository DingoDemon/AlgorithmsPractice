package BinarySearchTree;

public class BST implements BSTInterface {

    private BSTNodeInterface root;//根节点


    @Override
    public void insertNode(Comparable comparable) {
        root = insertNode(comparable, root);
    }

    private BSTNode insertNode(Comparable comparable, BSTNodeInterface node) {
        if (node == null) {
            return new BSTNode(null, null, comparable, null);
        }
        int compareResult = comparable.compareTo(node.getData());
        if (compareResult > 0) {
            node.setRightChild(insertNode(comparable, node.getRightChild()));
        } else if (compareResult < 0) {
            node.setLeftChild(insertNode(comparable, node.getLeftChild()));
        } else {
            System.out.println("comparable = [" + comparable + "], node = [" + node + "]");
        }
        return (BSTNode) node;
    }

    @Override
    public void deleteNode(Comparable comparable) {

    }

    @Override
    public boolean contains(Comparable comparable) {
        return contains(comparable, root);
    }


    private boolean contains(Comparable comparable, BSTNodeInterface node) {
        if (node == null)
            return false;

        int compareResult = comparable.compareTo(node.getData());
        if (compareResult < 0) {
            return contains(comparable, node.getLeftChild());
        } else if (compareResult > 0) {
            return contains(comparable, node.getRightChild());
        } else return true;

    }

    @Override
    public Comparable findMax() {
        return findMax(root).getData();
    }


    private BSTNodeInterface findMax(BSTNodeInterface node) {
        if (node == null)
            return null;
        else if (node.hasRightChild()) {
            return findMax(node.getRightChild());
        }
        return node;
    }

    @Override
    public Comparable findMin() {
        return findMin(root).getData();
    }

    private BSTNodeInterface findMin(BSTNodeInterface node) {
        if (node == null)
            return null;
        while (node.hasLeftChild()) {
            node = node.getLeftChild();
        }
        return node;
    }

    @Override
    public Comparable getRootData() {
        return root.getData();
    }

    @Override
    public int getHeight() {
        return root == null ? 0 : root.getHeight();
    }


    @Override
    public int getNumberOfNodes() {

        return root == null ? 0 : root.getNumberOfNodes();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {

    }

    public void printTree() {
        printTree((BSTNode) root);
    }

    private void printTree(BSTNode node) {//中序遍历,输出sorted
        if (node == null) return;
        printTree((BSTNode) node.getLeftChild());
        System.out.println(node.getData());
        printTree((BSTNode) node.getRightChild());
    }
}
