package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 ����� ��� �������� ������ size.
 */
public class SizeTests {
    /**
     ��������� � ������ 5 ��������, ������� ������ 5.
     */
    @Test
    public void testSize() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(0);
        actualList.add(5);
        actualList.add(9);
        actualList.add(11);
        actualList.add(47);
        //When
        int expected = 5;
        int actual = actualList.size();
        //Then
        assertEquals(expected, actual);
    }

    /**
     * ���� � ������� ������� ������. ������� �������� 0.
     */
    @Test
    public void testSizeWithZeroValues() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();

        //When
        int expected = 0;
        int actual = actualList.size();
        //Then
        assertEquals(expected, actual);
    }

    /**
     * ���� � ������� ������ ����� 10 (13). ������� �������� 13.
     */
    @Test
    public void testSizeWithMoreThan10Values() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(0);
        actualList.add(5);
        actualList.add(9);
        actualList.add(11);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        actualList.add(47);
        //When
        int expected = 13;
        int actual = actualList.size();
        //Then
        assertEquals(expected, actual);
    }

}
