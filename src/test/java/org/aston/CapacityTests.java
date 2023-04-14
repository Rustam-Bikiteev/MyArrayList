package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты на проверку метода capacity.
 */
public class CapacityTests {

    /**
     * Проверка на емкость до превышения порога, при котором она должна расшириться.
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
     * Проверка на емкость, при отсутствии элементов.
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
     * Проверка на емкость, при превышении заданного количества элементов (10). Ожидается расширение до 16.
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
     * Проверка на емкость, при превышении заданного количества элементов второй раз (16). Ожидается расширение до 25.
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
