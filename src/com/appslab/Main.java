package com.appslab;


import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(multiplyByLength(new int[]{21, 54, 18, 523})));
    }
    public static int[] multiplyByLength(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array.length;
        }
        return array;
    }
}
