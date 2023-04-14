package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тесты на проверку метода delete.
 */
public class DeleteTests {
    /**
     * Проверка на удаление элемента из середины списка
     */
    @Test
    public void testDeleteMiddle() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        actualList.delete(2);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }
    /**
     * Проверка на удаление элемента из начала списка
     */
    @Test
    public void testDeleteBegin() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        actualList.delete(0);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{3,15,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Проверка на удаление элемента из конца списка
     */
    @Test
    public void testDeleteEnd() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        actualList.delete(4);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,15,5});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Тест на удаление элемента за пределами индекса. Ожидается получить IndexOutOfBoundsException exception.
     */
    @Test
    public void testDeleteOutOfBounds() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.delete(-5));
    }

}
