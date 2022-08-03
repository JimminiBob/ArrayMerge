package com.sparta.jn;

import java.util.Arrays;

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
    }
}
