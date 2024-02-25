package park.sangeun.codestudy.datastructure.ArrayList;

import park.sangeun.codestudy.common.List;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = {}; // new Object[]{}와 무슨 차이지 ?

    private int size = 0;
    private Object[] array;

    public ArrayList() {
        this.size = DEFAULT_CAPACITY;
        array = new Object[]{};
    }

    public ArrayList(int capacity) {
        array = new Object[capacity];
        size = 0;
    }

    private void resize() { // 배열의 추가나 삭제 시 배열의 길이를 변경
        if (Arrays.equals(array, EMPTY_ARRAY)) { // 아무 데이터도 없는 경우.
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        int new_capacity = -1;
        if (size == array.length) { // 사이즈랑 용적이 같은 경우
            new_capacity = array.length * 2;
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, new_capacity));
        } else if (size < array.length / 2) { // 사이즈가 용적의 절반보다 작을 경우
            new_capacity = array.length / 2;
            array = Arrays.copyOf(array, new_capacity);
        }

    }

    @Override
    public void addFirst(E data) {
        add(0, data);
    }

    @Override
    public void add(E data) {
        if (size == array.length) resize();
        array[size] = data;
        size++;
    }

    @Override
    public void add(int index, E data) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == size) {
            add(data);
        } else {
            if (size == array.length) resize();
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = data;
            size++;
        }
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void set(int index, E data) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        array[index] = data;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size; i++) {
            array[i] = array[i+1];
        }

        size--;

        resize();
    }

    @Override
    // 1,2,3,3 remove("3") -> remove(2) -> 4 > 2까지 실행. array[3] = array[4] array
    public void remove(E data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                remove(i);
                break;
            }
        }
    }

    @Override
    public void clear() {
        array = EMPTY_ARRAY;
        size = 0;
    }

    public void removeAll(E data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                remove(i);
            }
        }
    }

    @Override
    public boolean contain(E data) {
        if (size == 0) throw new NoSuchElementException();

        for (int i = 0; i < size; i++) {
            if (array[i] == data) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int indexOf(E data) {
        int index = -1;
        for (int i=0; i<size; i++) {
            if (array[i] == data) index = i;
        }

        if (index == -1) throw new NoSuchElementException();
        else return index;
    }
}
