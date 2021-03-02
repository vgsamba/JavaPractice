package com.others.HackerRank;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

    String myString=sc.next();

    char[] myCharArray = myString.toCharArray();


    int arrlen=myCharArray.length;
        for(int j=arrlen; j>0; j--) {
            System.out.print(myCharArray[j-1]);
    }
}
}


