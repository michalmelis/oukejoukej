package com.appslab;
import java.lang.String;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getEmployee());

    }
    public static String getEmployee(){
        JobPosition jobPosition = new JobPosition("IT programmer", 2100);
        Calendar calendar = new GregorianCalendar(2002,5,15);
        Employee employee = new Employee("Mickley", "Mrkvička", calendar,jobPosition);
         return employee.getName() + " " +  employee.getSurname() + ", "+jobPosition.getName() + ", "+"salary:" + jobPosition.getSalary();

    }

}
