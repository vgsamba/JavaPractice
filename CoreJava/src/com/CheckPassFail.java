package com;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = 49;   // Set the value of "mark" here!
        System.out.println("The pass mark is " + mark);
        System.out.println("Enter your score");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // if-else statement
        if (score >= mark) {
            System.out.println("You have passed");
        } else {
            System.out.println("you have failed");
        }
        System.out.println("Keep working hard");
    }
}
