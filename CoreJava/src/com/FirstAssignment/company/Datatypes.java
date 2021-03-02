package com.FirstAssignment.company;


import java.util.*;

public class Datatypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
       // System.out.println("enter");
       // int num=scan.nextInt();


        /* Read and save an integer, double, and String to your variables.*/
        int num1=scan.nextInt();
        double num2=scan.nextDouble();
        String s1=scan.next();
        String s2=scan.nextLine();// now next() will read the first token after the end of nextInt() , in this case the first token is “Java” .
        // And after that the nextLine() reads till the end of the line.

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+num1);

        /* Print the sum of the double variables on a new line. */
        System.out.println(i+num2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+s1+s2);
        scan.close();
    }
}