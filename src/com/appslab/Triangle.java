package com.appslab;

public class Triangle {
    private int a;
    private int b;
    private int c;


    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public int getPerimeter() {
        return (a+b+c);
    }

    public Triangle(int a,int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }


}
