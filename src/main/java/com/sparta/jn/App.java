package com.sparta.jn;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] myArr1 = {1,4,8,13,17,23};
        int[] myArr2 = {5,9,14,19,21,33,37,46};


        System.out.println(Arrays.toString(ArrayMerger.merge(myArr1,myArr2)));

        int[] ints1 = new int[10];
        Random rand = new Random();
        for(int elements: ints1) {
            elements = rand.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(ints1));
    }
}
