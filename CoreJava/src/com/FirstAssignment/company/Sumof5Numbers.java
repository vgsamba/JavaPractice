package com.FirstAssignment.company;

public class Sumof5Numbers {
    public static void main(String[] args)
    {
        int n=5;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Numbers considered "+i);
            sum=sum+i;
        }
        System.out.println("Sum is"+ sum);
    }
}
