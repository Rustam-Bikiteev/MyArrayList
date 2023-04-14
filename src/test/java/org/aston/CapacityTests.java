package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты на проверку метода capacity.
 */
public class CapacityTests {

    /**
     * Check for capacity before exceeding the extending threshold (initial value - 10)
     */
    @Test
    public void testCapacityBeforeExtend() {
        //Given
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        //When
        int result = arrayList.capacity();
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
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        //When
        int result = arrayList.capacity();
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
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        //When
        int result = arrayList.capacity();
        int expected =(16 * 3) / 2 + 1;
        //Then
        assertEquals(expected, result);
    }

}
