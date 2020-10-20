package com.appslab;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args)
    {
        Student first     = new Student("Mickley", 133789);
        Student second    = new Student("Luky",165811);
        System.out.println(first.toString());
        System.out.println(second.toString());
    }

}
