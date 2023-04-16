package org.aston;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test to check delete method
 */
public class DeleteTests {

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
    /**
     * Checking if an element is removed from the middle of a list
     */
    @Test
    public void testDeleteMiddle() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.delete(2);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }
    /**
     * Checking if an element is removed from the beginning of a list
     */
    @Test
    public void testDeleteBegin() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.delete(0);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{3,15,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Checking if an element is removed from the end of a list
     */
    @Test
    public void testDeleteEnd() {
        //Given
        MyArrayList<Integer> actualList =arrayList;
        actualList.delete(4);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,15,5});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Test for deleting an element to index, out of size bounds. Expected to receive an IndexOutOfBoundsException exception.
     */
    @Test
    public void testDeleteOutOfBounds() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.delete(-5));
    }

}
