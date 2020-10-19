package com.appslab;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args)
    {
        String test = "jej";
        System.out.println(checkPalindrome(test));
    }
    public static boolean checkPalindrome(String a)
    {
        for (int i = 0; i < a.length()/2; i++)
        {
            if (a.charAt(i) != a.charAt(a.length()-1-i)) {
                return false;
            }


        }


        return true;

    }
}
