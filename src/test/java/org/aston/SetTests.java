package org.aston;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests for checking the set method
 */
public class SetTests {

    MyArrayList<Integer> arrayList;

    @BeforeEach
    public void setUp(){
        arrayList = new MyArrayList<>();
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(47);
    }

    /**
     * Test to replace the element at the middle of the list.
     */
    @Test
    public void testSetAtMid() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.set(2, 4);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{0,5,4,11,47});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray),actualList.toArray(actualArray));
    }

    /**
     * Test to replace the element at the beginning of the list.
     */
    @Test
    public void testSetAtBegin() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.set(0, 5);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{5,5,9,11,47});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray),actualList.toArray(actualArray));
    }

    /**
     * Test to replace the element at the end of the list.
     */
    @Test
    public void testSetAtEnd() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.set(4, 544);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{0,5,9,11,544});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray),actualList.toArray(actualArray));
    }

    /**
     * Test for setting an element to index, out of size bounds. Expected to receive an IndexOutOfBoundsException exception.
     */
    @Test
    public void testSetOutOfBounds() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.set(7,55));
    }
}
