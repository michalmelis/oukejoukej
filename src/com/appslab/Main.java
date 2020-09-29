package com.appslab;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isTriangle(1,2,3));
    }
    public static boolean isTriangle(int a, int b, int c)
    {
        return (a+b)>c;
    }

}
