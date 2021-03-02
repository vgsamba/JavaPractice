package com.abstractionWork;

public class Salary extends Emplyee{
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;//setSalary(salary);
    }

    public void setSalary(double newsalary) {
        if(newsalary>=0.0)
            salary=newsalary;
    }

    @Override
    public double computePay() {

        System.out.println("computing salary pay from salary class "+getName());
        return salary/52;
    }
}
