package com.inheritance.inheritanceAssignment.personEmpStu;

import java.util.Scanner;

public class Student extends Person{
    String major;
    double gpa;

    public Student ()
    {

    }
    public Student(String firstName, String lastName, String streetAddress, long zipcode, long phonenumber, String major, double gpa) {
        super(firstName, lastName, streetAddress, zipcode, phonenumber);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setDisplay()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What a major?");
        major = sc.nextLine();
        System.out.println("What a gpa?");
        gpa = sc.nextDouble();
    }
   public String display()
   {
       return super.display()+
               ", major= " + major+
               ", gpa= "+gpa ;

   }
}
