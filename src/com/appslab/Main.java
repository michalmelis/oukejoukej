package com.appslab;

public class Main {

    public static void main(String[] args)
    {
        double heightOfstep = 0.2 ;
        double lengthOfstep = 0.4;
        double towerHeight = 100.00;
        double totalDistance = (towerHeight/heightOfstep) * (lengthOfstep + heightOfstep);
        System.out.println(totalDistance);
    }
}
