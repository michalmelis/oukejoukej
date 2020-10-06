package com.appslab;

public class Student
{
  private int studentNumber;
    private String phoneNumber;
    private String name;
    private String address;


    public Student(String name, int studentNumber, String phoneNumber, String address)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

    @Override
    public String toString() {
        return name + ": " + studentNumber +" "+ phoneNumber +" "+ address;
    }
}


