package JavaEssential10.myArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class MyArrayList<T> {
    private T[] array;

    public MyArrayList() {
        this.array = (T[]) new Object[0];
    }

    public void add(T value) {
        T[] newArray = array;
        array = (T[]) new Object[newArray.length + 1];
        System.arraycopy(newArray, 0, array, 0, newArray.length);
        array[array.length - 1] = value;


    }

    public void clear() {
        array = (T[]) new Object[0];
    }

    public T get(int index) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public void set(int index, T value) {
        if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[index] = value;
    }
    public int indexOf(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        T[] newArray = array;
        array = (T[]) new Object[newArray.length - 1];
        System.arraycopy(newArray, 0, array, 0, index);
        System.arraycopy(newArray, index + 1, array, index, newArray.length - 1 - index);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public MyIterator myIterator() {
        return new MyIterator();
    }

    public class MyIterator implements ListIterator<T> {
        private int index = 0;
        private T[] array;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            return array[index++];
        }

        @Override
        public boolean hasPrevious() {
            return index >= 0;
        }

        @Override
        public T previous() {
            return array[index--];
        }

        @Override
        public int nextIndex() {
            if (index < array.length - 1) {
                return index + 1;
            }
            return index - 1;
        }

        @Override
        public int previousIndex() {
            if (index < 0) {
                return index - 1;
            }
            return -1;
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(index);
        }

        @Override
        public void set(T t) {
            MyArrayList.this.set(index, t);

        }

        @Override
        public void add(T t) {
            MyArrayList.this.add(t);

        }
    }
}
