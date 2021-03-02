package com.inheritance.inheritanceAssignment;

public class Trainee extends Employee{
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.basicSalary=basicSalary;
    }
}

