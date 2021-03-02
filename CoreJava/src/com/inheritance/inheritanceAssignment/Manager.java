package com.inheritance.inheritanceAssignment;

public class Manager extends Employee{

    public Manager() {
        basicSalary=0.0;
    }

    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);//ask about contructor parameters n instance variables
        this.basicSalary=salary;

    }


    public double calculateTransportAllowance()
    {
        double transportAllowance = 15*basicSalary /100;
        double salwithallowance=basicSalary+transportAllowance;
        return salwithallowance;
    }


}
