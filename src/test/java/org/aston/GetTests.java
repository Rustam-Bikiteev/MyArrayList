package org.aston;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test to check the get method
 */
public class GetTests {

    MyArrayList<Integer> arrayList;

    @BeforeEach
    public void setUp(){
        arrayList = new MyArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(8);
    }

    @Test
    /**
     * Test to get a value from the middle of the list.
     */
    public void testGetMiddle() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
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
        MyArrayList<Integer> actualList =arrayList;
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
        MyArrayList<Integer> actualList = arrayList;
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
        MyArrayList<Integer> actualList = arrayList;
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.get(9));
    }

}
