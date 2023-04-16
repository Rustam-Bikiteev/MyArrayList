package org.aston;


/**
 * Allows to sort given list in ascending or alphabetical order.
 */
public class QuickSort {

    /**
     * Метод partition() returns index of separated array.
     * Using recursion, elements on the right and elements on the left divided to subarrays, until each subarray contains only 1 element
     * @param arrayList Initial array for sorting
     * @param begin     initial array index (first element).
     * @param end       last array index (last element)
     * @return returns sorted subarray (array).
     */
    public static <T extends Comparable<T>> MyArrayList<T> quickSort(MyArrayList<T> arrayList, int begin, int end) {

        if (begin < end) {
            int pivotIndex = partition(arrayList, begin, end);
            quickSort(arrayList, begin, pivotIndex - 1);
            quickSort(arrayList, pivotIndex + 1, end);
        }
        return arrayList;
    }

    /**
     * @param arrayList List for sorting.
     * @param begin     initial index.
     * @param end       end index.
     * @return returns pivotIndex for further separation of array.
     */
    private static <T extends Comparable<T>> int partition(MyArrayList<T> arrayList, int begin, int end) {
        T pivot = arrayList.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arrayList.get(j).compareTo(pivot) < 0) {
                i++;
                T temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(j));
                arrayList.set(j, temp);
            }
        }
        T temp = arrayList.get(i + 1);
        arrayList.set(i + 1, arrayList.get(end));
        arrayList.set(end, temp);
        return i + 1;
    }


}
