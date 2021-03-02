package com.inheritance.inheritanceAssignment.personEmpStu;

import java.util.Scanner;

public class CollegeList {

    public static void main(String[] args) {

        int[] ceCount = new int[4];
        int[] stCount = new int[2];//7
        int[] fCount = new int[3];//3


        //Person p1=new Person();
        CollegeEmployee ce = new CollegeEmployee();
        Faculty f1 = new Faculty();
        Student st = new Student();

        System.out.println("which type of person's data do you want to enter (“C”, “F”, or “S”), or you can quit (“Q”)");
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.next();

        switch (userChoice) {
            case "C":
                for (int i = 1; i <= ceCount.length; i++) {
                    System.out.println("Hi there, please enter ur details");
                    ce.setDisplay();

                }
                ce.display();
                break;
            case "F":
                for (int i = 1; i <= fCount.length; i++) {

                    f1.setDisplay();
                    f1.display();

                }
                break;
            case "S":
                for (int i = 1; i <= stCount.length; i++) {

                    st.setDisplay();
                    st.display();

                }
                break;
            case "Q":
                ce.display();
                f1.display();
                st.display();
                break;

        }
    }


}
