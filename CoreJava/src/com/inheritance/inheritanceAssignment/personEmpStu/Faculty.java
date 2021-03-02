package com.inheritance.inheritanceAssignment.personEmpStu;

import java.util.Scanner;

public class Faculty extends CollegeEmployee{
    boolean facultyTenure; //that indicates whether the Faculty member is tenured

    public Faculty(){

    }
    public Faculty(String firstName, String lastName, String streetAddress, long zipcode, long phonenumber,
                   long ssn, double anualSal, String departmentName, boolean facultyTenure) {
        super(firstName, lastName, streetAddress, zipcode, phonenumber, ssn, anualSal, departmentName);
        this.facultyTenure = facultyTenure;
    }

    public boolean isFacultyTenure() {
        return facultyTenure;
    }

    public void setFacultyTenure(boolean facultyTenure) {
        this.facultyTenure = facultyTenure;
    }

    public void setDisplay()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("What a name?");
        firstName= sc.nextLine();
        System.out.println("What a last name?");
        lastName = sc.nextLine();
        System.out.println("What a streetAdress?");
        streetAddress = sc.nextLine();
        System.out.println("What a zipcode?");
        zipcode = sc.nextLong();
        System.out.println("What a phonenumber?");
        phonenumber = sc.nextLong();
        System.out.println("What a SSN?");
        ssn = sc.nextLong();
        System.out.println("What a anunualSalary?");
        anualSal = sc.nextDouble();
        System.out.println("What a departmentName?");
        departmentName = sc.nextLine();
        System.out.println("What a facultyTenure (True or False?");
        facultyTenure = sc.nextBoolean();
    }

    @Override
    public String display(){
        return super.display()+
                ", facultyTenure=" + facultyTenure;
    }
}
