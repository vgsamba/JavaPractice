package com.inheritance.inheritanceAssignment.personEmpStu;

import java.util.Scanner;

public class CollegeEmployee extends Person {
    long ssn;
    double anualSal;
    String departmentName;

    public CollegeEmployee()
    {

    }
    public CollegeEmployee(String firstName, String lastName, String streetAddress, long zipcode, long phonenumber, long ssn, double anualSal, String departmentName) {
        super(firstName, lastName, streetAddress, zipcode, phonenumber);
        this.ssn = ssn;
        this.anualSal = anualSal;
        this.departmentName = departmentName;
    }

    public long getssn() {
        return ssn;
    }

    public void setssn(long ssn) {
        this.ssn = ssn;
    }

    public double getAnualSal() {
        return anualSal;
    }

    public void setAnualSal(double anualSal) {
        this.anualSal = anualSal;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
        System.out.println("What a departmentName?");
        departmentName = sc.nextLine();
        System.out.println("What a anunualSalary?");
        anualSal = sc.nextDouble();

    }
    @Override
    public String display(){
        return super.display()+
                ", annualSalary=" + anualSal +
                ", departmentName=" + departmentName +
                ", ssn=" + ssn ;

    }


}
