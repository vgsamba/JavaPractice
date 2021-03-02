package com.others.HackerRank;

import java.util.Scanner;

//import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class ReverseArray {
    public static void main(String[] args) {

       System.out.println("Enter the number of elements you want to store:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arra=new int[n];

        System.out.println("enter array elemnts");
        for(int i=0;i<n;i++)//reading array input from users.
        {
            arra[i]=sc.nextInt();
        }
       System.out.print("u entered:  ");

       //int[] arra = {10, 20, 30}; //predefined array instead of taking from user
        int arrlen = arra.length;
        for (int j=arrlen; j>0; j--) { //Reverse the array values while printing
            System.out.print(arra[j-1]+" "); // use println instead of print if we want each array values in new line

        }
    }
}