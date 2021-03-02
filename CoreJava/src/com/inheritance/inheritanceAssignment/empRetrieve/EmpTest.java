package com.inheritance.inheritanceAssignment.empRetrieve;

import java.util.Scanner;

public class EmpTest {
    public static void main(String[] args) {
        //Employee e1=new Employee("vanita","samba");
        Employee e1 = new Employee();
        //e1.callName();
        //e1.showName();
        RegularEmployee r1 = new RegularEmployee("me", "you", 123345);
        // r1.showName();
        HourlyEmployee h1 = new HourlyEmployee("cv", "dsf", 10, 2000);
        // h1.showName();
        int[] ea = new int[2];


        System.out.println("enter a choice");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();

        /*for (int i = 0; i < ea.length; i++) {
            System.out.println("hi");
            e1.callName();
            e1.showName();
        }*/
        switch (option) {
            case "apple":

                System.out.println("success");
                // Employee e1=new Employee("vanita","samba");
                //e1.showName();
                // Employee e1=new Employee();
                for (int i = 0; i < ea.length; i++) {
                    System.out.println("hi");
                    e1.callName();
                    e1.showName();

                }

                break;


            case "h":
                h1.showName();
                break;

            case "r":
                r1.showName();
                break;

        }

    }
}
