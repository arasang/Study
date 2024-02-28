package park.sangeun.codestudy.datastructure.other.arrayqueue;

import park.sangeun.codestudy.common.Queue;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] array = {};
    private int size = 0;

    private int front = 0;
    private int rear = 0;

    public ArrayQueue() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = 0;
    }

    public ArrayQueue(int capacity) {
        this.array = new Object[capacity];
        this.front = 0;
        this.rear = 0;
    }



    @Override
    public boolean offer(E data) {
        if ((rear + 1) % array.length == front) {
            // 마지막의 다음칸이 front인지 확인
            resize(array.length * 2);
        }

        rear = (rear + 1) % array.length;
        array[rear] = data;
        size++;

        return true;
    }

    @Override
    public E peek() { // 큐의 첫번쨰 데이터를 조회만 함
        if (size == 0) {
            return null;
        }

        return (E) array[(front + 1) % array.length];
    }

    @Override
    public E poll() { // 큐의 첫번쨰 데이터를 조회하고 삭제함
        if (size == 0) {
            return null;
        }
        int idxFirstData = (front + 1) % array.length;
        E peekData = (E) array[idxFirstData];

        array[idxFirstData] = null;
        front = idxFirstData;

        size--;

        // 용적이 과하게 남으면 어떡하지 ? 1/2토막 내자
        if (array.length > DEFAULT_CAPACITY && size < array.length / 4) {
            resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
        }
        return peekData;
    }

    private void resize(int capacity) { // 리스트 사이즈 동적으로 조절
        // 만약 용적 3 -> 4으로 늘리는 경우
        // [1,2(rear), null(front)]-> [null(front),1,2(rear),null]
        // 어떻게 생겨먹었던간에 idxFront = 0이 된다.
        // front의 다음부터 데이터가 있으므로 front 다음 데이터부터 1로 들어가면 됨.
        int arrayCapacity = array.length;

        Object[] newArray = new Object[capacity];
        newArray[0] = null;

        for (int i = 1, z = front + 1; i <= size; i++, z++) {
            newArray[i] = array[z % arrayCapacity]; // front는 비어있으므로 첫번째부터 데이터 세팅
        }

        array = newArray;

        front = 0;
        rear = size; // 0번째는 front니까 데이터가 있는 인덱스랑 사이즈가 같음.

    }

    public E remove() {
        E data = poll();

        if (data == null) throw new NoSuchElementException();

        return data;
    }

    public E element() {
        E data = peek();

        if (data == null) throw new NoSuchElementException();

        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contain(E data) {
        if (size == 0) return false;
        int idxFirstVal = (front + 1) % array.length;
        for (int i=0, z = idxFirstVal; i<size; i++, z = (z+1) % array.length) {
            if (data.equals(array[z])) return true;
        }

        return false;
    }

    public void clear() {
        for (int i=0; i<size; i++) {
            array[i] = null;
        }

        front = rear = size = 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<array.length; i++) {
            builder.append(array[i] + " / ");
        }

        builder.append("\n");
        builder.append("front : " + front);
        builder.append("rear : " + rear);
        builder.append("size : " + size);
        return builder.toString();
    }
}
