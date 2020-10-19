package com.appslab;

public class Main {

    public static void main(String[] args) {
        String rook1 = "A5";
        String rook2=  "B5";
        System.out.println(canCapture(rook1,rook2));

    }

    public static boolean canCapture(String a, String b) {

        {
            if (a.charAt(0) == b.charAt(0) || a.charAt(1) == b.charAt(1))
            {
                return true;
            }
            return false;
        }
    }
}

