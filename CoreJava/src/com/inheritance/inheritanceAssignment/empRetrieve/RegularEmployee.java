package com.inheritance.inheritanceAssignment.empRetrieve;

public class RegularEmployee extends Employee{
    double basic;

    public RegularEmployee()
    {
        firstName=""; //Base class can also be re initialized
        lastName="";
        basic=0.0;
    }
    public RegularEmployee(String fName, String lName, double sal)
    {
        firstName=fName;
        lastName=lName;
        basic=sal;
    }

    @Override
    public void showName() {
        super.showName();
        System.out.println("basic salary: "+basic);
    }
}
