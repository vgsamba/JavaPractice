package com;

public class Employee {
    int id;
    String fistName;
    String lastName;
    int salary;
    String name;

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Vihaan", "vennu", 70000);
        System.out.println("May name is " + e1.getName());
        System.out.println("Salary "+e1.getSalary()+" ");
        System.out.println("Anual salary "+ e1.getAnualSalary());
        System.out.println("Raised salary " + e1.raiseSalary(10));
        System.out.println(e1.toString());
    }

    public Employee(int id, String fistName, String lastName, int salary) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getName() {
        name = fistName +" "+ lastName;
        return name;
    }
    public int getAnualSalary() {
        int anSalary = salary * 12;
        return anSalary;

    }

    public int raiseSalary(int percent) {
        int percentsalary = salary * percent;
        int new_salary = salary + percentsalary;
        return new_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
