package com.appslab;

public class Main {

    public static void main(String[] args)

    {
        Student joke1 = new Student("John", 12345,"+421950867777", "Bratislava" );
        Student joke2 = new Student("Sam", 12345,"+421950867789","Martin");

        System.out.println(joke1.toString());
        System.out.println(joke2.toString());
    }

}
