package park.sangeun.codestudy.datastructure.LinkedList;

import park.sangeun.codestudy.common.List;


public class LinkedList<E> implements List<E> {
    private LinkedListNode<E> header;
    private LinkedListNode<E> tail;
    private int size;

    public LinkedList() {
        header = new LinkedListNode<>(null);
        tail = new LinkedListNode<>(null);
        size = 0;
    }

    public LinkedListNode<E> search(int index) {
        if (size <= 0 || index >= size) throw new IndexOutOfBoundsException();
        else if (index == 0) return header;
        else if (index == size - 1) return tail;

        LinkedListNode<E> node = new LinkedListNode<>(null);
        for (int i = 0; i < index; i++) {
            if (i == 0) {
                node = header.nextNode;
            } else {
                node = node.nextNode;
            }
        }
        return node;
    }

    @Override
    public void add(E data) {
        if (data == null) {
            throw new NullPointerException();
        }

        if (size == 0) {
            addFirst(data);
            return;
        }

        LinkedListNode<E> newNode = new LinkedListNode<>(data);
        newNode.nextNode = null;

        tail.nextNode = newNode;
        tail = newNode;

        size++;
    }

    @Override
    public void addFirst(E data) {
        // 뭐가 됐던 맨 앞에 넣기로 함
        LinkedListNode<E> newNode = new LinkedListNode<>(data);
        if (size != 0) { // 데이터가 이미 존재함.
            LinkedListNode<E> originNode = header;
            newNode.nextNode = originNode;
            header = newNode;
        }

        if (size == 0) { // 처음 생성된 리스트
            newNode.nextNode = header;
            header = newNode;
            tail = header;
        }

        size++;
    }

    @Override
    public void add(int index, E data) { // 특정 위치에 밀어넣기
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            add(data);
        }

        LinkedListNode<E> newNode = new LinkedListNode<>(data);
        LinkedListNode<E> prevNode = search(index - 1);
        LinkedListNode<E> searchNode = search(index);

        newNode.nextNode = searchNode;
        prevNode.nextNode = newNode;

        System.out.println(searchNode);

        size++;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E data) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(E data) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contain(E data) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(search(i).data);
        }
        return builder.toString();
    }

}
