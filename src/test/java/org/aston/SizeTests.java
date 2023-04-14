package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
Tests to check the size method
 */
public class SizeTests {
    /**
     Adds 5 element, value 5 is expected.
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
     * Adds 0 element, value 0 is expected.
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
     * Adds 13 element, value 13 is expected.
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
