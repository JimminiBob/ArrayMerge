package com.sparta.jn;

public class BubbleSort {
    static int[] intArraySorter(int[] arrayIn) {
        int[] arrayOut = arrayIn;
        int length = arrayIn.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayOut[j] > arrayOut[j+1]) {
                    int temp = arrayOut[j];
                    arrayOut[j] = arrayOut[j+1];
                    arrayOut[j+1] = temp;
                }
            }
        }
        return arrayOut;
    }
}
