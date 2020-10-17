package com.appslab;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
       int largeArray[] = {5,4,6,8,84,8474,585,65,84,9,15,35,44,27,82,94};
       int smallest = largeArray[0];
       int largest  =  largeArray[0];

       for(int i = 0; i < largeArray.length; i++)
       {
           if (largeArray[i] < smallest) smallest = largeArray[i];
           if (largeArray[i] > largest) largest = largeArray[i];
       }

       System.out.println(smallest+largest);

    }
}
