package org.aston;


import java.util.Arrays;

/**
 * Implements MyList interface methods:
 * Indexed List of data, can store and operate with data.
 */
public class MyArrayList<T> implements MyList<T> {
    private T[] elementData;
    private int size = 0;
    private int capacity = 10;

    public MyArrayList() {
        elementData = (T[]) new Object[capacity];
    }

    public MyArrayList(T[] elementData) {
        this.elementData = elementData;
        this.size = elementData.length;
        if (size >= capacity) {
            extendCapacity();
        }
    }

    /**
     * Adds element to List. If the Length is more than initial capacity, then extended.
     *
     * @param t Element value, added to the end of the List
     */
    @Override
    public void add(T t) {
        if (size == capacity) {
            extendCapacity();
        }
        elementData[size++] = t;
    }

    /**
     * Adds element to the List by the index.
     * @param index index, shows the place where will be put the value with the right shift.
     * @param t value to be put int hte List to index.
     */
    @Override
    public void add(int index, T t) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == capacity) {
            extendCapacity();
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = t;
        size++;
    }

    /**
     * @param index shows the index, from where the value should be taken.
     * @return returns the value, located by the index.
     */
    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elementData[index];
    }


    /**
     * Overwrite the value by the index.
     * @param index index, where the new value will be placed.
     * @param t  new value, which will be overwritten at specified index
     */
    @Override
    public void set(int index, T t) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elementData[index] = t;
    }

    /**
     * Deletes the value by the index. The list sifts to the left. The last right value becomes null;
     * @param index index, from where the value will be deleted.
     * @return returns the deleted value.
     */
    @Override
    public T delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedValue = elementData[index];
        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        size--;
        elementData[size] = null;
        return removedValue;
    }

    /**
     * @return returns the size of the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @return returns the capacity of the list
     */
    @Override
    public int capacity() {
        return capacity;
    }

    /**
     * Trasforms list to the array with the same values inside.
     *
     * @param t Array, to which new values will be placed from the list.
     * @return - returns the array with the same values as in the given list.
     */
    @Override
    public T[] toArray(T[] t) {
        if (t.length < size)
            return (T[]) Arrays.copyOf(elementData, size, t.getClass());
        System.arraycopy(elementData, 0, t, 0, size);
        if (t.length > size)
            t[size] = null;
        return t;
    }

    /**
     * Extends the capacity, when size become equal to the capacity. Uses formula: (capacity * 3) / 2 + 1.
     */
    private void extendCapacity() {
        int newCapacity = (capacity * 3) / 2 + 1;
        T[] newElementData = (T[]) new Object[newCapacity];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
        capacity = newCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return Arrays.equals(elementData, that.elementData);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elementData);
    }

}

