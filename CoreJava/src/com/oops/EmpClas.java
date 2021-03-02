package com.oops;

public class EmpClas {
    String empNAme;
    int empSal;
    int empAge;

    public String getEmpNAme() {
        return empNAme;
    }

    public void setEmpNAme(String empNAme) {
        this.empNAme = empNAme;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "EmpClas{" +
                "empNAme='" + empNAme + '\'' +
                ", empSal=" + empSal +
                ", empAge=" + empAge +
                '}';
    }
}
