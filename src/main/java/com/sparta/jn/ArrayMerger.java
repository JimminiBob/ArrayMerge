package com.sparta.jn;

public class ArrayMerger {

    static int[] merge(int[] array1, int[] array2) {

        int[] returnArr = new int[array1.length + array2.length];
        if (isAscendingOrder(array1) && isAscendingOrder(array2)) {

            int arr1Pointer = 0, arr2Pointer = 0, returnArrPointer = 0;

            while (arr1Pointer < array1.length-1 && arr2Pointer < array2.length-1) {

                if (array1[arr1Pointer] < array2[arr2Pointer]) {
                    returnArr[returnArrPointer] = array1[arr1Pointer];
                    arr1Pointer++;
                } else {
                    returnArr[returnArrPointer] = array2[arr2Pointer];
                    arr2Pointer++;
                }
                returnArrPointer++;
            }

            if (arr1Pointer < arr2Pointer) {
                for (int i = arr2Pointer; i < array2.length-1 ; i++) {
                    returnArr[returnArrPointer] = array2[arr2Pointer];
                    arr2Pointer++;
                }
            } else {

            }

        }
        return returnArr;

    }
    private static boolean isAscendingOrder(int[] arrayIn) {

        for (int i = 0; i < arrayIn.length - 1; i++) {
            if (arrayIn[i] > arrayIn[i + 1])
                return false;
        }
        return true;
    }


}
