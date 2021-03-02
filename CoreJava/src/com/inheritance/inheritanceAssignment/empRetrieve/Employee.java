package com.inheritance.inheritanceAssignment.empRetrieve;


import java.util.Scanner;

//class called Employee
public class Employee {
    String firstName;
    String lastName;

    //constructor of the class
    public Employee()
    {
        firstName = "";
        lastName = "";
    }

    //We have the second contructor - Accept input from the user

    public Employee(String fName,String lName)
    {
        firstName = fName;
        lastName = lName;
    }
public void callName()
{
    System.out.println("enter your name");
    Scanner emp=new Scanner(System.in);
    firstName= emp.next();
    lastName=emp.next();
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // method to display the fistName and Last Name of employee
    public void showName()
    {
        System.out.println("Name : "+firstName+" "+lastName);
    }
}