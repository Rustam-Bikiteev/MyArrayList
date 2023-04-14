package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test to check the get method
 */
public class GetTests {
    @Test

    /**
     * Test to get a value from the middle of the list.
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
     * Test to get a value from the beginning of the list.
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
     * Test to get a value from the end of the list.
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
     * Test for getting an element to index, out of size bounds. Expected to receive an IndexOutOfBoundsException exception.
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
