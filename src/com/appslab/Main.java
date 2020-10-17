package com.appslab;

public class Main {


    public static void main(String[] args)
    {
        System.out.println(equalSlices(25,4,1));
    }
    public static boolean equalSlices(int totalSlices, int  recipient, int slicesEach)
    {
        return totalSlices >= slicesEach*recipient;
    }

}
