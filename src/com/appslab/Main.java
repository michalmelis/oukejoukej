package com.appslab;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
       int largeArray[] = {5,4,6,8,84,8474,585,65,84,9,15,35,44,27,82,94};
       int answer = findMaxMin(largeArray);
       System.out.println(answer);
    }

    public static int findMaxMin(int[] array) {
        int smallest = array[0];
        int largest = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < smallest) smallest = array[i];
            if (array[i] > largest)   largest = array[i];
        }
        return smallest + largest;
    }
}
