package org.aston;


import java.util.Arrays;

/**
 * Реализует методы интерфейса List:
 * get(int index) - возвращает элемент массива по индексу.
 * set(int index, T t) - заменяет элемент с индексом index в массиве.
 * delete(int index) - удаляет элемент из массива по индексу.
 * int size() - возвращает текущий размер массива (количество элементов).
 * int capacity() - возвращает текущую емкость массива.
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
     * добавляет элемент в массив. Если длина достигнет значения емкости, емкость автоматически расширится.
     *
     * @param t значение элемента, добавляется в конец массива.
     */
    @Override
    public void add(T t) {
        if (size == capacity) {
            extendCapacity();
        }
        elementData[size++] = t;
    }

    /**
     * добавляет элемент в массив по номеру индекса.
     *
     * @param index индекс, на место которого будет вставлено значение t со сдвигом вправо.
     * @param t     значениеЮ которое будет вставлено в массив.
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
     * @param index указывается индекс, по которому будет возвращено значение.
     * @return возвращает значение, находящееся по индексу index.
     */
    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elementData[index];
    }


    /**
     * устанавливает заданное значение на место заданного индекса. Значение перезаписывается.
     *
     * @param index индекс, на место которого будет записано новое значение
     * @param t     новое значение, которое будет записано на индекс index.
     */
    @Override
    public void set(int index, T t) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elementData[index] = t;
    }

    /**
     * удаляет значенее по указанному индексу. Массив сдвигается влево. Последнее значение массива остается Null.
     *
     * @param index Индекс, по которому будет удалено значение.
     * @return возвращает удаленное значение.
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
     * @return возвращает размер массива.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @return возвращает емкость массива.
     */
    @Override
    public int capacity() {
        return capacity;
    }

    /**
     * Преобразует лист со значениями в массив с такими же значениями.
     *
     * @param t массив, в который будут записаны данные из листа.
     * @return - возвращает массив с таким же набором элементов как и в исходном листе.
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
     * метод расширяет емкость массива при переполнении массива, при добавлении новых значений.
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

