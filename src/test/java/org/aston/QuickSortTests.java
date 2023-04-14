package org.aston;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * ����� �� �������� ������ QuickSort.
 */
public class QuickSortTests {

    /**
     * �������� �������� ������. ��������� ������������� ������.
     */
   @Test
    public void testQuickSort(){
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>(new Integer[]{10,9,8,7,6,1,2,3,4,5});
        Integer[] actualArray = new Integer[actualList.size()];
        //When
       MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        Integer[] expectedArray = new Integer[expectedList.size()];
        MyArrayList<Integer> result = QuickSort.quickSort(actualList,0, actualList.size()-1);
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), result.toArray(actualArray));
    }

    /**
     * �������� ������ � ����� ���������. ��������� ������ � ����� ���������.
     */
    @Test
    public void testQuickSortWithOneValue(){
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>(new Integer[]{10});
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{10});
        Integer[] expectedArray = new Integer[expectedList.size()];
        MyArrayList<Integer> result = QuickSort.quickSort(actualList,0, actualList.size()-1);
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), result.toArray(actualArray));
    }
    /**
     * �������� ������� ������. ��������� ������ ������.
     */
    @Test
    public void testQuickSortWithZeroValue(){
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>(new Integer[]{});
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{});
        Integer[] expectedArray = new Integer[expectedList.size()];
        MyArrayList<Integer> result = QuickSort.quickSort(actualList,0, actualList.size()-1);
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), result.toArray(actualArray));
    }
    /**
     * �������� ������ �� ����� ����������� ����������. ��������� ������ �� ����� ����������� ����������.
     */
    @Test
    public void testQuickSortWithAllSameValues(){
        //Given
        MyArrayList<Integer> actualList = new MyArrayList<>(new Integer[]{10,10,10,10,10,10,10,10,10,10});
        Integer[] actualArray = new Integer[actualList.size()];
        //When
        MyArrayList<Integer> expectedList = new MyArrayList<>(new Integer[]{10,10,10,10,10,10,10,10,10,10});
        Integer[] expectedArray = new Integer[expectedList.size()];
        MyArrayList<Integer> result = QuickSort.quickSort(actualList,0, actualList.size()-1);
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), result.toArray(actualArray));
    }

    /**
     * �������� ������ �� ��������. ��� ��� ����� comareTo �������� �������������� � ��������, �� ������� ����������� ��������� �����, ����� ��������.
     * ��������� ����� ����� � ���������� �������.
     */
    @Test
    public void testQuickSortWithStringValue(){
        //Given
        MyArrayList<String> actualList = new MyArrayList<>(new String[]{"I","love","to","code","in","Java","and","JUnit","it","is","cool"});
        String[] actualArray = new String[actualList.size()];
        //When
        MyArrayList<String> expectedList = new MyArrayList<>(new String[]{"I","JUnit","Java","and","code","cool", "in","is","it","love","to"});
        String[] expectedArray = new String[expectedList.size()];
        MyArrayList<String> result = QuickSort.quickSort(actualList,0, actualList.size()-1);
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), result.toArray(actualArray));
    }

    /**
     * �������� ������ � ���������. ��������� ����� �������� � ���������� �������.
     */
    @Test
    public void testQuickSortWithCharValue(){
        //Given
        MyArrayList<Character> actualList = new MyArrayList<>(new Character[]{'k','j','c','a','b','g','h','i','d','e','f'});
        Character[] actualArray = new Character[actualList.size()];
        //When
        MyArrayList<Character> expectedList = new MyArrayList<>(new Character[]{'a','b','c','d','e','f', 'g','h','i','j','k'});
        Character[] expectedArray = new Character[expectedList.size()];
        MyArrayList<Character> result = QuickSort.quickSort(actualList,0, actualList.size()-1);
        //Then
        assertArrayEquals(expectedList.toArray(expectedArray), result.toArray(actualArray));
    }



}
