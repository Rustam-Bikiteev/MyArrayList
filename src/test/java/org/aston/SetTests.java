package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * ����� �� �������� ������ Set
 */
public class SetTests {

    /**
     * ���� �� ������� �������� � �������� ������.
     */
    @Test
    public void testSetAtMid() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(0);
        actualList.add(5);
        actualList.add(9);
        actualList.add(11);
        actualList.add(47);
        actualList.set(2, 4);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{0,5,4,11,47});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray),actualList.toArray(actualArray));
    }

    /**
     * ���� �� ������� �������� � ������ ������.
     */
    @Test
    public void testSetAtBegin() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(0);
        actualList.add(5);
        actualList.add(9);
        actualList.add(11);
        actualList.add(47);
        actualList.set(0, 5);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{5,5,9,11,47});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray),actualList.toArray(actualArray));
    }

    /**
     * ���� �� ������ �������� � ����� ������.
     */
    @Test
    public void testSetAtEnd() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(0);
        actualList.add(5);
        actualList.add(9);
        actualList.add(11);
        actualList.add(47);
        actualList.set(4, 544);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{0,5,9,11,544});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray),actualList.toArray(actualArray));
    }

    /**
     * ���� �� ������ �������� �� ��������� �������. ��������� �������� IndexOutOfBoundsException exception.
     */
    @Test
    public void testSetOutOfBounds() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(0);
        actualList.add(5);
        actualList.add(9);
        actualList.add(11);
        actualList.add(47);
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.set(7,55));
    }
}
