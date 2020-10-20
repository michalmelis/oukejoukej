package com.appslab;

public class Student
{
    private  String name;
    private int studentNumber;



    public Student(String name, int studentNumber)
    {
    this.name = name;
    this.studentNumber= studentNumber;
    }
    @Override
    public String toString() {
          return name + ": " + studentNumber;
    }
}
