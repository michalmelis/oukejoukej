package com.appslab;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        String a = "bummub";
        System.out.println(Arrays.toString(checkPalindrome(new char[]('')));
    }
    public static boolean checkPalindrome(String[] a)
    {
        for (int i = 0; i < a.length/2; i++)
        {
            if (a[i] == a[a.length-1-i]) {
                return false;
            }


        }
        return true;

    }
}
