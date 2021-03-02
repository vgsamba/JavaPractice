package com.abstractionWork;

public class MinFilleTest {
    public static void main(String[] args)
    {

//Emplyee empObj = new Emplyee("John","Boulevard",90082); /* This instantiation throws error as
// abstract class cannot be instantiated */
        Salary sal=new Salary("Vihaan","mo",1234,123455);
        Emplyee em=new Salary("Sudhee","mo",1234,123456);
        System.out.println("Calling mail check using Salary reference");
        sal.checkMail();

        System.out.println("\nCalling mail check using employee reference");
        em.checkMail();
    }
}
/*
Here, we instantiate two Salary objects. One using a Salary reference s, and the other using an Employee
        reference e.While invoking s.checkMail(), the compiler sees checkMail() in the Salary
class at compile time, and the JVM invokes mailCheck() in the Salary class at run time.
        checkMail() on e is quite different because e is an Employee reference.
        When the compiler sees e.checkMail(), the compiler sees the checkMail() method in the Employee class.
        Here, at compile time, the compiler used mailCheck() in Employee to validate this statement.
        At run time, however, the JVM invokes checkMail() in the Salary class.*/
