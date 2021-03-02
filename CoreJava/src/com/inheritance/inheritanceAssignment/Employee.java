package com.inheritance.inheritanceAssignment;

public class Employee {
    private long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

   public Employee() {
    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
        employeeId = employeeId;
        this.employeeName = employeeName;//this keyword refers to the current class instance variables
        // The most common use of the this keyword is to eliminate the confusion between class attributes
        // and parameters with the same name
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public void setSpecialAllowance(double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double calculateSalary  ()
    {
        double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
        return salary;


    }
public double calculateTransportAllowance()
{
    double transportAllowance = basicSalary*10/100;
    double salwithallowance=basicSalary+transportAllowance;
    return salwithallowance;
}

}