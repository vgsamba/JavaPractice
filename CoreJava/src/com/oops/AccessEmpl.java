package com.oops;

public class AccessEmpl {
    public static void main(String[] args) {
        EmpClas e1 = new EmpClas();
        e1.empNAme = "apple";
        e1.empSal = 30;
        e1.empAge = 4500;
        EmpClas e2 = new EmpClas();
        e2.empNAme = "apple1";
        e2.empSal = 35;
       // e2.empAge = 4500;
        e2.setEmpAge(4500);


        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }

    //e1.callempdetails();
/* System.out.println(e1.getEmpNAme());
System.out.println(e1.getEmpAge());
System.out.println(e1.getEmpSal());*/
}
/*
    package com.oops.trial;

    public class TestEmployee {

        public static void main(String[] args) {

            Employee e1 = new Employee();
            e1.setName("Raju");
            e1.setAge(20);
            e1.setSalary(2000);

            System.out.println(e1.toString());

            Employee e2 = new Employee();
            e2.setName("Ram");
            e2.setAge(40);
            e2.setSalary(3000);

            System.out.println(e2.toString());


        }

    }*/