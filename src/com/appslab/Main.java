package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        String str1 = "bumbum";
        String str2 = "bum";
        System.out.println(endsWith(str1,str2));

    }
    public static boolean endsWith(String str1, String str2)
    {
     return (str1.endsWith(str2));
    }
}

