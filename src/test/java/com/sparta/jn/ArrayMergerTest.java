package com.sparta.jn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayMergerTest {
    @Test
    @DisplayName("Merges two sorted arrays and returns a merged sorted array")
    void mergesTwoSortedArraysAndReturnsAMergedArray() {
        int[] ints1 = {2, 14, 22, 23, 65, 99};
        int[] ints2 = {9, 11, 32, 46, 62, 100, 929};
        int[] expected = {2, 14, 22, 23, 65, 99, 9, 11, 32, 46, 62, 100, 929};
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, ArrayMerger.merge(ints1, ints2));
    }

     @Test
     @DisplayName("Merges two negative numbers array and returns a merged sorted array")
     void mergesTwoNegativeNumbersArrayAndReturnsAMergedSortedArray() {
         int[] ints1 = {-122, -98, -88, -53, -42};
         int[] ints2 = {-200, -152,-72, -41, -12};
         int[] expected = {-122, -98, -88, -53, -42, -200, -152,-72, -41, -12};
         Arrays.sort(expected);
         Assertions.assertArrayEquals(expected, ArrayMerger.merge(ints1, ints2));

     }
}
