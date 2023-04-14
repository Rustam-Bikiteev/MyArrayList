package org.aston;


/**
 * Класс, реализующий быструю сортировку массива.
 */
public class QuickSort {

    /**
     * Метод partition() возвращает индекс разделенного массива.
     * Рекурсивно, подмассивы справа и слева от индекса (pivotIndex) делятся на подмассивы,
     * пока не останется 1 элемент в каждом подмассиве.
     *
     * @param arrayList исходный массив для сортировки.
     * @param begin     начальный индекс массива.
     * @param end       конечный индекс массива.
     * @return возвращает отсортированный массив.
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
     * В качестве Pivot берется последний элемент массива.
     * Далее в цикле, начиная с начальнойго элемента begin (не обязательно 0) сравнивается сравнивается Pivot,
     * идет по порядку, как только находится элемент меньше Pivot, он меняется с начальным элементом,
     * начальный эелемент инкрементируется. В конце концов, Pivot вставляется между элементами, группами элементов,
     * которые больше и именьше него, соответственно меньшие элементы оказываются справа, большие - слева.
     *
     * @param arrayList Массив для сортировки.
     * @param begin     начальный индекс массива.
     * @param end       конечный индекс массива.
     * @return возвращает
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
