package BinarySearchTree;

public class BSTNode implements BSTNodeInterface {

    private BSTNode left;
    private BSTNode right;
    private Comparable element;
    private BSTNode parent;


    public BSTNode(Comparable element) {
        this(null, null, element, null);
    }

    public BSTNode(BSTNode left, BSTNode right, Comparable element, BSTNode parent) {
        this.left = left;
        this.right = right;
        this.element = element;
        this.parent = parent;
    }

    @Override
    public Comparable getData() {
        return element;
    }

    @Override
    public void setData(Comparable newData) {
        this.element = newData;
    }

    @Override
    public BSTNodeInterface getLeftChild() {
        return left;
    }

    @Override
    public BSTNodeInterface getRightChild() {
        return right;
    }

    @Override
    public void setLeftChild(BSTNodeInterface leftChild) {
        this.left = (BSTNode) leftChild;
    }

    @Override
    public void setRightChild(BSTNodeInterface rightChild) {
        this.right = (BSTNode) rightChild;
    }

    @Override
    public boolean hasLeftChild() {
        return left != null;
    }

    @Override
    public boolean hasRightChild() {
        return right != null;
    }

    @Override
    public boolean isLeaf() {
        return (!hasLeftChild()) && (!hasRightChild());
    }
    

    @Override
    public int getNumberOfNodes() {
        return getNumberOfNodes(this);
    }

    private int getNumberOfNodes(BSTNode node) {
        int leftNumber = 0;
        int rightNumber = 0;

        if (left != null) {
            leftNumber = left.getNumberOfNodes();
        }

        if (right != null) {
            rightNumber = right.getNumberOfNodes();
        }

        return 1 + leftNumber + rightNumber;
    }

    @Override
    public int getHeight() {
        return getHeight(this);
    }


    private int getHeight(BSTNode node) {
        int height = 0;
        if (node != null)
            height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        return height;
    }

    @Override
    public BSTNodeInterface copy() {
        BSTNode newRoot = new BSTNode(element);
        if (left != null)
            newRoot.left = (BSTNode) left.copy();
        if (right != null)
            newRoot.right = (BSTNode) right.copy();
        return newRoot;
    }


}
