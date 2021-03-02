package com.inheritance.inheritanceAssignment;

public class InheritanceActivity {

    public static void main(String[] args)
    {//Testcase 1
        Manager m1=new Manager(126534,"Peter","Chennai India",237844,65000);
        System.out.println("Manager salary "+m1.calculateSalary());
        System.out.println( "Manager Transport alloawance "+m1.calculateTransportAllowance());
//testcase 2
        Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000);
        System.out.println("Trainee salary "+trainee.calculateSalary());
        System.out.println( "Trainee Transport alloawance "+trainee.calculateTransportAllowance());


    }


}
