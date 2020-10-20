package com.appslab;
import java.lang.String;

public class Main
{
    public static void main(String[] args) {
        System.out.println( calculateBudget(getPeople()));
    }

    public static int calculateBudget(Person[] people){
        int totalBudget = 0;
        for (Person p:people){
            totalBudget += p.getBudget();
        }
        return totalBudget;
    }
    public static Person[] getPeople() {
        Person person1 = new Person("Mymaan", 21, 29000);
        Person person2 = new Person("Nowaay", 32, 32000);
        Person person3 = new Person("Yos", 16, 1600);
        return new Person[]{person1, person2, person3};
    }

}
