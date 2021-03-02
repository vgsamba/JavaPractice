package com.inheritance.inheritanceAssignment.personEmpStu;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    String streetAddress;
    long zipcode;
    long phonenumber;

    public Person() {
    }

    public Person(String firstName, String lastName, String streetAddress, long zipcode, long phonenumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.zipcode = zipcode;
        this.phonenumber = phonenumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
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

}

    public String display() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", zipcode=" + zipcode +
                ", phonenumber=" + phonenumber
                ;
    }

}
