package org.aston;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to check the add method.
 */
public class AddTests {
    MyArrayList<Integer> arrayList;

    @BeforeEach
    public void setUp(){
        arrayList = new MyArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
    }

    /**
     * the usual test with adding 4 elements to the array.
     */
    @Test
    public void testAdd() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Array capacity expansion test, more than 10 elements are added (initial capacity) expected to expand capacity to 16.
     */
    @Test
    public void testAddMoreThanInitCapacity() {
        //Given
        MyArrayList<Integer> actualList =arrayList;
        actualList.add(5);
        actualList.add(9);
        actualList.add(100);
        actualList.add(-5);
        actualList.add(0);
        actualList.add(35);
        actualList.add(33);
        actualList.add(456);
        actualList.add(-23);
        //When
        int expected =(10 * 3) / 2 + 1;
        //Then
        assertEquals(expected, actualList.capacity());
    }

    /**
     * Test for adding an element to the beginning of the list.
     */
    @Test
    public void testAddIndexAtZero() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.add(0, 15);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{15,2,3,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }

    /**
     * Test for adding an element to the middle of the list.
     */
    @Test
    public void testAddIndexAtMiddle() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.add(2, 20);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,20,5,8});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }
    /**
     * Test for adding an element to the end of the list.
     */
    @Test
    public void testAddIndexAtEnd() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.add(4, 100);
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{2,3,5,8,100});
        Integer[] expectedArray = new Integer[expectedList.size()];
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), actualList.toArray(actualArray));
    }
    /**
     * Test for adding an element to index, out of size bounds. Expected to receive an IndexOutOfBoundsException exception.
     */
    @Test
    public void testAddIndexOutOfBounds() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        //When
        //Then
        assertThrows(IndexOutOfBoundsException.class, () -> actualList.add(7,100));
    }

}
