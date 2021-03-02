package com.oops.cognizantTax;

public class TaxCalculator {
    float basicSalary;
    boolean citizenship;
    int nettSalary;
    float tax;

    public TaxCalculator(float basicSalary, boolean citizenship) {
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;
    }

    public void calculateTax()//Problem Statement 2: Usage of Arithmetic operators.
    {
        tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee  for  the basic Salary of " + (int) basicSalary + " is " + (int) tax);
    }

    public void deductTax()//Problem Statement 3: How to type cast?
    {
        int nettSalary = (int) (basicSalary - tax);                          //reduce basic salary
        System.out.println("The net salary of the employee is : " + nettSalary);

    }

    public void validateSalary() {
        if (basicSalary > 100000 && citizenship) {
            System.out.println("The salary and citizenship eligibility:  true");
            return;
        }
            System.out.println("The salary and citizenship eligibility:  false");

    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Boolean getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Boolean citizenship) {
        this.citizenship = citizenship;
    }

    public int getNettSalary() {
        return nettSalary;
    }

    public void setNettSalary(int nettSalary) {
        this.nettSalary = nettSalary;
    }
}


// Statement 4: Usage of relational operator

