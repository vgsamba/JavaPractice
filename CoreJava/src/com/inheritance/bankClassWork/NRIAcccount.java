package com.inheritance.bankClassWork;

public class NRIAcccount extends BankAccount {
    public void applyFixedDeposit()
    {
        super.interestRate=6.5;
        System.out.println("Fixed deposit rate is "+interestRate+" for an NRI account");
        System.out.println("");
    }
}