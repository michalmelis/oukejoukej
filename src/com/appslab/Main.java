package com.appslab;
import java.lang.String;

public class Main
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }

}
