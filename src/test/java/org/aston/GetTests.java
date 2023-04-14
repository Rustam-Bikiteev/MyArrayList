package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тесты на проверку метода get.
 */
public class GetTests {
    @Test

    /**
     * Тест на получение значения из середины списка.
     */
    public void testGetMiddle() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        //When
        int expected = 15;
        //Then
        assertEquals(expected, actualList.get(2));
    }
    /**
     * Тест на получение значения из начала списка.
     */
    @Test
    public void testGetBegin() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        //When
        int expected = 2;
        //Then
        assertEquals(expected, actualList.get(0));
    }

    /**
     * Тест на получение значения из конца списка.
     */
    @Test
    public void testGetEnd() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        //When
        int expected = 8;
        //Then
        assertEquals(expected, actualList.get(4));
    }
    /**
     * Тест на получение элемента за пределами индекса. Ожидается получить IndexOutOfBoundsException exception.
     */
    @Test
    public void testGetOutOfBound() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(2);
        actualList.add(3);
        actualList.add(15);
        actualList.add(5);
        actualList.add(8);
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.get(9));
    }

}
