package com.oops;

public class AccessEmp {
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.empNAme="apple";
        e1.empSal=30;
        e1.empAge=4500;
        Employee e2=new Employee();
        e2.empNAme="apple";
        e2.empSal=35;
        e2.empSal=45678;


        e1.callempdetails();
        e2.callempdetails();

    }

}
