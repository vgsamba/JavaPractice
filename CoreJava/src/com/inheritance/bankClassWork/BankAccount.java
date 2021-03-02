package com.inheritance.bankClassWork;

public class BankAccount {

    public int balance;
    public int withdrawAmount;
    public int depositAmount;
    protected double interestRate=9.5;

    public void depositMoney(){
        System.out.println("Depositing Rs "+depositAmount+" into your account");
    }

    public void withdrawMoney(){
        balance=depositAmount-withdrawAmount;
        System.out.println("Withdrawing Rs "+withdrawAmount+" from your account");
        System.out.println("Balance amount in your account is"+balance);
    }

}

/*
public class BankAccount {
    public int balance;
    public int withdrowAmt;
    public int depositAmt;
    protected  double interestRate=9.5;

    public  void depositMoney()
    {
        System.out.println("Deposit RS"+depositAmt+"into yor account");
    }
    public  void withdrawmoney()
    {
        balance=depositAmt+withdrowAmt;
        System.out.println("withrowing rs"+withdrowAmt+"from your account");
        System.out.println("balance amount"+balance);
    }
}
*/
