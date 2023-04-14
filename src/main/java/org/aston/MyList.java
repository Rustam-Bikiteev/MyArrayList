package org.aston;


/**
 * Interface List.
 * Provides standard methods to operate with the data inside the List.
 */
public interface MyList<T> {
    /**
     * adds the new element t to the list.
     */
    void add(T t);

    /**
     * adds the new element t to the list by its index.
     */
    void add(int index, T t);

    /**
     * set the new value over the old value by the index.
     */
    void set(int index, T t);

    /**
     * delete value from the list by index.
     */
    T delete(int index);

    /**
     * returns value from the list by the index.
     */
    T get(int index);

    /**
     * returns the size of the list
     */
    int size();

    /**
     * returns the capacity of the list
     */
    int capacity();

    /**
     * transform the list to an array with the same values inside.
     */
    T[] toArray(T[] t);

}
