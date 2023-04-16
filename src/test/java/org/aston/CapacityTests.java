package org.aston;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты на проверку метода capacity.
 */
public class CapacityTests {

    MyArrayList<Integer> arrayList;

    @BeforeEach
    public void setUp(){
        arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
    }

    /**
     * Check for capacity before exceeding the extending threshold (initial value - 10)
     */
    @Test
    public void testCapacityBeforeExtend() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        //When
        int result = actualList.capacity();
        //Then
        assertEquals(10, result);
    }

    /**
     * Test for list with no values inside
     */
    @Test
    public void testCapacityZeroElements() {
        //Given
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        //When
        int result = arrayList.capacity();
        //Then
        assertEquals(10, result);
    }

    /**
     * Check for capacity, when the capacity threshold is exceeded. Expansion to 16 is expected.
     */
    @Test
    public void testCapacityAfterExtend() {
        //Given
        MyArrayList<Integer> actualList = arrayList;
        actualList.add(8);
        actualList.add(8);
        actualList.add(8);
        actualList.add(8);
        actualList.add(8);
        actualList.add(8);
        actualList.add(8);
        actualList.add(8);
        //When
        int result = actualList.capacity();
        int expected =(10 * 3) / 2 + 1;
        //Then
        assertEquals(expected, result);
    }
    /**
     *  Check for capacity, when the capacity threshold is exceeded second time. Expansion to 25 is expected.
     */
    @Test
    public void testCapacitySecondExtend() {
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>();
        actualList.add(1);
        actualList.add(2);
        actualList.add(3);
        actualList.add(4);
        actualList.add(5);
        actualList.add(6);
        actualList.add(7);
        actualList.add(8);
        actualList.add(9);
        actualList.add(10);
        actualList.add(11);
        actualList.add(12);
        actualList.add(13);
        actualList.add(14);
        actualList.add(15);
        actualList.add(16);
        actualList.add(17);
        //When
        int result = actualList.capacity();
        int expected =(16 * 3) / 2 + 1;
        //Then
        assertEquals(expected, result);
    }

}
