package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты на проверу метода add.
 */
public class AddTests {

    /**
     * обычный тест с добавлением 4 элементов в массив.
     */
    @Test
    public void testAdd() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(5);
        actualList.add(8);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Тест на расширение емкости массива, добавляется больше, чем 10 элементов (изначальная емкость) ожидается расширение по формуле до 16.
     */
    @Test
    public void testAddMoreThanInitCapacity() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(5);
        actualList.add(5);
        actualList.add(9);
        actualList.add(100);
        actualList.add(-5);
        actualList.add(0);
        actualList.add(35);
        actualList.add(8);
        actualList.add(33);
        actualList.add(456);
        actualList.add(-23);
        //When
        int expected =(10 * 3) / 2 + 1;
        //Then
        assertEquals(expected, actualList.capacity());
    }

    /**
     * Тест на добавление элемента в начало списка.
     */
    @Test
    public void testAddIndexAtZero() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(0, 15);
        actualList.add(5);
        actualList.add(8);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{15,2,3,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Тест на добавление элемента в середину списка.
     */
    @Test
    public void testAddIndexAtMiddle() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(5);
        actualList.add(8);
        actualList.add(2, 20);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,20,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }
    /**
     * Тест на добавление элемента в конец списка.
     */
    @Test
    public void testAddIndexAtEnd() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(5);
        actualList.add(8);
        actualList.add(4, 100);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,5,8,100});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }
    /**
     * Тест на добавление элемента за пределы индекса. Ожидается получить IndexOutOfBoundsException exception.
     */
    @Test
    public void testAddIndexOutOfBounds() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(5);
        actualList.add(8);
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.add(7,100));
    }

}
