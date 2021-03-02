package com.inheritance.inheritanceAssignment.empRetrieve;

public class HourlyEmployee extends  Employee{
    double hours;
    double wage;

    public HourlyEmployee() {
        this.hours = 0.0;
        this.wage = 0.0;
    }

    public HourlyEmployee(String fName, String lName, double hrs, double sal) {

        super(fName, lName);
        this.hours = hrs;
        this.wage = sal;

    }

    @Override
    public void showName() {
        super.showName();
        System.out.println("Salary for hourly pay: "+ hours*wage);
    }
}
