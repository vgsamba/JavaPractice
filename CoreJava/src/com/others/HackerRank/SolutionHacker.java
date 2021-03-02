package com.others.HackerRank;

import java.util.Scanner;


public class SolutionHacker {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();


        for (int j = 0; j <= count ; j++) {

            //Scanner sc = new Scanner(System.in);
            String myString = sc.nextLine();
            if(myString.length() > 0) {
                char[] myCharArray = myString.toCharArray();
                for (int i = 0; i < myString.length(); i++) {

                    if (i % 2 == 0) {
                        System.out.print(myCharArray[i]);
                    }
                }
                System.out.print(" ");
                for (int i = 0; i < myString.length(); i++) {

                    if (i % 2 != 0) // Print each sequential character on the same line
                    {
                        System.out.print(myCharArray[i]);
                    }
                }
                System.out.println();
            }
        }


    }
}
