package park.sangeun.codestudy.datastructure.linear.LinkedList;

public class LinkedListNode<E> {
    E data;
    LinkedListNode<E> nextNode;

    public LinkedListNode(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
