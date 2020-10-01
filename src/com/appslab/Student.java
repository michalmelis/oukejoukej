package com.appslab;

public class Student
{
  private int studentNumber;
    private String name;



    public Student(String name, int studentNumber)
    {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return name + ":" + studentNumber;
    }
}


