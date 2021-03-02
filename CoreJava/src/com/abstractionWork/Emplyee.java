package com.abstractionWork;

public abstract class Emplyee {
    private String name;
    private String address;
    private int number;

    public Emplyee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
public abstract double computePay();

    public void checkMail()
    {
        System.out.println("Mailing from employee class "+this.name+" at "+this.address); //what ahppens if we use getname()instead of this.name
    }//Ans: its the same;

    @Override
    public String toString() {
        return "Emplyee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
