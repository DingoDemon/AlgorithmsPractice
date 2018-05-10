package BinarySearchTree;

public interface BSTInterface extends TreeInterface {

    void insertNode(Comparable comparable);


    void deleteNode(Comparable comparable);

    boolean contains(Comparable comparable);


    Comparable findMax();


    Comparable findMin();



}
