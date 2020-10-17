package com.appslab;

public class Main
{

    public static void main(String[] args)
    {
        int cisielka[] = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int iGotIt = warOfNumbers(cisielka);
        System.out.println(iGotIt);
    }
    public static int warOfNumbers(int[] numbers)
    {
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (isItOdd(numbers[i])) {
                sumOdd += numbers[i];
            }
            else {
                sumEven +=  numbers[i];
            }
        }
        return Math.abs(sumEven - sumOdd);
    }
    public static boolean isItOdd(int number){
        if (number % 2 == 0)
            return false;

        return true;
    }
}
