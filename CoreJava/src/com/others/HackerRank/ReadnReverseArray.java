package com.others.HackerRank;
import java.util.*;

public class ReadnReverseArray {

    /* function that reverses array and stores it
      in another array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }*/

    public static void main(String[] args)
    {


       System.out.println("Enter the number of elements you want to store:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("enter array elemnts");
        for(int i=0;i<n;i++)//reading array input from users.
        {
            arr[i]=sc.nextInt();
       }


        System.out.println("u entered");


       // int [] arr = {10, 20, 30, 40, 50};
        //reverse(arr, arr.length);
        int arrlen=arr.length;
        int[] b = new int[arrlen];
        int j = arrlen;
        for (int i = 0; i < arrlen; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < arrlen; k++) {
            System.out.println(b[k]);
        }
    }
}
